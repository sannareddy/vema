package edu.vemaschools.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.event.AuthenticationFailureBadCredentialsEvent;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import edu.vemaschools.components.AuthFailureHandler;
import edu.vemaschools.components.AuthSuccessHandler;

@Configuration
@EnableWebSecurity
@ComponentScan(basePackages="edu.vemaschools")
public class SpringSecurityConfigurer extends WebSecurityConfigurerAdapter{
	
	private DataSource dataSource;
	private PasswordEncoder passwordEncoder;
	private AuthSuccessHandler authSuccessHandler;
	private AuthFailureHandler authFailureHandler;
	public PasswordEncoder getPasswordEncoder() {
		return passwordEncoder;
	}
	@Autowired
	public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
		this.passwordEncoder = passwordEncoder;
	}
	public DataSource getDataSource() {
		return dataSource;
	}
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public AuthSuccessHandler getAuthSuccessHandler() {
		return authSuccessHandler;
	}
	@Autowired
	public void setAuthSuccessHandler(AuthSuccessHandler authSuccessHandler) {
		this.authSuccessHandler = authSuccessHandler;
	}
	
	public AuthFailureHandler getAuthFailureHandler() {
		return authFailureHandler;
	}
	@Autowired
	public void setAuthFailureHandler(AuthFailureHandler authFailureHandler) {
		this.authFailureHandler = authFailureHandler;
	}
	@Bean 
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//auth.inMemoryAuthentication().withUser("vamsi").password("vamsi").roles("SUPERUSER");
		auth.jdbcAuthentication()
			.usersByUsernameQuery("SELECT username,password,status as enabled FROM APP_USERS WHERE username = ? ")
			.authoritiesByUsernameQuery("SELECT users.username as username,roles.role_name as role FROM APP_USER_ROLES ur INNER JOIN APP_USERS users ON ur.userid=users.userid INNER JOIN APP_ROLES roles ON ur.roleid=roles.roleid WHERE users.username= ?")
			.dataSource(dataSource);
	}
	
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/lib/**","/images/**","/open/**","/global/**","/node/**");
	} 

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		/*http.logout().logoutUrl("/logout")
			.logoutSuccessUrl("/login")
			.invalidateHttpSession(true);*/
		
		http.authorizeRequests()
			.antMatchers("/secured/**").fullyAuthenticated()
			.antMatchers("/admin/**").hasRole("ADMIN")
			.anyRequest().fullyAuthenticated()
			.and()
			.formLogin()
				.loginPage("/login")
				.loginProcessingUrl("/authenticate")
				.usernameParameter("username")
				.passwordParameter("password")
				.successHandler(authSuccessHandler)
				.permitAll()
				.and()
			.logout()
				.logoutUrl("/logout")
				.logoutSuccessUrl("/login")
				.deleteCookies("JSESSIONID")
				.invalidateHttpSession(true)
				.permitAll();
		http.csrf().disable();
	}
	
}

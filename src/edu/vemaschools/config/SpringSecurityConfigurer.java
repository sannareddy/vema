package edu.vemaschools.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfigurer extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("vamsi").password("vamsi").roles("SUPERUSER");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/").permitAll()
			.antMatchers("/lib/**").permitAll()
			.antMatchers("/images/**").permitAll()
			.antMatchers("/open/**").permitAll()
			.antMatchers("/secured/**").fullyAuthenticated()
			.antMatchers("/admin/**").hasRole("ADMIN")
			.anyRequest().authenticated().and().httpBasic();
	}
	
}

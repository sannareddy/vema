package edu.vemaschools.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;
@Configuration
@EnableWebMvc
@ComponentScan(basePackages="edu.vemaschools")
public class MVCConfigurer extends WebMvcConfigurerAdapter{
	@Bean
    public TilesConfigurer tilesConfigurer() {
        TilesConfigurer tilesConfigurer = new TilesConfigurer();
        tilesConfigurer.setDefinitions(
          new String[] { "classpath:edu/vemaschools/config/tiles-config.xml" });
        tilesConfigurer.setCheckRefresh(true);
         
        return tilesConfigurer;
    }
     
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        TilesViewResolver viewResolver = new TilesViewResolver();
        registry.viewResolver(viewResolver);
    }
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/global/**")
				.addResourceLocations("/resources/");

		registry.addResourceHandler("/open/**/*")
				.addResourceLocations("/WEB-INF/views/pages/public/");
		
		registry.addResourceHandler("/secured/**/*")
				.addResourceLocations("/WEB-INF/views/pages/secured/");
		
		registry.addResourceHandler("/admin/**/*")
				.addResourceLocations("/WEB-INF/views/pages/admin/");
		
		registry.addResourceHandler("/images/**/*")
				.addResourceLocations("resources/images/");
		
		registry.addResourceHandler("/lib/**/*")
				.addResourceLocations("resources/lib/");
		
		registry.addResourceHandler("/node/**/*")
				.addResourceLocations("resources/lib/node_modules/");
	}
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("index");
		registry.addViewController("/index").setViewName("index");
		registry.addViewController("/login").setViewName("login");
		registry.addViewController("/home").setViewName("userhome");
		registry.addViewController("/admin").setViewName("adminhome");
	}
	
}

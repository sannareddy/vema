package edu.vemaschools.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Configuration
@EnableWebMvc
@ComponentScan(basePackages="edu.vemaschools")
public class MVCConfigurer extends WebMvcConfigurerAdapter{
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/global/**")
				.addResourceLocations("/resources/");

		registry.addResourceHandler("/open/**/*")
				.addResourceLocations("/resources/components/public/");
		
		registry.addResourceHandler("/secured/**/*")
				.addResourceLocations("resources/components/secured/");
		
		registry.addResourceHandler("/admin/**/*")
				.addResourceLocations("resources/components/admin/");
		
		registry.addResourceHandler("/images/**/*")
				.addResourceLocations("resources/images/");
		
		registry.addResourceHandler("/lib/**/*")
				.addResourceLocations("resources/lib/");
	}
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("global/index.html");
		registry.addViewController("/index").setViewName("global/index.html");
		registry.addViewController("/home").setViewName("secured/home/home.tpl.html");
		registry.addViewController("/admin").setViewName("admin/home/home.tpl.html");
	}
	
}

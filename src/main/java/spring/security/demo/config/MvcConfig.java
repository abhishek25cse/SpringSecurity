package spring.security.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/Home").setViewName("Home");
		registry.addViewController("/").setViewName("Home");
		registry.addViewController("/Hello").setViewName("Hello");
		registry.addViewController("/login").setViewName("login");
	}
}

package com.swpu.uchain.blog.config;
 
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
 
/**
 * @author zh
 * @ClassName cn.saytime.config.CORSConfiguration
 * @Description
 */
@Configuration
public class CORSConfiguration {
 
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
//				registry.addMapping("/api/**");
				registry.addMapping("/**")
						.allowedOrigins("*")
						.allowedMethods("GET", "POST", "DELETE", "PUT", "OPTIONS")
						.allowCredentials(false).maxAge(3600);
			}
		};
	}
}
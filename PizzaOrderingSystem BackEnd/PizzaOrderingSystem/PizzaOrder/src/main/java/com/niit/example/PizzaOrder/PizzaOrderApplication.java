package com.niit.example.PizzaOrder;

import com.niit.example.PizzaOrder.filter.JwtFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
public class PizzaOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzaOrderApplication.class, args);
	}

	@Bean
	FilterRegistrationBean jwtFilter()
	{
		FilterRegistrationBean filterRegistrationBean= new FilterRegistrationBean();
		filterRegistrationBean.setFilter(new JwtFilter());
		filterRegistrationBean.addUrlPatterns("/api/v1/**");
		filterRegistrationBean.addUrlPatterns("/api/v2/**");
		return filterRegistrationBean;
	}

	@Bean
	public FilterRegistrationBean filterRegistrationBean()
	{
		final CorsConfiguration configuration=new CorsConfiguration();
		configuration.setAllowCredentials(true);
		configuration.addAllowedOrigin("http://localhost:4200");
		configuration.addAllowedHeader("*");
		configuration.addAllowedMethod("*");

		final UrlBasedCorsConfigurationSource source= new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**",configuration);
		FilterRegistrationBean registrationBean=new FilterRegistrationBean(new CorsFilter(source));
		registrationBean.setOrder(Ordered.HIGHEST_PRECEDENCE);
		return registrationBean;
	}

}

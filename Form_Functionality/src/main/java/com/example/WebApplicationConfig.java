package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.example")
public class WebApplicationConfig implements WebMvcConfigurer {
    @Bean
    public ViewResolver getViewResolver()
    {
        InternalResourceViewResolver view = new InternalResourceViewResolver();
        view.setPrefix("/WEB-INF/jsp/");
        view.setSuffix(".jsp");
        return view;
    }
}

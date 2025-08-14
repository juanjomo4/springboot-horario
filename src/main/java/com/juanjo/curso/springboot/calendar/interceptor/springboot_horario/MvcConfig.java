package com.juanjo.curso.springboot.calendar.interceptor.springboot_horario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Autowired
    @Qualifier("calendarInterceptor")
    private HandlerInterceptor calendarInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // Aplicamos el interceptor a la ruta /foo
        registry.addInterceptor(calendarInterceptor).addPathPatterns("/foo");
    }

}

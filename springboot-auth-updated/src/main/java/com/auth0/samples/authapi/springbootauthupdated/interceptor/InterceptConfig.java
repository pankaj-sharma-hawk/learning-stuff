package com.auth0.samples.authapi.springbootauthupdated.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by pankaj on 02,2019
 */
@Configuration
public class InterceptConfig implements WebMvcConfigurer {

    @Autowired
    private InstituteInterceptor instituteInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(instituteInterceptor);
    }
}

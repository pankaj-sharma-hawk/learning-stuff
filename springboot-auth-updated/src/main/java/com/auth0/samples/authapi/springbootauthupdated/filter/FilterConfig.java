package com.auth0.samples.authapi.springbootauthupdated.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean<InstituteFilter> loggingFilter(){
        FilterRegistrationBean<InstituteFilter> registrationBean
                = new FilterRegistrationBean<>();

        registrationBean.setFilter(new InstituteFilter());
        return registrationBean;
    }

}

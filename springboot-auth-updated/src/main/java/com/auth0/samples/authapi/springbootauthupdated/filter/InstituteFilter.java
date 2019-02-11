package com.auth0.samples.authapi.springbootauthupdated.filter;

import org.slf4j.MDC;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by pankaj on 02,2019
 */
public class InstituteFilter implements Filter {

    @Override
    public void init(javax.servlet.FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        RequestHelper requestHelper = new RequestHelper((HttpServletRequest) servletRequest);

       //        log.info("Request Body: {} , Query Parameters: {}",requestHelper.getAttribute(Constant.REQUEST_BODY),requestHelper.getAttribute(Constant.QUERY_STRING));
        filterChain.doFilter(requestHelper, servletResponse);
    }

    @Override
    public void destroy() {
    }

    private boolean isNull(Object object) {
        return object == null ? true : false;
    }
}

package com.auth0.samples.authapi.springbootauthupdated.interceptor;

import com.auth0.samples.authapi.springbootauthupdated.interceptor.util.IPAddress;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by pankaj on 02,2019
 */
@Component
public class InstituteInterceptor  extends BaseLogging implements HandlerInterceptor {
   @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        logRequest(request);
        if(IPAddress.isPrivateIPv4(request.getRemoteAddr())){
            return true;
        }
        return false;
    }
}

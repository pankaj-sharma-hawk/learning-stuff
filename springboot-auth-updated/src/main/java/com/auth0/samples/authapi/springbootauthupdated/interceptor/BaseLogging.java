package com.auth0.samples.authapi.springbootauthupdated.interceptor;

import com.google.common.net.InetAddresses;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.StringJoiner;


@Slf4j
public class BaseLogging {

    protected void logRequest(HttpServletRequest request) {
            Enumeration<String> headerNames = request.getHeaderNames();
            if (headerNames != null) {
                StringJoiner stringJoiner = new StringJoiner(";");
                while (headerNames.hasMoreElements()) {
                    String key = headerNames.nextElement();
                    stringJoiner.add(key + ":" + request.getHeader(key));
                }
                log.info("Headers: {}", stringJoiner);
            }
    }

}

package com.zy.boot.filter;

import javax.servlet.*;
import java.io.IOException;

public class BootFilter2 implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filter chain222");
        filterChain.doFilter(servletRequest,servletResponse);
    }


}

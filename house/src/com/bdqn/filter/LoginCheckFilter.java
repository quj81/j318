package com.bdqn.filter;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginCheckFilter implements Filter {
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
			
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
			HttpServletRequest request=(HttpServletRequest)arg0;
			HttpServletResponse response=(HttpServletResponse)arg1;
			HttpSession session=request.getSession(false);
	
			String url=request.getRequestURI();
			if(url.contains("Login.jsp")){
				arg2.doFilter(arg0, arg1);
			}else{
				if(session!=null&&session.getAttribute("adminUser")!=null){
					arg2.doFilter(arg0, arg1);
				}else{
					response.sendRedirect(request.getContextPath()+"/jsp/gentelella-master/production/Login.jsp");
				}
			}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}

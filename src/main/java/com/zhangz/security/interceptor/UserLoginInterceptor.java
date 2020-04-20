package com.zhangz.security.interceptor;

import com.zhangz.security.model.User;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Component
public class UserLoginInterceptor implements HandlerInterceptor {
	
	protected org.slf4j.Logger logger = LoggerFactory.getLogger(getClass());
	
	@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
							 Object handler)throws Exception {
		
		HttpSession session = request.getSession(true);
		User user = (User) session.getAttribute("user");
		if(!ObjectUtils.isEmpty(user)) {//已登录
			return true;
		}else {//未登录
			//直接重定向到登录页面
			response.sendRedirect("/user/login");
			return false;
		}
	}
 
}

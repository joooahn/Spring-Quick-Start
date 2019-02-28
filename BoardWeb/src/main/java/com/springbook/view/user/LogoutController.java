package com.springbook.view.user;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class LogoutController{

	@RequestMapping("/logout.do")
	public String handleRequest(HttpSession session) {
		System.out.println("로그아웃 처리");
		
		session.invalidate();
		return "login.jsp";
	}

}

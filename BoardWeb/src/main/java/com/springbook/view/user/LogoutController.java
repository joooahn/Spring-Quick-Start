package com.springbook.view.user;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class LogoutController{

	@RequestMapping("/logout.do")
	public String handleRequest(HttpSession session) {
		System.out.println("�α׾ƿ� ó��");
		
		session.invalidate();
		return "login.jsp";
	}

}

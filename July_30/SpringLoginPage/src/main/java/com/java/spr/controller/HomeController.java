package com.java.spr.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("login");
	}
	
	@RequestMapping(value="/login") 
	public ModelAndView doLogin(HttpServletRequest req) {
		String user = req.getParameter("userName");
		String pwd = req.getParameter("passCode");
		if (user.equals("Sonix") && pwd.equals("Sonix")) {
			return new ModelAndView("success");
		} 
		return new ModelAndView("error");
	}
}

package com.java.spr.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/nameslist")
	public ModelAndView showNames() {
		List<String> names = new ArrayList();
		names.add("Tarak");
		names.add("Rajesh");
		names.add("Sampath");
		names.add("Karthik");
		names.add("Anil");
		names.add("Manohar");
		names.add("Adi Lakshmi");
		return new ModelAndView("show","names",names);
	}
}

package com.java.spr.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.spr.model.Employ;

@Controller
public class HomeController {

	static List<Employ> employList = new ArrayList<Employ>();
	static {
		employList.add(new Employ(1, "Chandra", "Male", "Java", "Programmer", 99423));
		employList.add(new Employ(2, "Padma", "Female", "Angular", "Programmer", 99423));
		employList.add(new Employ(3, "Rajesh", "Male", "Dotnet", "Programmer", 99423));
		employList.add(new Employ(4, "Likhith", "Male", "Java", "Programmer", 99423));
		employList.add(new Employ(5, "Sushma", "Female", "Dotnet", "Programmer", 99423));
		employList.add(new Employ(6, "Sampath", "Male", "React", "Programmer", 99423));
		employList.add(new Employ(7, "Nanaji", "Male", "Dotnet", "Programmer", 99423));
	}
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/show")
	public ModelAndView show(HttpServletResponse response) throws IOException{
		return new ModelAndView("show","employList",employList);
	}
}

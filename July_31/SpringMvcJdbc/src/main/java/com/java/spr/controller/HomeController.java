package com.java.spr.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.spr.dao.EmployDao;
import com.java.spr.model.Employ;

@Controller
public class HomeController {

	@Autowired
	private EmployDao dao;
	
	@RequestMapping(value="/")
	public ModelAndView showEmploy(ModelAndView model) throws IOException{
		List<Employ> employList = dao.showEmployDao();
		System.out.println("Total Records " +employList.size());
		model.addObject("listEmploy", employList);
	    model.setViewName("home");
		return model;
	}
	
	@RequestMapping(value="/editemploy")
	public ModelAndView search(HttpServletRequest req) {
		int empno = Integer.parseInt(req.getParameter("empno"));
		Employ employ = dao.searchEmploy(empno);
		return new ModelAndView("employSearchForm","employ",employ);
	}
	
	@RequestMapping(value="/deleteemploy")
	public ModelAndView deleteEmploy(HttpServletRequest req) {
		int empno = Integer.parseInt(req.getParameter("empno"));
		dao.deleteEmploy(empno);
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value="/newemploy")
	public ModelAndView addEmploy() {
		return new ModelAndView("addemploy");
	}
	@RequestMapping(value="/updateEmploy")
	public ModelAndView updateEmploy(HttpServletRequest req) {
		Employ employ = new Employ();
		employ.setEmpno(Integer.parseInt(req.getParameter("empno")));
		employ.setName(req.getParameter("name"));
		employ.setGender(req.getParameter("gender"));
		employ.setDept(req.getParameter("dept"));
		employ.setDesig(req.getParameter("desig"));
		employ.setBasic(Double.parseDouble(req.getParameter("basic")));
		dao.updateEmploy(employ);
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value="/saveemploy")
	public ModelAndView saveEmploy(HttpServletRequest req) {
		Employ employ = new Employ();
		employ.setEmpno(Integer.parseInt(req.getParameter("empno")));
		employ.setName(req.getParameter("name"));
		employ.setGender(req.getParameter("gender"));
		employ.setDept(req.getParameter("dept"));
		employ.setDesig(req.getParameter("desig"));
		employ.setBasic(Double.parseDouble(req.getParameter("basic")));
		dao.addEmploy(employ);
		return new ModelAndView("redirect:/");
	}
}

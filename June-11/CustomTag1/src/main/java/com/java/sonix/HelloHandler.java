package com.java.sonix;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class HelloHandler extends TagSupport {

	@Override
	public int doStartTag() throws JspException {
		 JspWriter out=pageContext.getOut();
		 try {
			out.println("Welcome to JSP UserDefine Tags...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
}

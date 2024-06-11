package com.java.sonix;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class DateHandler extends TagSupport {

	@Override
	public int doStartTag() throws JspException {
		 JspWriter out=pageContext.getOut();
		 try {
			 Date obj = new Date();
			out.println("Today's Date is  " +obj.getDate() + " Time is " +obj.getHours() + ":" 
					 + obj.getMinutes() + ":" + obj.getSeconds());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
}

package com.java.sonix;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTagSupport;
import javax.servlet.jsp.tagext.TagSupport;

public class DisplayHandler extends BodyTagSupport {

	@Override
	public int doStartTag() throws JspException {
		return EVAL_BODY_INCLUDE;
	}
	
	@Override
	public int doEndTag() throws JspException {
		String body=bodyContent.getString(); 
        try { 
            pageContext.getOut().print(body); 
        } catch (IOException e) { 
            e.printStackTrace(); 
        } 
        return EVAL_PAGE; 
	}
}

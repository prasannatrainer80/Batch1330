package com.java.custom;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class UserHandler extends BodyTagSupport {

	@Override
	public int doStartTag() throws JspException {
				return EVAL_BODY_BUFFERED;
	}
	
	@Override
	public int doEndTag() throws JspException {
		String body = bodyContent.getString();
		String[] values = body.split(" ");
		String user = values[0];
		String pwd = values[1];
		JspWriter out=pageContext.getOut();
		
//		try {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonixpractice",
						"root", "root");
				String cmd = "select count(*) cnt from UserData where UserName = ? AND PassCode = ?";
				PreparedStatement pst = conn.prepareStatement(cmd);
				pst.setString(1, user);
				pst.setString(2, pwd);
				ResultSet rs = pst.executeQuery();
				rs.next();
				int cnt = rs.getInt("cnt");
				out.println(cnt);
				if (cnt==1) {
					out.println("Correct Credentials...");
				} else {
					out.println("Invalid Credentials...");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		 return EVAL_PAGE;
	}
}

package com.java.custom;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class EmployInsertHandler extends BodyTagSupport {

	@Override
	public int doStartTag() throws JspException {
		return EVAL_BODY_BUFFERED;
	}
	
	@Override
	public int doEndTag() throws JspException {
		String body = bodyContent.getString();
		String[] values = body.split(" ");
		int empno = Integer.parseInt(values[0]);
		String name = values[1];
		String gender = values[2];
		String dept = values[3];
		String desig = values[4];
		double basic = Double.parseDouble(values[5]);
		JspWriter out=pageContext.getOut();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonixpractice",
					"root", "root");
			String cmd = "Insert into Employ values(?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(cmd);
			pst.setInt(1, empno);
			pst.setString(2, name);
			pst.setString(3, gender);
			pst.setString(4, dept);
			pst.setString(5, desig);
			pst.setDouble(6, basic);
			pst.executeUpdate();
			out.println("*** Employ Record Inserted ***");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		 return EVAL_PAGE;
	}
}

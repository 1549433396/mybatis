package com.jst.myservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.jst.model.users;
import com.jst.service.seivice;


public class login extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setHeader("Content-type", "textml;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		String type = request.getParameter("type");
		String user = request.getParameter("username");
		String pwd = request.getParameter("pwd");
		int id = Integer.parseInt(user);
		seivice seivice = new seivice();
		if (type.equals("login")) {
			users users = seivice.select(id);
			System.out.println(users);
			if (users.getUname().equals(pwd)) {
				response.getWriter().println(0);
			}else {
				response.getWriter().println(1);
			}
		}
		if (type.equals("regist")) {
			users users = new users();
			users.setUid(id);
			users.setUname(pwd);
			seivice.registUser(users);
			response.getWriter().println("123");
		}
	}
}

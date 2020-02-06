package com.bit.controller;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ex01.bit")
public class Ex01Controller extends HttpServlet {
	Logger log = Logger.getLogger("com.bit.controller.Ex01Controller");
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("ex01.jsp").forward(req, resp);
		/*
		log.info("ex01 page 출력");
		log.warning("경고메시지로 출력");
		log.severe("심각메시지로 출력");
		log.config("config");
		log.fine("fine");
		log.finer("finer");
		log.finest("finest");
		HttpSession session = req.getSession();
		//System.out.println(session.getId());
		//session.invalidate();
		//System.out.println("세션갱신");
		//System.out.println(session.getId());
		session.removeAttribute("msg");
		*/
	}
}

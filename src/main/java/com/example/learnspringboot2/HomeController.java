package com.example.learnspringboot2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
//	@RequestMapping("/Home")
////	@ResponseBody
//	public String homeShow() {
//		System.out.println("Home controller homeShow method got hit");
//		//NOTE: Home.jsp will not work because we have prefix and suffix configuration in application.properties
//		return "Home";
//	}

////	 Accepting Client Data
//	@RequestMapping("/Home")
//	public String homeShow(HttpServletRequest request) {
//		String name = request.getParameter("name");
//		HttpSession session=request.getSession();
//		session.setAttribute("name", name);
//		System.out.println("Name "+name);
//		return "Home";
//	}

	@RequestMapping("/Home")
	public String homeShow(@RequestParam("name") String clientName, HttpSession session) {
		session.setAttribute("name", clientName);
		return "Home";
	}
}
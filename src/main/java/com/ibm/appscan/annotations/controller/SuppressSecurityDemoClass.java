package com.ibm.appscan.annotations.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ibm.security.annotation.SuppressSecurityTrace;

@Controller
@RequestMapping("/dump")
public class SuppressSecurityDemoClass {

	@RequestMapping(method = RequestMethod.POST)
	@SuppressSecurityTrace
	public String NotAnInterestingMethod(@PathVariable int someint,
		@PathVariable String stringOne, @PathVariable Boolean somebool,
     		ModelMap model) 
	{
		System.out.println(stringOne);
		System.out.println(somebool);
		
		return "Done";
     }
	
	@SuppressSecurityTrace
	@RequestMapping(value = "/something")
	protected void doGet(@RequestParam("loginData") String loginData, HttpServletResponse response) throws IOException {
		response.getWriter().write(loginData);
		}
  
 }
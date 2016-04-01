package com.ibm.appscan.annotations.controller;

import org.springframework.ui.ModelMap;

import com.ibm.security.annotation.CallbackMethod;

public class Controller4 {

	@CallbackMethod
	public String MethodConsumingUserFormData(int pvint,
		String pvstring,
		float pvfloat,
		Boolean pvbool,
     		ModelMap model) 
	{
		System.out.println(pvstring);
		return "Done";
     }
  
 }
package com.ibm.appscan.annotations.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ibm.appscan.test.library.DangerousAPIClass;
import com.ibm.appscan.test.library.SafeAPIClass;
import com.ibm.security.annotation.CallbackMethod;

@Controller
@RequestMapping("/customer")
public class Controller2 {

	@CallbackMethod()
	public void methodProcessingCCData(String creditCardData)
	{
		DangerousAPIClass.dangerous_API_1(creditCardData);
		SafeAPIClass.safe_API_2(creditCardData);
		System.out.println(creditCardData);
		
	}
	
}
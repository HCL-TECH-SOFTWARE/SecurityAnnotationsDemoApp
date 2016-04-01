package com.ibm.appscan.annotations.controller;

import java.util.regex.Pattern;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ibm.appscan.annotations.simpledb.DBHandler;
import com.ibm.security.annotation.ValidatorMethod;

@Controller
@RequestMapping("/customer")
public class Controller3 {
	
	@RequestMapping(method = RequestMethod.POST)
	public String LoginMethod_2(@RequestParam("username") String username, @RequestParam("password") String password) 
	{
		DBHandler.createDatabase();
		
		if(myCombinedValidator(username, password))
		{
			 DBHandler.doLogin(username, password);
		}
			
		return "Done";
	}

	@ValidatorMethod()
	boolean myCombinedValidator(String name, String passwd)
	{
		String patternString = "((?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
		final Pattern pattern = Pattern.compile(patternString);

		if ( !pattern.matcher(name).matches() )  {
 			return false;
 		}
		
		if ( !pattern.matcher(passwd).matches() )  {
 			return false;
 		}
		return true;
	}
	 
 }
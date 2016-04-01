package com.ibm.appscan.annotations.controller;

import java.util.regex.Pattern;

import org.apache.commons.lang.StringEscapeUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ibm.appscan.annotations.simpledb.DBHandler;
import com.ibm.security.annotation.ValidatorMethod;

@Controller
@RequestMapping("/customer")
public class Controller1 {

	
	@RequestMapping(method = RequestMethod.POST)
	public String LoginMethod_1(@RequestParam("username") String username, @RequestParam("password") String password) 
	{
		DBHandler.createDatabase();
		
	    String sanitized_username = myUserNameSanitizer(username);
		if(myPasswordValidator(password))
		{
		    DBHandler.doLogin(sanitized_username, password);
		}
        		
		return "Done";
	}
	
	@ValidatorMethod
	String myUserNameSanitizer(String name)
	{
	   return StringEscapeUtils.escapeHtml(name);
	}
	
	@ValidatorMethod
	boolean myPasswordValidator(String passwd)
	{
		String patternString = "((?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
		final Pattern pattern = Pattern.compile(patternString);
		if ( !pattern.matcher(passwd).matches() )  {
 			return false;
 		}
		return true;
	}
	 
 }
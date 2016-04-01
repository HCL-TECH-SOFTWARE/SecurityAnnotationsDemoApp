package com.ibm.appscan.annotations.controller;

import java.util.regex.Pattern;

import org.apache.commons.lang.StringEscapeUtils;

import com.ibm.appscan.annotations.simpledb.DBHandler;
import com.ibm.security.annotation.ValidatorMethod;

public class MainClass {
	
	public static int main(String[] args, int argc)
	{
		DBHandler.createDatabase();
		
	    String sanitized_username = myUserNameSanitizer(args[0]);
	    String passwd = args[1];
		if(myPasswordValidator(passwd))
		{
		    DBHandler.doLogin(sanitized_username, passwd);
		}
        		
		return 0;
	}
	
	@ValidatorMethod
	static String myUserNameSanitizer(String name)
	{
	   return StringEscapeUtils.escapeHtml(name);
	}
	
	@ValidatorMethod
	static boolean myPasswordValidator(String passwd)
	{
		String patternString = "((?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
		final Pattern pattern = Pattern.compile(patternString);
		if ( !pattern.matcher(passwd).matches() )  {
 			return false;
 		}
		return true;
	}

}

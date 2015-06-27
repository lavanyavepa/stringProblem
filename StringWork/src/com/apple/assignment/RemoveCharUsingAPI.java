package com.apple.assignment;


public class RemoveCharUsingAPI 
{
	public String removeChar(String inputstring, char chartoremove)
	{
		
			return inputstring.replaceAll(String.valueOf(chartoremove),"");
			     
	 }
			
}

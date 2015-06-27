package com.apple.assignment;

import java.util.Scanner;



public class RemoveCharByLoop 
{
	public String removeChar(String inputstring, char chartoremove)
	{
		
			//Internal Variables
			StringBuffer updatestring = new StringBuffer();
			String tmpstring;


			for(int a=0; a<inputstring.length(); a++ ) {

			tmpstring = inputstring.substring(a, a+1);
			if (!tmpstring.equals(String.valueOf(chartoremove))) 
			{
			updatestring.append(tmpstring);
			}

			}

			return(updatestring.toString());
	}	

}



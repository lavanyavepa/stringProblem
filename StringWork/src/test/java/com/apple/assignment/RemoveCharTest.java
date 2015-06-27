package test.java.com.apple.assignment;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import com.apple.assignment.RemoveCharByLoop;
import com.apple.assignment.RemoveCharUsingAPI;

public class RemoveCharTest 
{
	RemoveCharByLoop removebyloop = new RemoveCharByLoop();
	RemoveCharUsingAPI removeusingapi = new RemoveCharUsingAPI();
	
  @Test
  
  public void testRemoveCharByLoop() {
	  //Positive Tests
	  AssertJUnit.assertEquals(removebyloop.removeChar("I am lavanya",'a'), "I m lvny");
	  AssertJUnit.assertEquals(removebyloop.removeChar("I am lavanya",' '), "Iamlavanya");
	  AssertJUnit.assertEquals(removebyloop.removeChar("I am lavanya",'m'), "I a lavanya");
	  AssertJUnit.assertEquals(removebyloop.removeChar("m",'m'), "");


	  //Negative Tests
	  AssertJUnit.assertEquals(removebyloop.removeChar("I am lavanya",'k'), "I am lavanya");
	  AssertJUnit.assertEquals(removebyloop.removeChar("I am lavanya",'4'), "I am lavanya");
	  
  }
 @Test
  
  public void testRemoveCharUsingAPI() {
	  //Positive Tests
	  AssertJUnit.assertEquals(removeusingapi.removeChar("I am lavanya",'a'), "I m lvny");
	  AssertJUnit.assertEquals(removeusingapi.removeChar("I am lavanya",' '), "Iamlavanya");
	  AssertJUnit.assertEquals(removeusingapi.removeChar("I am lavanya",'m'), "I a lavanya");


	  //Negative Tests
	  AssertJUnit.assertEquals(removeusingapi.removeChar("I am lavanya",'k'), "I am lavanya");
	  AssertJUnit.assertEquals(removeusingapi.removeChar("I am lavanya",'4'), "I am lavanya");

	  
  }
}

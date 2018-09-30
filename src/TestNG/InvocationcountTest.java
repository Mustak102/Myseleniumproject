package TestNG;

import org.testng.annotations.Test;

public class InvocationcountTest {
	
	//Excuting same test cases multiple time 
	
	@Test (invocationCount=10)
	
	public void sum () {
	int a =10;
	int b = 15 ;
	int c = a+b; 
	System.out.println("Sum is" +" " + c);
	}	
	

}

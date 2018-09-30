package TestNG;

import org.testng.annotations.Test;

public class ExceptionTimeoutTest {
	
	//this is just for practice never write infinite loop in automation code
	//ExpectedException will pass the test case
	
	
	
//	@Test( invocationTimeOut=2)
//	public void Infinitelooptest () {
//		
//		int i=1;
//		
//		while (i==1) {
//			
//			System.out.println(i); 
//		}
//	}
	@Test ( expectedExceptions = NumberFormatException.class)
	
	public void expectedexception () {
		
		String a ="100A";
		Integer.parseInt(a); 
				
		
	}

}

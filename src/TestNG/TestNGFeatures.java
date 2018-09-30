package TestNG;


import org.testng.annotations.Test;

public class TestNGFeatures {
	
	// @Test (dependsOnMethods="Logintest")
	// dependsOnMethods allow keep from executing test case if the depednsOnMethod fails to Execute 
	// int = 9/0 ; it will fail logintest methods 
	
	
	@Test 
	public void Logintest () {
		System.out.println("logintest");
		//int a =9/0; 
	}
	
	@Test (dependsOnMethods="Logintest")
	public void HomePagetest () {
		System.out.println("homePagetest");
	}

	
	@Test (dependsOnMethods="Logintest")
	public void SearchPagetest () {
		System.out.println("SearchPagetest");
	}

	@Test (dependsOnMethods="Logintest")
	public void RegPagetest () {
		System.out.println("RegPagetest");
	}
	

}

package practice;

import org.testng.annotations.Test;

public class Groups {
	
	@Test(groups = {"sanity"})
	public void test1() {
		System.out.println("test1 executed");
	}
	
	@Test(groups = {"sanity", "smoke"})
	public void test2() {
		System.out.println("test2 executed");
	}
	
	@Test(groups = {"regression", "smoke"})
	public void test3() {
		System.out.println("test3 executed");
	}
	
	@Test(groups = {"regression"})
	public void test4() {
		System.out.println("test4 executed");
	}
	
	@Test
	public void test5() {
		System.out.println("test5 executed");
	}

}

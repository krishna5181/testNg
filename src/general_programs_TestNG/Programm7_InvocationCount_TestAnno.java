package general_programs_TestNG;

import org.testng.annotations.Test;

public class Programm7_InvocationCount_TestAnno {
	@Test(invocationCount = 5)
	public void deposit() {
		System.out.println("Amount deposited successfully");
	}
	@Test(enabled = false)
	public void withdrawl() {
		System.out.println("Amoaunt successfully withdrawled");
	}
	@Test(invocationCount = 2)
	public void checkBalance() {
		System.out.println("Account balance is 0");
	}
}

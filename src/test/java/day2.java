

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	
	@Test(groups={"Smoke"})
	public void ploan()
	{
		System.out.println("good");
		System.out.println("Marvel");
		System.out.println("Good day");
	}
	
	@BeforeTest
	public void prerequiste()
	{
		System.out.println("I will execute first");
		System.out.println("Easy");
		System.out.println("Mahesh");
	}
}

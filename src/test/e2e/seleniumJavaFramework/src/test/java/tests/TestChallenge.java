package tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;
import commonComponents.CommonUtities;
import commonComponents.PropertiesOperations;
import pageObjects.ArraysChallengePageObjects;
import pageObjects.IntroPageObjects;
import testBase.TestBase;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class TestChallenge extends TestBase{

	@Test
	public void ArraysChallenge() throws Exception {

		IntroPageObjects intropo = new IntroPageObjects(this.getDriver());
		ArraysChallengePageObjects arrChallpo = new ArraysChallengePageObjects(this.getDriver());
		
		// Wait until Element visible for click 
		this.waitElement(intropo.getbChallenge());
		
		intropo.clickme();
		
		// Wait until page local Complete
		this.waitElement(arrChallpo.getbSubmitAnswer());
		
		
		List<int[]> table_data  = arrChallpo.findDOM();
		int res1 = CommonUtities.findElement(table_data.get(0), table_data.get(0).length);
		int res2 = CommonUtities.findElement(table_data.get(1), table_data.get(1).length);
		int res3 = CommonUtities.findElement(table_data.get(2), table_data.get(2).length);
		
 		System.out.println("res 1  >  2  > 3  ==>> " + res1 + "  " + res2 + "   " + res3);
		
		arrChallpo.getTxtChallenge1().sendKeys(String.valueOf(res1));
		arrChallpo.getTxtChallenge2().sendKeys(String.valueOf(res2));
		arrChallpo.getTxtChallenge3().sendKeys(String.valueOf(res3));
		arrChallpo.getTxtName().sendKeys(PropertiesOperations.getPropertyValueByKey("name"));
		
		
		arrChallpo.getbSubmitAnswer().click();
		
		// Wait until page local Complete
		// TimeUnit.SECONDS.sleep(5);
		this.waitElement(arrChallpo.getDialogRes());				
		
		// 
		Thread.sleep(Integer.valueOf(PropertiesOperations.getPropertyValueByKey("delay1s")).intValue());
		
		if (arrChallpo.getDialogRes().getText().contains("Congratulations") != true)
			AssertJUnit.fail("Data Verification Failed. ");
			
	//	else
	//		Reporter.log(" Data Verification -- FAIL",false);
		//	System.out.println("Failed");
		
	//	List<Integer> newList = table_data
		
		//TimeUnit.SECONDS.sleep(5);
		
	}
	
	@Test
	public void DemoTest() {
		System.out.println("DemoTest");
	}
	
}




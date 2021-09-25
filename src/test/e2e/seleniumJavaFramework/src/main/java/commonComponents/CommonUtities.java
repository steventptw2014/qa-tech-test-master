package commonComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtities {

	
//	public static int loadPage(WebDriver driver, String str) {
//			
//			WebDriverWait wait = new WebDriverWait(driver,30);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'"+str+"')]")));
//			// click on the compose button as soon as the "compose" button is visible
//			driver.findElement(By.xpath("//div[contains(text(),'"+str+"')]")).click();
//			
//			return 0;
//	}

	
		// Finds an element in an array such that
	    // left and right side sums are equal
	    public static int findElement(int arr[], int n)
	    {
	        // Forming prefix sum array from 0
	        int[] prefixSum = new int[n];
	        prefixSum[0] = arr[0];
	        for (int i = 1; i < n; i++)
	            prefixSum[i] = prefixSum[i - 1] + arr[i];
	      
	        // Forming suffix sum array from n-1
	        int[] suffixSum = new int[n];
	        suffixSum[n - 1] = arr[n - 1];
	        for (int i = n - 2; i >= 0; i--)
	            suffixSum[i] = suffixSum[i + 1] + arr[i];
	      
	        // Find the point where prefix and suffix
	        // sums are same.
	        for (int i = 1; i < n - 1; i++)
	            if (prefixSum[i] == suffixSum[i])
	                //return arr[i];
	            	return i;
	      
	        return -1;
	    }

	
}

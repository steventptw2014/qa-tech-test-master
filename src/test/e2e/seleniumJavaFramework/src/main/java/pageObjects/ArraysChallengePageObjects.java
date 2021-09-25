package pageObjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ArraysChallengePageObjects {

	@FindBy(id = "btnSubmitAns")
	WebElement  bSubmitAnswer;

	@FindBy(xpath = "//*[@id=\"challenge\"]/div/div/div[1]/div/div[2]/table")
	WebElement  tdataTest;
	
	@FindBy(xpath = "/html/body/div[1]/div/section[2]/div/div/div[2]/div/div[1]/div[1]/input")
	WebElement  txtChallenge1;
		
	@FindBy(xpath = "/html/body/div[1]/div/section[2]/div/div/div[2]/div/div[1]/div[2]/input")
	WebElement  txtChallenge2;
	
	@FindBy(xpath = "/html/body/div[1]/div/section[2]/div/div/div[2]/div/div[1]/div[3]/input")
	WebElement  txtChallenge3;
	
	@FindBy(xpath = "/html/body/div[1]/div/section[2]/div/div/div[2]/div/div[1]/div[4]/input")
	WebElement  txtName;
	
	@FindBy(xpath = "/html/body/div[2]/div")
	WebElement  dialogRes;
	

	

	
	//Initialize all page objects for given driver instance
	public ArraysChallengePageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	public WebElement getbSubmitAnswer() {
		return bSubmitAnswer;
	}


	public List<int[]> findDOM () {
		
//		System.out.println("tDataText  "+ tdataTest.getText());
		
		// find all table rows
		List<WebElement> rows = tdataTest.findElements(By.cssSelector("tr"));

		List<int[]> table_data = new ArrayList<int[]>();

				 
		for(WebElement row:rows) {

		    // find all cells of each table row
		    List<WebElement> cells = row.findElements(By.cssSelector("td"));
		    String[] texts = new String[0];

		    // read text of each cell
		    for(WebElement cell:cells) {
		        texts = ArrayUtils.add(texts, cell.getText().trim());
		    }

		    	
		    int[] results = new int[texts.length];
		    
		    for (int i = 0; i < texts.length; i++) {
		        try {
		            results[i] = Integer.parseInt(texts[i]);
		        } catch (NumberFormatException nfe) {
		            //NOTE: write something here if you need to recover from formatting errors
		        };
		    }
		    	
		    table_data.add(results);
		    
		}
		
		return table_data;

				
	}


	public WebElement getTxtChallenge1() {
		return txtChallenge1;
	}


	public WebElement getTxtChallenge2() {
		return txtChallenge2;
	}


	public WebElement getTxtChallenge3() {
		return txtChallenge3;
	}


	public WebElement getTxtName() {
		return txtName;
	}


	public WebElement getDialogRes() {
		return dialogRes;
	}



	
	

	
	
	
}

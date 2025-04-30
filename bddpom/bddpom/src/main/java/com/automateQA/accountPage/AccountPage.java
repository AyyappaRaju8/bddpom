package com.automateQA.accountPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automateQA.driverM.DriverM;
import com.automateQA.loginPage.LoginPage;

public class AccountPage extends LoginPage{

	
	public void extractHeadText() {
		 WebDriverWait wait = new WebDriverWait(wd, java.time.Duration.ofSeconds(10));
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h2)[1]")));
		    
		    String str = wd.findElement(By.xpath("(//h2)[1]")).getText();
		    System.out.println(str);
	}
	
	
}

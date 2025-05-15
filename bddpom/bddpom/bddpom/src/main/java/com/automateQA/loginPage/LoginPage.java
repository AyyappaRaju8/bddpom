package com.automateQA.loginPage;

import com.automateQA.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automateQA.accountPage.AccountPage;
import com.automateQA.driverM.DriverM;

public class LoginPage {
//	DriverM driverObj = new DriverM();
	protected WebDriver wd=DriverM.getDriver();

	
	public void launchBrowser() {
		wd.get("https://www.awesomeqa.com/ui/index.php?route=account/login");
	}
	
	public void enterUserEmail(String mail) {
		wd.findElement(By.xpath("(//form[@action='https://awesomeqa.com/ui/index.php?route=account/login']/child::*)[1]//input")).sendKeys(mail);
	}
	
	public void enterPassword(String pass) {
		wd.findElement(By.xpath("(//form[@action='https://awesomeqa.com/ui/index.php?route=account/login']/child::*)[2]//input")).sendKeys(pass);
	}
	
	public void clickLogin() {
		wd.findElement(By.xpath("(//form[@action='https://awesomeqa.com/ui/index.php?route=account/login']/child::*)[3]")).click();
	}
}

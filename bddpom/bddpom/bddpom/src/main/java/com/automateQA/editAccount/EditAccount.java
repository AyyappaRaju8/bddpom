package com.automateQA.editAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automateQA.driverM.DriverM;

public class EditAccount {
	WebDriver wd= DriverM.getDriver();
	
	public void clickEditAccount() {
		wd.findElement(By.xpath("(//a[@href='https://awesomeqa.com/ui/index.php?route=account/edit'])[2]")).click();
	}

	public void editLastName(String lastname) {
		wd.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys(lastname);
	}

	public void clickContinue() {
		wd.findElement(By.xpath("//input[@type='submit']")).click();
	}	
}

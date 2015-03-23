package com.shopstyle;


import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class RegressionTestSuite {
  
	public WebDriver driver = new FirefoxDriver();
	  
	  @BeforeTest
	  public void setup() {
		  
		  String appUrl = "http://www.shopstyle.com/page/NewsletterSignUp";	
		  driver.get(appUrl);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	  }

	  @Test(priority=0)
	  public void verifyBlankNewsletterSignUp() {

	  // Executing Test Case# 1(A)
	      System.out.println("Executing Test Case# 1(A) - Blank Newsletter SignUp");
	      
	      //Enter blank email address in to the email field of NewsletterSignUp
	      WebElement usernamereg = driver.findElement(By.name("email"));
	      usernamereg.clear();
	      usernamereg.sendKeys("");
	      
	      WebElement subscribeButton = driver.findElement(By.xpath("//input[@value='Subscribe']"));
	      subscribeButton.click();
	      
	     Assert.assertEquals("That is an invalid email address", driver.findElement(By.className("error-message")).getText());
	  }


	  @Test(priority=0)
	  public void verifyInvalidNewsletterSignUp() {

	  // Executing Test Case# 1(B)
	      System.out.println("Executing Test Case# 1(B) - Invalid NewsletterSignUp");
	      
	      //Enter invalid email address in to the email field of NewsletterSignUp
	      WebElement usernamereg = driver.findElement(By.name("email"));
	      usernamereg.clear();
	      usernamereg.sendKeys("abcd@c");
	      
	      WebElement subscribeButton = driver.findElement(By.xpath("//input[@value='Subscribe']"));
	      subscribeButton.click();      
	      
	      
		  Assert.assertEquals("That is an invalid email address", driver.findElement(By.className("error-message")).getText());
		  
	  }
	
		
	  @Test(priority=2)
	  public void verifyValidNewsletterSignUp() {

	  // Executing Test Case# 1(C)
	      System.out.println("Executing Test Case# 1(C) - Valid NewsletterSignUp");
	      
	      //Enter valid email address in to the email field of NewsletterSignUp
	      WebElement usernamereg = driver.findElement(By.name("email"));
	      usernamereg.clear();
	      usernamereg.sendKeys("mzaman@ael-bd.com");
	      
	      WebElement subscribeButton = driver.findElement(By.xpath("//input[@value='Subscribe']"));
	      subscribeButton.click();
	  
	      WebElement myDynamicElement = (new WebDriverWait(driver, 10))
	    		  .until(ExpectedConditions.presenceOfElementLocated(By.className("newsletter-join-success")));
	      
	      Assert.assertEquals("THANK YOU\nYou're all signed up.\nYou will start receiving ShopStyle emails soon!", myDynamicElement.getText());

	  }
 
	  @AfterTest
	  public void teardown() {
		  
	      driver.close();
		  System.out.println("Finished the tests successfully");
	  }
}



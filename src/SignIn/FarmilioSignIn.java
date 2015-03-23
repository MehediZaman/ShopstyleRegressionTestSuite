package SignIn;
//import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Assert;

public class FarmilioSignIn {
	
	public static void main(String[] args) throws InterruptedException {
			
		 WebDriver driver = new FirefoxDriver();

		 String appUrl = "http://staging.farmilio.net/";
	      
	 // Manage Webdriver timeouts   
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	      
	   
	// launch the firefox browser and open the application url
	    driver.get(appUrl);
	    	    
	// maximize the browser window
	    driver.manage().window().maximize();
	    
	  //  WebElement logInInitial = (new WebDriverWait(driver, 20))
		  //      .until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Log")));
	  /*
	  //click on the Login button
	     logInInitial = driver.findElement(By.partialLinkText("Log"));
	     logInInitial.click();  
	  
	    
	    //create new account (Deutsch interface)
	     WebElement createAccount = driver.findElement(By.partialLinkText("Konto")); 
	      createAccount.click(); 
	   
	// enter a valid username in the email textbox
	      WebElement usernamereg = driver.findElement(By.name("user[email]"));
	      usernamereg.clear();
	      //usernamereg.sendKeys("mehedizaman@rocketmail.com");
	      usernamereg.sendKeys("mehedizaman@ymail.com");
	    
	// enter a valid password in the password textbox
	    WebElement passwordreg = driver.findElement(By.name("user[password]"));
	    passwordreg.clear();
	    passwordreg.sendKeys("carbon");
	
	 // Select the terms and conditions checkbox
	   // WebElement checkboxreg = driver.findElement(By.id("user_terms_and_conditions"));
	 	//checkboxreg.click();
	  	    
	  if ( !driver.findElement(By.id("user_terms_and_conditions")).isSelected())
	    {
	         driver.findElement(By.id("user_terms_and_conditions")).click();
	    }
	  
	 WebElement kontoAnlegenButton = (new WebDriverWait(driver, 20))
		         .until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button[@type='submit'])")));
			 	 	  
	  //click on the Konto anlegen (create account) button
	    kontoAnlegenButton = driver.findElement(By.xpath("(//button[@type='submit'])"));
	    kontoAnlegenButton.click();
  	*/
	     
	 // Wait for the Create Account page to load
		  //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	     
	  //click on the Login button in Nav bar
	     WebElement logInSubmit = driver.findElement(By.partialLinkText("Log"));
	      logInSubmit.click();
 
	    
	 // Executing Test Case# 1(A)
	      System.out.println("Executing Test Case# 1(A) - Invalid Login");
	      
	// enter a valid username in the email textbox
	      WebElement username = driver.findElement(By.name("user[email]"));
	      username.clear();
	      username.sendKeys("sqaone@b.com");
	 
	// enter a valid password in the password textbox
	    WebElement password = driver.findElement(By.name("user[password]"));
	    password.clear();
	    password.sendKeys("aero");
	    
	 //click on the Login button
	    WebElement logInButton = driver.findElement(By.xpath("//button[@type='submit']"));
	    logInButton.click();
	    
	     username = (new WebDriverWait(driver, 20))
		         .until(ExpectedConditions.presenceOfElementLocated(By.name("user[email]")));
			 	 	  
	    username.clear();
	    username.sendKeys("sqaone@yahoo.com");
	    
	    
	    //password.sendKeys("carbon");
	    password.clear();
	    driver.findElement(By.name("user[password]")).sendKeys("carbon");
	    
	    logInButton.click();
	    
	    

	    
	  //click on the Login button in Nav bar
	  // Executing Test Case# 1(B)
	  //System.out.println("Executing Test Case# 1(A) - Valid Login");
	  // enter a valid username in the email textbox
	  //  username.clear();
	  //  username.sendKeys("sqaone@yahoo.com");
	    
	  // enter a valid password in the password textbox
	  //   password.clear();
	  //   password.sendKeys("carbon");
	    
	  //click on the Login button
	  //   logInButton.click();
	    
	    WebElement searchBox = (new WebDriverWait(driver, 20))
		        .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='text']")));
	
	    	    
	 //Enter offer name/s in the Searchbox
	     searchBox = driver.findElement(By.xpath("//input[@type='text']"));
	    searchBox.clear();
	    searchBox.sendKeys("fruits");
	    
	   
	    //Wait for a moment
	    Thread.sleep(3000);
	    
	 //click on the Search button
	    WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
	    searchButton.click();
	
	   
	    
	 //click on the Benutzer Details (User details) button
		    WebElement myAccountButton = driver.findElement(By.partialLinkText("Benutzer"));
		    myAccountButton.click();    
		   
		    /*	 

	 */
		    
	//click on the Eigene Angebote (My Offers) button
		    WebElement myOfferButton = driver.findElement(By.partialLinkText("Eigene"));
		     myOfferButton.click();  	    	   
		    //List<WebElement> myOfferButtons = driver.findElements(By.partialLinkText("Eigene"));
		    //WebElement myOfferButton = myOfferButtons.get(1);
		    //myOfferButton.click();		   
		    
		    
	//click on the Eigene Angebote (My Offers) button
		      WebElement offerDetailsLink = driver.findElement(By.linkText("Apfelsaft"));
		      offerDetailsLink.click();
		      
	//click on the Eigene Angebote (My Offers) button
		      WebElement offerBreadcrumbsLink = driver.findElement(By.linkText("Getränke"));
		      offerBreadcrumbsLink.click();
	    

        
		     /* */
	//click on the Suche (Advanced Search) button
		      WebElement advancedSearchLink = driver.findElement(By.partialLinkText("Suche"));
		      advancedSearchLink.click();
		      
	//Select a lookup data from category DropDown	    
			    WebElement categoryDDL = driver.findElement(By.id("category"));
			    Select clickCategoryDDL = new Select(categoryDDL); 
			    clickCategoryDDL.selectByValue("18");	
			    
	//Select a lookup data from product DropDown	    
			    WebElement productDDL = driver.findElement(By.id("product"));
			    Select clickProductDDL = new Select(productDDL); 
			    clickProductDDL.selectByValue("65");			
	
    //Select a lookup data from sub-product DropDown	    
			    WebElement subproductDDL = driver.findElement(By.name("subproduct"));
			    Select clickSubproductDDL = new Select(subproductDDL); 
			    clickSubproductDDL.selectByValue("119");			    

	//click on the Speichern / Submit button in the Benutzer Details (Edit User details) page
			    WebElement searchAdvancedButton = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
			    searchAdvancedButton.click();  
			     
	//click on the Share (Empfehlen) Link
			      WebElement shareFarmilioLink = driver.findElement(By.partialLinkText("Teilen"));
			      shareFarmilioLink.click();	
			      	    
	  //click on the Recommend Farmilio(Empfehlen) Link
			      WebElement recommendFarmilioLink = driver.findElement(By.partialLinkText("Empfehlen"));
			      recommendFarmilioLink.click();			
	
			      // Get a handle to the open alert, prompt or confirmation
			      //Alert alert = driver.switchTo().alert();
			      
			      //will get the text which is present on th Alert.
			      //alert.getText(); 
			      
			      //System.out.println(alert.getText());
			      
      //click on the Template (Vorlage) Link		      
			      WebElement templateButton = driver.findElement(By.partialLinkText("Vorlage"));
			      templateButton.click();
			     
			    
			      
	  WebElement inputEmailSubmit = (new WebDriverWait(driver, 15))
		         .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button.send-email.btn.btn-default")));
			    
	//Enter email address in to the receiver field (Vorlage) Link		      
			      WebElement inputEmailReceiver = driver.findElement(By.id("inputEmail3"));
			     // inputEmailReceiver.clear();
			      inputEmailReceiver.sendKeys("mehedizaman@rocketmail.com,mehedizmn@yahoo.com");
			      
	//Enter the subject in the email of the Recommend Farmilio form	      
			      WebElement inputEmailSubject = driver.findElement(By.name("subject"));
			      inputEmailSubject.clear();
			      inputEmailSubject.sendKeys("Farmilio MVP 1.0 Selenium Test Automation");
      
	//Enter the email message in the email of the Recommend Farmilio form		      
			      WebElement inputEmailMessage = driver.findElement(By.name("message"));
			      inputEmailMessage.clear();
			      inputEmailMessage.sendKeys("Ich habe eine neue Internet-Plattform entdeckt die Dir sicher auch gefallen wird. Auf FARMILIO findest Du aktuelle Angebote von Bauern, Jägern und Fischern in Deiner Nachbarschaft.Direkt vom Bauern - beste Qualität und ein Beitrag zum Erhalt der heimischen, bäuerlichen Landwirtschaft.");
			      
	//Submit the Recommend Farmilio form	      
			       inputEmailSubmit = driver.findElement(By.cssSelector("button.send-email.btn.btn-default"));
			      inputEmailSubmit.click();
 
	// close the web browser
	     driver.close();
	    System.out.println("Test script executed successfully.");
	    
	// terminate the program
	    System.exit(0);
		
	    }    
}

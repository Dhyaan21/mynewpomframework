package nopcommerece.demo;

import Utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {


    WebDriver driver;
    Utils utils;

    By emailId = By.id("Email");
    By passwordInput = By.id("Password");
    By loginButton = By.className("login-button");

    public Loginpage(WebDriver driver){
        this.driver = driver;
        utils = new Utils(driver);

    }
   public String getPageTitle(){
       String title = driver.getTitle();
       //utils.wait();

       return title;
    }

    public void doLogin(String username, String password) {
        utils.doSendKeys(emailId, username);
        utils.doSendKeys(passwordInput,password);
        utils.doClick(loginButton);
    }


}

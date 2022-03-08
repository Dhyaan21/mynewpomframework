package nop.commerce.tests;

import nopcommerece.demo.Basepage;
import nopcommerece.demo.Loginpage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;

public class LoginTest {
    Basepage basepage;
    Properties prop;
    Loginpage loginPage;
    WebDriver driver;

    @BeforeMethod
    public void openBrowser(){
        basepage = new Basepage();
        prop = basepage.initialiseProperties();
        String browser = prop.getProperty("browser");
        driver = basepage.intialiseDriver(browser);
        String url = prop.getProperty("url");
        driver.get(url);
        loginPage = new Loginpage(driver);

    }

  @Test (priority = 1)
    public void verifyLoginPageTitleTest(){
      Assert.assertEquals(loginPage.getPageTitle(), "nopCommerce demo store. Login",
              "Login Page title not correct.");
  }


    @Test (priority = 2)
    public void logintest(){
        loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
    }



    }






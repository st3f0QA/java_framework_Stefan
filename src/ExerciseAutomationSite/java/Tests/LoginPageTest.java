package Tests;

import helpers.Test_Methods;
import org.testng.annotations.Test;


public class LoginPageTest {
    Test_Methods signing = new Test_Methods();

    @Test
    public void TestTheFailedLogin(){
        signing.FailedLogin();
    }
    @Test
    public void TestTheSignUp(){
        signing.TestSignUp();
    }
//    @Test
//    public void checkEmailAddressLogin(){
////        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        // Locate the element with class 'login-form'
//
////        loginForm.click();
//        // Get the value of the 'data-qa' attribute
////        String dataQaValue = loginForm.getAttribute("data-qa");
//
//
//
//    }
//    @Test
//    public void closeTheDriver(){
//        driver.quit();
//    }


}

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
    public void TestTheSignUpAndLoggingOut(){
        signing.TestSignUp();
        //log out
        signing.LogOut();
    }

}

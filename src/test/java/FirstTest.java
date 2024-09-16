import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class FirstTest {
        @Test
        public void firstTest(){
                System.setProperty("webdriver.http.factory","jdk-http-client");
                System.setProperty("webdriver.chrome.driver","C:\\Users\\stsol\\IdeaProjects\\chromedriver-win64\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.navigate().to("https://www.enetscores.com");
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.close();
        }

}



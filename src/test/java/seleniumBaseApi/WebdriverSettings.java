package seleniumBaseApi;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class WebdriverSettings {
    public ChromeDriver driver;

    @BeforeTest
    public void setUp() {
        String exePath = "C:\\Drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();
    }

    @AfterTest
    public void close() {
    //    driver.quit();
    }

}

package seleniumBaseApi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;



public class ThirdTest extends WebdriverSettings{

  @Test
    public void testClickButtonInfo() {
        driver.get("https://formy-project.herokuapp.com/dropdown");
        driver.findElement(By.xpath("//button[contains(@id,'dropdownMenuButton')]")).click();
        driver.findElement(By.xpath("//a[contains(@id, 'autocomplete')]")).click();
         String URL = driver.getCurrentUrl();
         Assert.assertEquals(URL, "https://formy-project.herokuapp.com/autocomplete" );

    }
}

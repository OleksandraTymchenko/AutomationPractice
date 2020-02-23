package seleniumBaseApi;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SecondTestCheckboxes extends WebdriverSettings {
    @DataProvider(name = "data-provider")
    public Object[][] dataProviderXPath() {
        return new Object[][]{
                {"//input[contains(@id, 'checkbox-1')]"},
                {"//input[contains(@id, 'checkbox-2')]"},
                {"//input[contains(@id, 'checkbox-3')]"},

        };

    }

    @Test(dataProvider = "data-provider")
    public void testMethod(String data) {
        driver.get("https://formy-project.herokuapp.com/checkbox");
        driver.findElement(By.xpath(data)).click();
        System.out.println("data is: " + data);
    }

    @DataProvider(name = "data-provider2")
    public Object[][] dataProviderCss() {
        return new Object[][]{
                {"#checkbox-1"},
                {"#checkbox-2"},
                {"#checkbox-3"},

        };

    }

    @Test(dataProvider = "data-provider2")
    public void testMethodSecond(String data) {
        driver.get("https://formy-project.herokuapp.com/checkbox");
        driver.findElement(By.cssSelector(data)).click();
        System.out.println("data is: " + data);
    }
}

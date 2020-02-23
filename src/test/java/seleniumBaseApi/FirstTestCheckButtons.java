package seleniumBaseApi;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class FirstTestCheckButtons extends WebdriverSettings {

    @Test(priority = 1)

    public void testClickButtonPrimary() {
        driver.get("https://formy-project.herokuapp.com/buttons");
        driver.findElement(By.xpath("//form//button[contains(@class, 'btn-primary')]")).click();
    }

    @Test(priority = 2)
    public void testClickButtonSuccess() {
        driver.get("https://formy-project.herokuapp.com/buttons");
        driver.findElement(By.xpath("//form//button[contains(@class, 'btn-success')]")).click();
    }

    @Test(priority = 3)
    public void testClickButtonInfo() {
        driver.get("https://formy-project.herokuapp.com/buttons");
        driver.findElement(By.xpath("//form//button[contains(@class, 'btn-info')]")).click();
    }

    @Test(priority = 4)
    public void testClickButtonWarning() {
        driver.get("https://formy-project.herokuapp.com/buttons");
        driver.findElement(By.xpath("//form//button[contains(@class, 'btn-warning')]")).click();
    }

    @Test(priority = 5)
    public void testClickButtonDanger() {
        driver.get("https://formy-project.herokuapp.com/buttons");
        driver.findElement(By.xpath("//form//button[contains(@class, 'btn-danger')]")).click();
    }

    @Test(priority = 6)
    public void testClickButtonLink() {
        driver.get("https://formy-project.herokuapp.com/buttons");
        driver.findElement(By.xpath("//form//button[contains(@class, 'btn-link')]")).click();
    }

    @Test(priority = 7)
    public void testClickButtonLeft() {
        driver.get("https://formy-project.herokuapp.com/buttons");
        driver.findElement(By.xpath("//div[contains(@class, 'btn-group')]//button[contains(text(), 'Left')]")).click();
    }

    @Test(priority = 8)
    public void testClickButtonMiddle() {
        driver.get("https://formy-project.herokuapp.com/buttons");
        driver.findElement(By.xpath("//div[contains(@class, 'btn-group')]//button[contains(text(), 'Middle')]")).click();
    }

    @Test(priority = 10)
    public void testClickButtonRight() {
        driver.get("https://formy-project.herokuapp.com/buttons");
        driver.findElement(By.xpath("//div[contains(@class, 'btn-group')]//button[contains(text(), 'Right')]")).click();
    }

    @Test(priority = 11)
    public void testClickButtonOne() {
        driver.get("https://formy-project.herokuapp.com/buttons");
        driver.findElement(By.xpath("//div[contains(@aria-label, 'Button group with nested dropdown')]//button[contains(text(), '1')]")).click();
    }

    @Test(priority = 12)
    public void testClickButtonTwo() {
        driver.get("https://formy-project.herokuapp.com/buttons");
        driver.findElement(By.xpath("//div[contains(@aria-label, 'Button group with nested dropdown')]//button[contains(text(), '2')]")).click();
    }

    @Test(priority = 13)
    public void testClickDropdown() {
        driver.get("https://formy-project.herokuapp.com/buttons");
        driver.findElement(By.xpath("//button[contains(@id,'btnGroupDrop1')]")).click();
    }

    @Test(priority = 14)
    public void testClickDropdownLinkOne() {
        driver.get("https://formy-project.herokuapp.com/buttons");
        driver.findElement(By.xpath("//button[contains(@id,'btnGroupDrop1')]")).click();
        driver.findElement(By.xpath("//div//a[contains(text(),'Dropdown link 1')]")).click();
    }

    @Test(priority = 15)
    public void testClickDropdownLinkTwo() {
        driver.get("https://formy-project.herokuapp.com/buttons");
        driver.findElement(By.xpath("//div//a[contains(text(),'Dropdown link 2')]")).click();
    }


}

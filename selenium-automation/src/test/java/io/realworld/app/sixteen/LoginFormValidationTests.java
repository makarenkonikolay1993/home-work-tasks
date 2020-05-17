package io.realworld.app.sixteen;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginFormValidationTests extends MainClassForTests {
    String username = "198219821982@gmail.com";
    String password = "qwerty123";
    WebElement userNameField;
    @Test
    public void loginTestTest() {
        methodForSignIn();

        assertThat(driver.findElement(By.xpath("//a[@href='#@"+username+"']")));
    }

    @Test
    public void navigateToHomepageTest() {
        methodForSignIn();

        driver.findElement(By.xpath("//a[@href='#']")).click();

        String expectedResult = "Your Feed";
        String homepageChecker = driver.findElement(By.xpath("//div//a[text()='Your Feed']")).getText();
        assertThat(homepageChecker).isEqualTo(expectedResult);
    }

    @Test
    public void navigateToNewPostTest() {
        methodForSignIn();

        driver.findElement(By.xpath("//a[@href='#editor']")).click();

        String expectedResult = "Publish Article";
        String homepageChecker = driver.findElement(By.xpath("//form//button[text()='Publish Article']")).getText();
        assertThat(homepageChecker).isEqualTo(expectedResult);
    }

    @Test
    public void navigateToSettingsTest() {
        methodForSignIn();

        driver.findElement(By.xpath("//a[@href='#settings']")).click();

        String expectedResult = "Your Settings";
        String homepageChecker = driver.findElement(By.xpath("//form//button[text()='Update Settings']")).getText();
        assertThat(homepageChecker).isEqualTo(expectedResult);
    }

    @Test
    public void logOutTest() {
        methodForSignIn();

        driver.findElement(By.xpath("//a[@href='#settings']")).click();

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 500);");

        WebElement element = driver.findElement(By.xpath("//form/following::button"));
        //new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOf(element));
        element.click();
        WebElement signUpButton = driver.findElement(By.cssSelector("a[href='#register']"));
        assertThat(signUpButton.isDisplayed()).isTrue();
    }

    private void methodForSignIn() {
        driver.get("https://react-redux.realworld.io/#/?_k=zsn71u");
        WebElement signUpHomeButton = driver.findElement(By.cssSelector("a[href='#login']"));
        signUpHomeButton.click();

        eMailField = inputFindByType("email");
        passwordField = inputFindByType("password");
        signInButton = inputFindByType("submit");

        eMailField.clear();

        eMailField.sendKeys(username);

        passwordField.clear();
        passwordField.sendKeys(password);

        signInButton.click();
    }
}

package io.realworld.app.seventeen;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.realworld.app.model.User;
import io.realworld.app.utils.UserData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.concurrent.TimeUnit;

public class MainClassForTests {
    protected WebDriver driver;
    User defaultUser = UserData.defaultUser();

    @BeforeClass
    public void setUpDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://react-redux.realworld.io/#/?_k=zsn71u");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    protected void checkPage(String pageName) {
        WebElement signName = driver.findElement(By.cssSelector(".auth-page h1"));
        assertThat(signName.getText()).isEqualTo(pageName);
    }

    protected void inputText(WebElement element, String text){
        element.clear();
        element.sendKeys(text);
    }

    protected void clickSignInButton() {
        driver.findElement(By.xpath("//form//button[@type='submit']")).click();
    }

    protected WebElement usernameField() {
        return driver.findElement(By.cssSelector("input[type='text']"));
    }

    protected WebElement passwordField() {
        return driver.findElement(By.cssSelector("input[type='password']"));
    }

    protected WebElement emailField() {
        return driver.findElement(By.cssSelector("input[type='email']"));
    }

    protected void userShouldBeLoggedIn(String userName) {
        WebElement checkUserName = driver.findElement(By.xpath("//a[@href='#@"+userName+"']"));
        assertThat(checkUserName.isDisplayed()).isTrue();
    }

    protected void clickSignUpButton() {
        driver.findElement(By.cssSelector("a[href='#register']")).click();
    }

    protected void clickSignInButtonInHeader () {
        driver.findElement(By.cssSelector("a[href='#login']")).click();
    }

    protected void clickNewPostButton() {
        driver.findElement(By.xpath("//a[@href='#editor']")).click();
    }

    protected void newPostPageCheck() {
        assertThat(driver.findElement(By.xpath("//form//button[text()='Publish Article']")).getText()).isEqualTo("Publish Article");
    }

    protected void clickHomeButton() {
        driver.findElement(By.xpath("//a[@href='#']")).click();
    }

    protected void homePageCheck() {
        assertThat(driver.findElement(By.xpath("//div//a[text()='Your Feed']")).getText()).isEqualTo("Your Feed");
    }

    protected void scrollToFooter() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 500);");
    }
}

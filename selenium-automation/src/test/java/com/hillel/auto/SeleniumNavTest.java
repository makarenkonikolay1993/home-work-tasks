package com.hillel.auto;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SeleniumNavTest {

    private WebDriver driver;

    @BeforeClass
    public void setUpDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void seleniumDevSiteShouldBeOpen() {


        driver.get("https://www.selenium.dev/");
        assertThat(driver.getTitle())
                .isEqualTo("SeleniumHQ Browser Automation");
    }

    @Test
    public void seleniumDownloadsShouldBeOpen() {
        driver.get("https://www.selenium.dev/downloads/");
        assertThat(driver.getTitle())
                .isEqualTo("Downloads");
    }

    @Test
    public void seleniumProjectsShouldBeOpen() {
        driver.get("https://www.selenium.dev/projects/");
        assertThat(driver.getTitle())
                .isEqualTo("Selenium Projects");
    }

    @Test
    public void seleniumDocumentationShouldBeOpen() {
        driver.get("https://www.selenium.dev/documentation/en/");
        assertThat(driver.getTitle())
                .isEqualTo("The Selenium Browser Automation Project :: Documentation for Selenium");
    }

    @Test
    public void seleniumBlogShouldBeOpen() {
        driver.get("https://www.selenium.dev/blog/");
        assertThat(driver.getTitle())
                .isEqualTo("Selenium Blog");
    }

    @Test
    public void seleniumNavBackFromDownloadsShouldBeWork() {
        driver.get("https://www.selenium.dev/");
        driver.get("https://www.selenium.dev/downloads/");
        driver.navigate().back();
        assertThat(driver.getTitle())
                .isEqualTo("SeleniumHQ Browser Automation");
    }

    @Test
    public void seleniumNavBackForwardShouldBeWork() {
        driver.get("https://www.selenium.dev/");
        driver.get("https://www.selenium.dev/downloads/");
        driver.navigate().back();
        driver.navigate().forward();
        assertThat(driver.getTitle())
                .isEqualTo("Downloads");
    }
}

package io.realworld.app.seventeen;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LoginFormValidationTests extends MainClassForTests {

//
    @Test
    public void loginTestTest() {
        clickSignInButtonInHeader();

        checkPage("Sign In");

        inputText(emailField(), defaultUser.getEmail());
        inputText(passwordField(), defaultUser.getPassword());

        clickSignInButton();

        userShouldBeLoggedIn(defaultUser.getUsername());
    }

    @Test
    public void navigateToHomepageTest() {
        clickSignInButtonInHeader();

        checkPage("Sign In");

        inputText(emailField(), defaultUser.getEmail());
        inputText(passwordField(), defaultUser.getPassword());

        clickSignInButton();

        userShouldBeLoggedIn(defaultUser.getUsername());

        clickHomeButton();

        homePageCheck();
    }

    @Test
    public void navigateToNewPostTest() {
        clickSignInButtonInHeader();

        checkPage("Sign In");

        inputText(emailField(), defaultUser.getEmail());
        inputText(passwordField(), defaultUser.getPassword());

        clickSignInButton();

        userShouldBeLoggedIn(defaultUser.getUsername());

        clickNewPostButton();

        newPostPageCheck();
    }

    @Test
    public void navigateToSettingsTest() {
        clickSignInButtonInHeader();

        checkPage("Sign In");

        inputText(emailField(), defaultUser.getEmail());
        inputText(passwordField(), defaultUser.getPassword());

        clickSignInButton();

        userShouldBeLoggedIn(defaultUser.getUsername());

        clickSettingsButton();

        settingsPageCheck();
    }

    @Test
    public void logOutTest() {
        clickSignInButtonInHeader();

        checkPage("Sign In");

        inputText(emailField(), defaultUser.getEmail());
        inputText(passwordField(), defaultUser.getPassword());

        clickSignInButton();

        userShouldBeLoggedIn(defaultUser.getUsername());

        clickSettingsButton();

        settingsPageCheck();

        scrollToFooter();

        clickLogOutButton();

        checkLogOut();
    }

    private void loginWithValidUser() {
        clickSignInButtonInHeader();

        checkPage("Sign In");

        inputText(emailField(), defaultUser.getEmail());
        inputText(passwordField(), defaultUser.getPassword());

        clickSignInButton();
    }

    private void settingsPageCheck() {
        assertThat(driver.findElement(By.xpath("//form//button[text()='Update Settings']")).getText()).isEqualTo("Update Settings");
    }

    private void scrollToFooter() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 500);");
    }

    private void clickLogOutButton() {
        driver.findElement(By.cssSelector(".row div > button")).click();
    }

    private void checkLogOut() {
        assertThat(driver.findElement(By.cssSelector(".container > h1")).getText()).isEqualTo("conduit");
    }



    private void clickSettingsButton() {
        driver.findElement(By.xpath("//a[@href='#settings']")).click();
    }




}

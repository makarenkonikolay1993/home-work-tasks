package io.realworld.app.sixteen;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class RegistrationFormValidationTests extends MainClassForTests {
        WebElement signUpButton;
        String userName;
        String email;
        String password;
        WebElement userNameField;


        @Test
        public void realworldSiteShouldBeOpen() {
            driver.get("https://react-redux.realworld.io/#/?_k=zsn71u");
            assertThat(driver.getTitle())
                    .isEqualTo("Conduit");
        }

        @Test
        public void registrationTest() {
            baseForRegistration();

            userNameField.clear();
            userNameField.sendKeys(userName);

            eMailField.clear();
            eMailField.sendKeys(email);

            passwordField.clear();
            passwordField.sendKeys("qwerty123");

            signInButton.click();

            assertThat(driver.findElement(By.xpath("//a[@href='#@"+userName+"']")));
        }

        @Test
        public void usernameSecondUseForRegistrationTest() {
            baseForRegistration();

            userNameField.clear();
            userNameField.sendKeys("realAppHillelTest");

            eMailField.clear();
            eMailField.sendKeys(email);

            passwordField.clear();
            passwordField.sendKeys("qwerty123");

            signInButton.click();


            String text = errorMessage();

            assertThat(text).isEqualTo("username has already been taken");
        }

    @Test
    public void emailSecondUseForRegistrationTest() {
        baseForRegistration();

        userNameField.clear();
        userNameField.sendKeys(userName);

        eMailField.clear();
        eMailField.sendKeys("realAppHillelTest@gmail.com");

        passwordField.clear();
        passwordField.sendKeys("qwerty123");

        signInButton.click();

        String text = errorMessage();

        assertThat(text).isEqualTo("email has already been taken");
    }

        @Test
        public void userNameWithWhitespaceOnlyTest() {
            baseForRegistration();

            userNameField.clear();
            userNameField.sendKeys(" ");

            eMailField.clear();
            eMailField.sendKeys(email);

            passwordField.clear();
            passwordField.sendKeys(password);

            signInButton.click();

            String text = errorMessage();

            assertThat(text).isEqualTo("username can't be blank");
        }

        @Test
        public void testWithoutUserNameUsingBackspaceTest() {
            baseForRegistration();

            //userNameField.clear();
            userNameField.sendKeys(Keys.SPACE, Keys.BACK_SPACE);


            eMailField.clear();
            eMailField.sendKeys(email);

            passwordField.clear();
            passwordField.sendKeys(password);

            signInButton.click();

            String text = errorMessage();

            assertThat(text).isEqualTo("username can't be blankis too short (minimum is 1 character)");
        }

        @Test
        public void testWithoutUserNameTest() {
            baseForRegistration();

            eMailField.clear();
            eMailField.sendKeys(email);

            passwordField.clear();
            passwordField.sendKeys(password);

            signInButton.click();

            String text = errorMessage();

            assertThat(text).isEqualTo("username can't be blankis too short (minimum is 1 character)is too long (maximum is 20 characters)");
            System.out.println();
        }

        @Test
        public void userNameMoreThanTwentyCharsTest() {
            baseForRegistration();

            userNameField.clear();
            userNameField.sendKeys("invalidUserName123123123123");

            eMailField.clear();
            eMailField.sendKeys(email);

            passwordField.clear();
            passwordField.sendKeys(password);

            signInButton.click();

            String text = errorMessage();

            assertThat(text).isEqualTo("username is too long (maximum is 20 characters)");
        }

    @Test
    public void emailWithWhitespaceOnlyTest() {
        baseForRegistration();

        userNameField.clear();
        userNameField.sendKeys(userName);

        eMailField.clear();
        eMailField.sendKeys(Keys.SPACE);

        passwordField.clear();
        passwordField.sendKeys(password);

        signInButton.click();

        String text = errorMessage();

        assertThat(text).isEqualTo("email can't be blank");
    }

    @Test
    public void withoutEmailTest() {
        baseForRegistration();

        userNameField.clear();
        userNameField.sendKeys(userName);

        eMailField.clear();
        eMailField.sendKeys(Keys.SPACE, Keys.BACK_SPACE);

        passwordField.clear();
        passwordField.sendKeys(password);

        signInButton.click();

        String text = errorMessage();

        assertThat(text).isEqualTo("email can't be blank");
    }

    @Test
    public void emailWithoutDomainTest() {
        baseForRegistration();

        userNameField.clear();
        userNameField.sendKeys(userName);

        eMailField.clear();
        eMailField.sendKeys("gggggg@gmail");


        passwordField.clear();
        passwordField.sendKeys(password);

        signInButton.click();

        String text = errorMessage();

        assertThat(text).isEqualTo("email is invalid");
    }

    @Test
    public void blankPasswordTest() {
        baseForRegistration();

        userNameField.clear();
        userNameField.sendKeys(userName);

        eMailField.clear();
        eMailField.sendKeys(email);

        signInButton.click();

        String text = errorMessage();

        assertThat(text).isEqualTo("password can't be blank");
    }

    @Test
    public void shortPasswordTest() {
        baseForRegistration();

        userNameField.clear();
        userNameField.sendKeys(userName);

        eMailField.clear();
        eMailField.sendKeys(email);

        passwordField.sendKeys("1234567");

        signInButton.click();

        String text = errorMessage();

        assertThat(text).isEqualTo("password is too short (minimum is 8 characters)");
    }

    private void baseForRegistration() {
        userName = "testUser" + new Random().nextInt(10000);
        email = userName + "@gmail.com";
        password = "qwerty123";
        driver.get("https://react-redux.realworld.io/#/?_k=zsn71u");
        signUpButton = driver.findElement(By.cssSelector("a[href='#register']"));
        signUpButton.click();

        userNameField = inputFindByType("text");
        eMailField = inputFindByType("email");
        passwordField = inputFindByType("password");
        signInButton = inputFindByType("submit");
    }

    private String errorMessage() {
        WebElement userNameIsBlankError = driver.findElement(By.xpath("//ul[@class='error-messages']/li"));
        return userNameIsBlankError.getText();
    }
}

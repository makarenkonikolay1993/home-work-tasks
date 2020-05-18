package io.realworld.app.seventeen;

import io.realworld.app.model.User;
import io.realworld.app.utils.UserData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class RegistrationFormValidationTests extends MainClassForTests {
    User randomUser = UserData.randomUser();

    @Test
    public void realworldSiteShouldBeOpen() {
        driver.get("https://react-redux.realworld.io/#/?_k=zsn71u");
        assertThat(driver.getTitle()).isEqualTo("Conduit");
    }

    @Test
    public void registrationTest() {
        clickSignUpButton();

        checkPage("Sign Up");

        inputText(usernameField(), randomUser.getUsername());
        inputText(emailField(), randomUser.getEmail());
        inputText(passwordField(), randomUser.getPassword());

        clickSignInButton();

        userShouldBeLoggedIn(randomUser.getUsername());
    }

    @Test
    public void emailAndUsernameSecondUseForRegistrationTest() {
        clickSignUpButton();

        checkPage("Sign Up");

        inputText(usernameField(), defaultUser.getUsername());
        inputText(emailField(), defaultUser.getEmail());
        inputText(passwordField(), defaultUser.getPassword());

        clickSignInButton();

        List<String> displayedErrorMessages = listErrorMessages();

        assertThat(displayedErrorMessages).hasSize(2);


        assertThat(displayedErrorMessages)
                .contains("email has already been taken",
                        "username has already been taken"
                );
    }

    @Test
    public void invalidDataTest() {
        clickSignUpButton();

        checkPage("Sign Up");

        inputText(usernameField(), "invalidUserName123123123123");
        inputText(emailField(), "gggggg@gmail");
        inputText(passwordField(), "1234567");

        clickSignInButton();

        List<String> displayedErrorMessages = listErrorMessages();

        assertThat(displayedErrorMessages).hasSize(3);
        assertThat(displayedErrorMessages)
                .contains("password is too short (minimum is 8 characters)",
                        "email is invalid",
                        "username is too long (maximum is 20 characters)"
                );
    }

    @Test
    public void noInputsForFields() {
        clickSignUpButton();

        checkPage("Sign Up");

        clickSignInButton();

        List<String> displayedErrorMessages = listErrorMessages();

        assertThat(displayedErrorMessages).hasSize(3);
        assertThat(displayedErrorMessages)
                .contains("password can't be blank",
                        "email can't be blank",
                        "username can't be blankis too short (minimum is 1 character)is too long (maximum is 20 characters)"
                );
    }

    private List<String> listErrorMessages() {
        List<WebElement> errorMessages = driver.findElements(By.xpath("//ul[@class='error-messages']/li"));
        List<String> displayedErrorMessages = errorMessages
                .stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());
        return displayedErrorMessages;
    }
}

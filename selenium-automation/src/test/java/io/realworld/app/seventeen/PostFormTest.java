package io.realworld.app.seventeen;

import io.realworld.app.model.Post;
import io.realworld.app.utils.PostData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import static org.assertj.core.api.Assertions.assertThat;

public class PostFormTest extends MainClassForTests {
    Post defaultPost = PostData.defaultPost();
    Post randomPost = PostData.randomPost();

    @Test
    public void addNewPost() {
        clickSignInButtonInHeader();

        checkPage("Sign In");

        inputText(emailField(), defaultUser.getEmail());
        inputText(passwordField(), defaultUser.getPassword());

        clickSignInButton();

        userShouldBeLoggedIn(defaultUser.getUsername());

        clickNewPostButton();

        newPostPageCheck();

        inputText(articleTitleField(), randomPost.getArticleTitle());
        inputText(articleAboutField(), randomPost.getArticleAbout());
        inputText(articleField(), randomPost.getArticle());
        inputText(tagsField(), randomPost.getTag());

        publishNewPost();

        checkAddingNewPost();

        clickHomeButton();

        homePageCheck();


    }

    @Test
    public void checkPostInGlobalFeed() {
        clickSignInButtonInHeader();

        checkPage("Sign In");

        inputText(emailField(), defaultUser.getEmail());
        inputText(passwordField(), defaultUser.getPassword());

        clickSignInButton();

        userShouldBeLoggedIn(defaultUser.getUsername());

        clickNewPostButton();

        newPostPageCheck();

        inputText(articleTitleField(), randomPost.getArticleTitle());
        inputText(articleAboutField(), randomPost.getArticleAbout());
        inputText(articleField(), randomPost.getArticle());
        inputText(tagsField(), randomPost.getTag());

        publishNewPost();

        checkAddingNewPost();

        clickHomeButton();

        homePageCheck();

        clickGlobalFeedButton();

        checkMyPostInGlobalFeed();
    }

    @Test
    public void editPost() {
        clickSignInButtonInHeader();

        checkPage("Sign In");

        inputText(emailField(), defaultUser.getEmail());
        inputText(passwordField(), defaultUser.getPassword());

        clickSignInButton();

        userShouldBeLoggedIn(defaultUser.getUsername());

        clickNewPostButton();

        newPostPageCheck();

        inputText(articleTitleField(), randomPost.getArticleTitle());
        inputText(articleAboutField(), randomPost.getArticleAbout());
        inputText(articleField(), randomPost.getArticle());
        inputText(tagsField(), randomPost.getTag());

        publishNewPost();

        checkAddingNewPost();

        clickEditArticleButton();

        inputText(articleTitleField(), defaultPost.getArticleTitle());
        inputText(articleAboutField(), defaultPost.getArticleAbout());
        inputText(articleField(), defaultPost.getArticle());
        inputText(tagsField(), defaultPost.getTag());

        checkEditedPost();
    }

    @Test
    public void deleteAddedPost() {
        clickSignInButtonInHeader();

        checkPage("Sign In");

        inputText(emailField(), defaultUser.getEmail());
        inputText(passwordField(), defaultUser.getPassword());

        clickSignInButton();

        userShouldBeLoggedIn(defaultUser.getUsername());

        clickNewPostButton();

        newPostPageCheck();

        inputText(articleTitleField(), randomPost.getArticleTitle());
        inputText(articleAboutField(), randomPost.getArticleAbout());
        inputText(articleField(), randomPost.getArticle());
        inputText(tagsField(), randomPost.getTag());

        publishNewPost();

        checkAddingNewPost();

        clickDeleteArticleButton();

        goToMyArticlesPage();

        checkDeletedPost();
    }

    private WebElement articleTitleField() {
        return allInputs().get(0);
    }

    private WebElement articleAboutField() {
        return allInputs().get(1);
    }

    private WebElement tagsField() {
        return allInputs().get(2);
    }

    private WebElement articleField() {
        return driver.findElement(By.xpath("//textarea"));
    }

    private List<WebElement> allInputs() {
        return new ArrayList<>(driver.findElements(By.xpath("//form//descendant::input")));
    }

    private void publishNewPost() {
        driver.findElement(By.xpath("//button")).click();
    }

    private void checkAddingNewPost() {
        assertThat(driver.findElement(By.xpath("//h1")).getText()).isEqualTo(randomPost.getArticleTitle());
        assertThat(driver.findElement(By.cssSelector(".author")).getText()).isEqualTo(defaultUser.getUsername());
        assertThat(driver.findElement(By.cssSelector(".date")).getText()).isEqualTo(checkDateWhenPostAdd());
        assertThat(driver.findElement(By.xpath("//div[@class='container page']//p")).getText()).isEqualTo(randomPost.getArticle());
    }

    private String checkDateWhenPostAdd() {
        SimpleDateFormat formatDate = new SimpleDateFormat("E MMM d yyyy", Locale.ENGLISH);
        return formatDate.format(new Date());
    }

    private void clickGlobalFeedButton() {
        driver.findElement(By.xpath("//a[contains(text(),'Global Feed')]")).click();
    }

    private void checkMyPostInGlobalFeed() {
        String articleTitle = randomPost.getArticleTitle();
        assertThat(driver.findElement(By.xpath(
                "//a[contains(@href, '"+ articleTitle.toLowerCase() + "')]/h1")).getText()).isEqualTo(articleTitle);
    }

    private void clickEditArticleButton() {
        driver.findElement(By.xpath("//div[@class='article-meta']/span/a")).click();
    }

    private void clickDeleteArticleButton() {
        driver.findElement(By.xpath("//div[@class='article-meta']/span/button")).click();
    }

    private void checkEditedPost() {
        assertThat(driver.findElement(By.xpath("//h1")).getText()).isEqualTo(defaultPost.getArticleTitle());
        assertThat(driver.findElement(By.cssSelector(".author")).getText()).isEqualTo(defaultUser.getUsername());
        assertThat(driver.findElement(By.cssSelector(".date")).getText()).isEqualTo(checkDateWhenPostAdd());
        assertThat(driver.findElement(By.xpath("//div[@class='container page']//p")).getText()).isEqualTo(defaultPost.getArticle());
    }

    private void checkDeletedPost() {
        String articleTitle = randomPost.getArticleTitle();
        assertThat(driver.findElements(By.xpath(
                "//a[contains(@href, '"+ articleTitle.toLowerCase() + "')]/h1")).isEmpty());
    }

    private void goToMyArticlesPage() {
        driver.findElement(By.xpath("//a[@href='#@"+defaultUser.getUsername()+"']")).click();
    }

    private void clearAllFieldsOfPost() {
        articleTitleField().clear();
        articleAboutField().clear();
        articleField().clear();
        tagsField().clear();
    }
}

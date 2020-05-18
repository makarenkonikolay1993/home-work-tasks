package io.realworld.app.model;

public class Post {
    String articleTitle;
    String articleAbout;
    String article;
    String tag;

    public Post(String articleTitle, String articleAbout, String article, String tag) {
        this.articleTitle = articleTitle;
        this.articleAbout = articleAbout;
        this.article = article;
        this.tag = tag;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleAbout() {
        return articleAbout;
    }

    public void setArticleAbout(String articleAbout) {
        this.articleAbout = articleAbout;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}

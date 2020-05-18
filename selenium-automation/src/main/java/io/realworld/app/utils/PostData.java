package io.realworld.app.utils;

import io.realworld.app.model.Post;

import java.util.Random;

public class PostData {
    public static Post defaultPost() {
        return new Post("RealWorldTest", "This article is about testing", "article", "tag");
    }

    public static Post randomPost() {
        int random = new Random().nextInt(1000);
        String articleTitle = "articleTitle" + random;
        String articleAbout = "articleAbout" + random;
        String article = "article" + random;
        String tag = "tag" + random;
        return new Post(articleTitle, articleAbout, article, tag);
    }
}

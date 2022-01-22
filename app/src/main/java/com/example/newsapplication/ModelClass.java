package com.example.newsapplication;

public class ModelClass {

    private String author,title,description,uri,utlToImage, publishedAt;

    public ModelClass(String author, String title, String description, String uri, String utlToImage, String publishedAt) {
        this.author = author;
        this.title = title;
        this.description = description;
        this.uri = uri;
        this.utlToImage = utlToImage;
        this.publishedAt = publishedAt;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getUtlToImage() {
        return utlToImage;
    }

    public void setUtlToImage(String utlToImage) {
        this.utlToImage = utlToImage;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }
}

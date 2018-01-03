package com.jskj.ssm.model;

import java.io.Serializable;

public class Article implements Serializable {
    private int artId;
    private String artTitle;
    private String artText;
    private String artType;
    private String artPicturePath;
    private String artURL;
    private String artDate;
    private  String artAuthor;
    private  String artEditor;
    private String artReadNum;



    public Article(){
    }

    public Article(int artId, String artTitle, String artText, String artType, String artPicturePath, String artURL, String artDate,String artAuthor,String artEditor,String artReadNum) {
        this.artId = artId;
        this.artTitle = artTitle;
        this.artText = artText;
        this.artType = artType;
        this.artPicturePath = artPicturePath;
        this.artURL = artURL;
        this.artDate = artDate;
        this.artAuthor=artAuthor;
        this.artEditor=artEditor;
        this.artReadNum=artReadNum;

    }



    public int getArtId() {
        return artId;
    }

    public void setArtId(int artId) {
        this.artId = artId;
    }

    public String getArtTitle() {
        return artTitle;
    }

    public void setArtTitle(String artTitle) {
        this.artTitle = artTitle;
    }

    public String getArtText() {
        return artText;
    }

    public void setArtText(String artText) {
        this.artText = artText;
    }

    public String getArtType() {
        return artType;
    }

    public void setArtType(String artType) {
        this.artType = artType;
    }

    public String getArtPicturePath() {
        return artPicturePath;
    }

    public void setArtPicturePath(String artPicturePath) {
        this.artPicturePath = artPicturePath;
    }

    public String getArtURL() {
        return artURL;
    }

    public void setArtURL(String artURL) {
        this.artURL = artURL;
    }

    public String getArtDate() {
        return artDate;
    }

    public void setArtDate(String artDate) {
        this.artDate = artDate;
    }

    public String getArtAuthor() {
        return artAuthor;
    }

    public void setArtAuthor(String artAuthor) {
        this.artAuthor = artAuthor;
    }

    public String getArtEditor() {
        return artEditor;
    }

    public void setArtEditor(String artEditor) {
        this.artEditor = artEditor;
    }

    public String getArtReadNum() {
        return artReadNum;
    }

    public void setArtReadNum(String artReadNum) {
        this.artReadNum = artReadNum;
    }

    @Override
    public String toString() {
        return "Article{" +
                "artId=" + artId +
                ", artTitle='" + artTitle + '\'' +
                ", artText='" + artText + '\'' +
                ", artType='" + artType + '\'' +
                ", artPicturePath='" + artPicturePath + '\'' +
                ", artURL='" + artURL + '\'' +
                ", artDate='" + artDate + '\'' +
                ", artAuthor='" + artAuthor + '\'' +
                ", artEditor='" + artEditor + '\'' +
                ", artReadNum='" + artReadNum + '\'' +
                '}';
    }
}

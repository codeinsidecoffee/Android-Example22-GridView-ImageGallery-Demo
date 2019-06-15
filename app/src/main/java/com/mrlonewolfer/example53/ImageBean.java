package com.mrlonewolfer.example53;

public class ImageBean {
    int imgId;
    String imgContent;

    public ImageBean(int imgId, String imgContent) {
        this.imgId = imgId;
        this.imgContent = imgContent;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getImgContent() {
        return imgContent;
    }

    public void setImgContent(String imgContent) {
        this.imgContent = imgContent;
    }
}

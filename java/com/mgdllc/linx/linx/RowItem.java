package com.mgdllc.linx.linx;

public class RowItem {
    private int imageId;
    private String title;
    private String desc;
    private String url;

    public RowItem(int imageId, String title, String desc, String url) {
        this.imageId = imageId;
        this.title = title;
        this.desc = desc;
        this.url = url
    }
    public int getImageId() {
        return imageId;
    }
    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String getURL() {
        return url;
    }
    public void setURL(String url) {
        this.url = url;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title + "\n" + desc + "\n" + url;
    }
}

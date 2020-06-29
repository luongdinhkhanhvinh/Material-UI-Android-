package com.mediatechindo.wahyu.materialuikit.template.GalleryCategory.Style8;

/**
 * Created by Wahyu on 06/08/2015.
 */
public class GalleryStyle8RecentModel {

    public GalleryStyle8RecentModel(int pos, String url){
        id = pos;
        imageUrl = url;
    }

    public GalleryStyle8RecentModel(int pos){
        id = pos;
    }

    public GalleryStyle8RecentModel(){

    }

    private int id;
    private String imageUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}

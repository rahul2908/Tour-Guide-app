package com.example.dell.tourguide;

/**
 * Created by dell on 2/1/2017.
 */

public class Tour {
    private String textName;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int imageResourceId = NO_IMAGE_PROVIDED;

    public Tour(String txtName,int imgResourceId){
        textName = txtName;
        imageResourceId = imgResourceId;
    }

    public String getTextName(){
        return textName;
    }
    public int getImageResourceId(){
        return imageResourceId;
    }
    public boolean hasImage(){
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

}


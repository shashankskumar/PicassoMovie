package com.skumar.picassomovie;

/**
 * Created by shashankshivakumar on 11/21/17.
 */

public class Movie {
    private String name;
    private boolean isFavorite = false;
    private String imageUrl;

    public Movie(String name, String imageUrl) {
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void toggleFavorite() {
        isFavorite = !isFavorite;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}

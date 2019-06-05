package com.github.git_leon.jfoot.sprite;

import com.github.git_leon.jfoot.system.resources.JFootImage;
import greenfoot.GreenfootImage;

import java.util.List;

public abstract class AnimatedSprite extends Sprite {
    private int currentImageIndex = 0;
    private int lifetime;

    public AnimatedSprite(String basename, String suffix, int noOfImages) {
        super(JFootImage.createImages(basename, suffix, noOfImages));
    }

    public AnimatedSprite(List<GreenfootImage> imageList) {
        super(imageList);
    }

    @Override
    public final void act() {
        animate();
        postAnimationBehavior();
    }

    abstract public void postAnimationBehavior();

    public void animate(int frequency) {
        if (lifetime == 0) {
            currentImageIndex++;
            currentImageIndex %= imageList.size();
            setImage(imageList.get(currentImageIndex));
        }
        lifetime %= frequency;
        lifetime++;
    }

    public void animate() {
        animate(1);
    }


    public void flipImagesHorizontally() {
        imageList.forEach(GreenfootImage::mirrorHorizontally);
    }

    public void flipImagesVertically() {
        imageList.forEach(GreenfootImage::mirrorVertically);
    }

    public List<GreenfootImage> getImages() {
        return imageList;
    }
}

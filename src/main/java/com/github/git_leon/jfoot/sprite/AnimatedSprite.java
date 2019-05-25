package com.github.git_leon.jfoot.sprite;

import greenfoot.GreenfootImage;

import java.util.Arrays;
import java.util.List;

public abstract class AnimatedSprite extends Sprite {
    protected int lifetime;
    private int currentImageIndex = 0;
    protected boolean flippedHorizontally;
    protected boolean flippedVertically;

    public AnimatedSprite(String basename, String suffix, int noOfImages) {
        super(createImages(basename, suffix, noOfImages));
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
        if (lifetime % frequency == 0) {
            currentImageIndex++;
            currentImageIndex %= imageList.size();
            setImage(imageList.get(currentImageIndex));
        }
        lifetime++;
    }

    public void animate() {
        animate(1);
    }


    public void flipImagesHorizontally() {
        imageList.forEach(image -> image.mirrorHorizontally());
        this.flippedHorizontally = !flippedHorizontally;
    }

    public void flipImagesVertically() {
        imageList.forEach(image -> image.mirrorVertically());
        this.flippedVertically = !flippedVertically;
    }

    public static List<GreenfootImage> createImages(String basename, String suffix, int noOfImages) {
        GreenfootImage[] immageArray = new GreenfootImage[noOfImages];
        for (int i = 0; i < noOfImages; i++)
            immageArray[i] = new GreenfootImage(basename + i + suffix);
        List<GreenfootImage> imageList = Arrays.asList(immageArray);
        return imageList;
    }

    public List<GreenfootImage> getImages() {
        return imageList;
    }
}

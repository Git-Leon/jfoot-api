package com.github.git_leon.jfoot.sprite;

import greenfoot.Actor;
import greenfoot.GreenfootImage;
import greenfoot.World;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;










public abstract class Sprite extends Actor implements SpriteInterface {
    protected final List<GreenfootImage> imageList;

    public Sprite(Actor actor) {
        this(actor.getImage());
    }

    public Sprite(SpriteInterface spriteDecoratee) {
        this(spriteDecoratee.getImageList());
    }

    public Sprite(String imageName) {
        this(new String[]{imageName});
    }

    public Sprite(String[] imageNames) {
        this.imageList = new ArrayList<>();
        List<String> imageNameList = new ArrayList<>(Arrays.asList(imageNames));
        imageNameList.forEach(image -> this.imageList.add(new GreenfootImage(image)));
        setImage(imageList.get(0));
    }

    public Sprite(String basename, String suffix, int noOfImages) {
        GreenfootImage[] imageArray = new GreenfootImage[noOfImages];
        for (int i = 0; i < noOfImages; i++)
            imageArray[i] = new GreenfootImage(basename + i + suffix);
        imageList = Arrays.asList(imageArray);
        setImage(imageList.get(0));
    }

    public Sprite(List<GreenfootImage> imageList) {
        this.imageList = imageList;
        setImage(imageList.get(0));
    }

    public Sprite(GreenfootImage image) {
        this(Arrays.asList(image));
    }

    @Override
    public List<GreenfootImage> getImageList() {
        return imageList;
    }

    @Override
    public Sprite getOneObjectAtOffset(int x, int y, Class cls) {
        return (Sprite) super.getOneObjectAtOffset(x, y, cls);
    }

    @Override
    public final World getWorld() {
        return super.getWorld();
    }

    public void setLocation(Actor actor) {
        setLocation(actor.getX(), actor.getY());
    }

    public boolean isAddedToWorld() {
        return getWorld() != null;
    }
}

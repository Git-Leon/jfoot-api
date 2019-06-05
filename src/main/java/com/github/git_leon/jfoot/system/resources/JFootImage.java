package com.github.git_leon.jfoot.system.resources;

import greenfoot.GreenfootImage;

import java.util.Arrays;
import java.util.List;

public class JFootImage extends GreenfootImage {
    public JFootImage(String filename) throws IllegalArgumentException {
        super(filename);
    }

    public JFootImage(int width, int height) {
        super(width, height);
    }

    public JFootImage(GreenfootImage image) throws IllegalArgumentException {
        super(image);
    }


    public static List<GreenfootImage> createImages(String basename, String suffix, int noOfImages) {
        GreenfootImage[] immageArray = new GreenfootImage[noOfImages];
        for (int i = 0; i < noOfImages; i++)
            immageArray[i] = new JFootImage(basename + i + suffix);
        List<GreenfootImage> imageList = Arrays.asList(immageArray);
        return imageList;
    }
}

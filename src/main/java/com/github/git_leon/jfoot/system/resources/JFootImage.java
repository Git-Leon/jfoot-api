package com.github.git_leon.jfoot.system.resources;

import greenfoot.GreenfootImage;

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

}

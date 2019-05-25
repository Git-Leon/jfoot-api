package com.github.git_leon.jfoot.sprite;

import greenfoot.GreenfootImage;

/**
 * The purpose of this class is to model visible sprite decorations;
 * i.e. - vehicles which control the movement of a sprite
 */
public class SpriteDecorator extends Sprite implements SpriteWrapper {
    protected final Sprite sprite;

    public SpriteDecorator(Sprite sprite) {
        super(sprite.getImage());
        this.sprite = sprite;
    }

    @Override
    public void act() {
        sprite.act();
    }

    @Override
    public int getX() throws IllegalStateException {
        return sprite.getX();
    }

    @Override
    public int getY() {
        return sprite.getY();
    }

    @Override
    public int getRotation() {
        return sprite.getRotation();
    }

    @Override
    public void setRotation(int rotation) {
        sprite.setRotation(rotation);
    }

    @Override
    public void setLocation(int x, int y) {
        sprite.setLocation(x, y);
    }

    @Override
    public GreenfootImage getImage() {
        return sprite.getImage();
    }

    @Override
    public void setImage(String filename) throws IllegalArgumentException {
        sprite.setImage(filename);
    }

    @Override
    public void setImage(GreenfootImage image) {
        sprite.setImage(image);
    }

    @Override
    public void move(int degrees) {
        sprite.move(degrees);
    }

    @Override
    public void turn(int degrees) {
        sprite.turn(degrees);
    }

    @Override
    public Sprite getSprite() {
        return sprite;
    }
}

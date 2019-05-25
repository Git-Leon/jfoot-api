package com.github.git_leon.jfoot.sprite;

import com.github.git_leon.jfoot.world.AbstractJFootWorld;
import greenfoot.GreenfootImage;


/**
 * The purpose of this class is to model invisible sprite decorations;
 * i.e. - sensors
 */
public class SpriteFacade implements SpriteWrapper {
    protected final Sprite sprite;

    public SpriteFacade(Sprite sprite) {
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
    public AbstractJFootWorld getWorld() {
        return sprite.getWorld();
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
    public void moveLeft(int xOffset) {
        sprite.moveLeft(xOffset);
    }

    @Override
    public void moveRight(int xOffset) {
        sprite.moveRight(xOffset);
    }

    @Override
    public void moveUp(int yOffset) {
        sprite.moveUp(yOffset);
    }

    @Override
    public void moveDown(int yOffset) {
        sprite.moveDown(yOffset);
    }

    @Override
    public Sprite getOneObjectAtOffset(int x, int y, Class cls) {
        return sprite.getOneObjectAtOffset(x, y, cls);
    }

    @Override
    public Sprite getSprite() {
        return sprite;
    }
}

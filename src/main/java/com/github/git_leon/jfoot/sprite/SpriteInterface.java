package com.github.git_leon.jfoot.sprite;

import com.github.git_leon.jfoot.world.AbstractJFootWorld;
import greenfoot.GreenfootImage;

/**
 * A common interface between Sprite, SpriteFacade, and SpriteDecorator
 */
public interface SpriteInterface<SpriteSubType extends SpriteInterface> {
    void act();

    int getX() throws IllegalStateException;

    int getY();

    int getRotation();

    void setRotation(int rotation);

    void setLocation(int x, int y);

    GreenfootImage getImage();

    void setImage(String filename) throws IllegalArgumentException;

    void setImage(GreenfootImage image);

    void move(int degrees);

    void turn(int degrees);


    void moveLeft(int xOffset);

    void moveRight(int xOffset);

    void moveUp(int yOffset);

    void moveDown(int yOffset);

    SpriteSubType getOneObjectAtOffset(int x, int y, Class<SpriteSubType> cls);

    <SpriteWorldSubType extends AbstractJFootWorld> SpriteWorldSubType getWorld();
}
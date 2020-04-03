package com.github.git_leon.jfoot.sprite;

import greenfoot.Actor;
import greenfoot.GreenfootImage;
import greenfoot.World;

import java.util.List;

/**
 * A common interface between Sprite, SpriteFacade, and SpriteDecorator
 */
public interface SpriteInterface {
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

    <WorldType extends World> WorldType getWorld();


    default <ActorType extends Actor> ActorType getOneObjectAtOffset(int x, int y, Class<ActorType> cls) {
        return getOneObjectAtOffset(x, y, cls);
    }

    List<GreenfootImage> getImageList();
}
package com.github.git_leon.jfoot.sprite;

import greenfoot.Actor;
import greenfoot.GreenfootImage;
import greenfoot.World;

import java.util.Arrays;
import java.util.List;

public interface ActorWrapperInterface extends SpriteInterface {
    <ActorType extends Actor> ActorType getActor();

    default void act() {
        getActor().act();
    }

    default int getX() throws IllegalStateException {
        return getActor().getX();
    }

    default int getY() {
        return getActor().getY();
    }

    default int getRotation() {
        return getActor().getRotation();
    }

    default void setRotation(int rotation) {
        getActor().setRotation(rotation);
    }

    default void setLocation(int x, int y) {
        getActor().setLocation(x, y);
    }

    default GreenfootImage getImage() {
        return getActor().getImage();
    }

    default void setImage(String filename) throws IllegalArgumentException {
        getActor().setImage(filename);
    }

    default void setImage(GreenfootImage image) {
        getActor().setImage(image);
    }

    default void move(int degrees) {
        getActor().move(degrees);
    }

    default void turn(int degrees) {
        getActor().turn(degrees);
    }

    default <WorldType extends World> WorldType getWorld() {
        return (WorldType) getActor().getWorld();
    }

    default List<GreenfootImage> getImageList() {
        return Arrays.asList(getActor().getImage());
    }
}

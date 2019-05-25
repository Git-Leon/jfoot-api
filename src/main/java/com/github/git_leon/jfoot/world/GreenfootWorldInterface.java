package com.github.git_leon.jfoot.world;

import greenfoot.Actor;
import greenfoot.Color;
import greenfoot.GreenfootImage;

import java.util.Collection;
import java.util.List;

public interface GreenfootWorldInterface {
    void setBackground(GreenfootImage image);

    void setBackground(String filename) throws IllegalArgumentException;

    GreenfootImage getBackground();

    Color getColorAt(int x, int y);

    int getWidth();

    int getHeight();

    int getCellSize();

    void setPaintOrder(Class... classes);

    void setActOrder(Class... classes);

    @Deprecated
    void addObject(Actor object, int x, int y);

    @Deprecated
    void removeObject(Actor object);

    @Deprecated
    void removeObjects(Collection<? extends Actor> objects);

    <A> List<A> getObjects(Class<A> cls);

    int numberOfObjects();

    void repaint();

    void act();

    void started();

    void stopped();

    <A> List<A> getObjectsAt(int x, int y, Class<A> cls);

    void showText(String text, int x, int y);
}

package com.github.git_leon.jfoot.sprite;

import com.github.git_leon.collectionutils.maps.InvertableMap;

import java.util.List;
import java.util.TreeSet;

public class SpriteSensorDecorator<SpriteSubType extends Sprite> {


    private final Sprite sprite;

    public SpriteSensorDecorator(Sprite sprite) {
        this.sprite = sprite;
    }


    public void faceSprite(SpriteSubType obj) {
        if (obj != null) {
            int deltaX = obj.getX() - sprite.getX();
            int deltaY = obj.getY() - sprite.getY();
            sprite.setRotation((int) (180 * Math.atan2(deltaY, deltaX) / Math.PI));
        }
    }


    public void faceNearest(Class<SpriteSubType> cls) {
        faceSprite(getNearest(cls));
    }

    public SpriteSubType getNearest(Class<SpriteSubType> cls) {
        List<SpriteSubType> actors = sprite.getWorld().getObjects(cls);
        // TODO - Test below implementation
        InvertableMap<SpriteSubType, Double> distanceMap = new InvertableMap<>();
        actors.forEach(actor -> distanceMap.put(actor, getDistance(actor)));
        return distanceMap.invertMap().get(new TreeSet<>(distanceMap.values()).pollFirst());
    }

    public List<SpriteSubType> getObjectsInRange(Class<SpriteSubType> cls, int radius) {
        return null;
    }

    public double getDistance(SpriteSubType actor) {
        return Math.hypot(actor.getX() - sprite.getX(), actor.getY() - sprite.getY());
    }


    public boolean isInFrontAndColliding(Class<SpriteSubType> cls) {
        return getCollidingObjectInFront(cls) != null;
    }

    public boolean isInFrontAndColliding(Class<SpriteSubType> cls, int xOffset, int yOffset) {
        return getCollidingObjectInFront(cls, xOffset, yOffset) != null;
    }

    public SpriteSubType getCollidingObjectInFront(Class<SpriteSubType> cls) {
        int imageWidth = (sprite.getImage().getWidth());
        int imageHeight = (sprite.getImage().getHeight());
        int offset = imageWidth > imageHeight ? imageWidth : imageHeight;

        return getCollidingObjectInFront(cls, offset / 2);
    }

    public SpriteSubType getCollidingObjectInFront(Class<SpriteSubType> cls, int offset) {
        return getCollidingObjectInFront(cls, offset, offset);
    }

    public SpriteSubType getCollidingObjectInFront(Class<SpriteSubType> cls, int xOffset, int yOffset) {
        int deltaX = (int) Math.round((Math.cos(sprite.getRotation() * Math.PI / 180)));
        int deltaY = (int) Math.round((Math.sin(sprite.getRotation() * Math.PI / 180)));
        int x = xOffset * deltaX;
        int y = yOffset * deltaY;
        SpriteSubType actor = this.getOneObjectAtOffset(x, y, cls);

        return actor;
    }


    public SpriteSubType getOneObjectAtOffset(int x, int y, Class cls) {
        return (SpriteSubType) sprite.getOneObjectAtOffset(x, y, cls);
    }

    public List<SpriteSubType> getObjects(Class<SpriteSubType> cls) {
        return sprite.getWorld().getObjects(cls);
    }

}

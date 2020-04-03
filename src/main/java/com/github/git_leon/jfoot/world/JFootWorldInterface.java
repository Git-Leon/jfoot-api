package com.github.git_leon.jfoot.world;

import com.github.git_leon.jfoot.sprite.SpriteInterface;
import greenfoot.Actor;
import greenfoot.World;

import java.util.List;

public interface JFootWorldInterface extends GreenfootWorldInterface {
    static <SpriteSubType extends Actor> List<SpriteSubType> getSprites(World world, Class<SpriteSubType> cls) {
        return world.getObjects(cls);
    }

    void removeSprite(Actor sprite);

    void addSprite(Actor sprite, int x, int y);

    boolean containsSprite(Actor sprite);
}

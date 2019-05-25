package com.github.git_leon.jfoot.world;

import com.github.git_leon.jfoot.sprite.Sprite;
import greenfoot.World;

import java.util.List;

public interface JFootWorldInterface extends GreenfootWorldInterface {
    static <SpriteSubType extends Sprite> List<SpriteSubType> getSprites(World world, Class<SpriteSubType> cls) {
        return world.getObjects(cls);
    }

    void removeSprite(Sprite sprite);

    void addSprite(Sprite sprite, int x, int y);

    boolean containsSprite(Sprite sprite);
}

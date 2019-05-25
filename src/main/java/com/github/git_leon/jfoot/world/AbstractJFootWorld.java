package com.github.git_leon.jfoot.world;

import com.github.git_leon.jfoot.sprite.Sprite;
import greenfoot.World;

public abstract class AbstractJFootWorld extends World implements JFootWorldInterface {
    public AbstractJFootWorld(int worldWidth, int worldHeight, int cellSize) {
        super(worldWidth, worldHeight, cellSize);
        init();
    }

    abstract protected void init();

    @Override
    public void removeSprite(Sprite sprite) {
        super.removeObject(sprite);
    }

    @Override
    public void addSprite(Sprite sprite, int x, int y) {
        super.addObject(sprite, x, y);
    }

    @Override
    public boolean containsSprite(Sprite sprite) {
        return this.getObjects(sprite.getClass()).contains(sprite);
    }
}

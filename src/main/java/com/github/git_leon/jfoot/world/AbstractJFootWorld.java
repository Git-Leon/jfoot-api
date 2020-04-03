package com.github.git_leon.jfoot.world;

import greenfoot.Actor;
import greenfoot.World;

public abstract class AbstractJFootWorld extends World implements JFootWorldInterface {
    public AbstractJFootWorld(int worldWidth, int worldHeight, int cellSize) {
        super(worldWidth, worldHeight, cellSize);
        init();
    }

    abstract protected void init();

    @Override
    public void removeSprite(Actor sprite) {
        super.removeObject(sprite);
    }

    @Override
    public void addSprite(Actor sprite, int x, int y) {
        super.addObject(sprite, x, y);
    }

    @Override
    public boolean containsSprite(Actor sprite) {
        return this.getObjects(sprite.getClass()).contains(sprite);
    }
}

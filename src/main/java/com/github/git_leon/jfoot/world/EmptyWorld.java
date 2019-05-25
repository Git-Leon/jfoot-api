package com.github.git_leon.jfoot.world;

public class EmptyWorld extends AbstractJFootWorld {
    public EmptyWorld(int worldWidth, int worldHeight, int cellSize) {
        super(worldWidth, worldHeight, cellSize);
    }

    public EmptyWorld() {
        this(800,300,1);
    }

    @Override
    protected void init() {
    }
}

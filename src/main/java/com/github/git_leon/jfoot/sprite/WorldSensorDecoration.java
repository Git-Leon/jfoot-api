package com.github.git_leon.jfoot.sprite;

public class WorldSensorDecoration extends SpriteFacade {

    public WorldSensorDecoration(Sprite sprite) {
        super(sprite);
    }

    public boolean atWorldEdge(int offset) {
        return atWorldEdge(offset, offset);
    }

    public boolean atWorldEdge(int x, int y) {
        int xPosition = sprite.getX();
        int yPosition = sprite.getY();

        if (xPosition < x || xPosition > getWorld().getWidth() - x) {
            return true;
        } else {
            return yPosition < y || yPosition > getWorld().getHeight() - y;
        }
    }

    public void turnAtEdge(int edgeOffset, int degree) {
        if (atWorldEdge(edgeOffset)) {
            sprite.turn(degree);
        }
    }

    public void disappearAtEdge() {
        disappearAtEdge(10);
    }

    public void disappearAtEdge(int offset) {
        disappearAtEdge(offset, offset);
    }

    public void disappearAtEdge(int x, int y) {
        if (atWorldEdge(x, y)) getWorld().removeObject(getSprite());
    }

}

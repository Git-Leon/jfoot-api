package com.github.git_leon.jfoot.sprite;

import greenfoot.Actor;

public class WorldSensorDecoration extends ActorWrapperImpl {
    public WorldSensorDecoration(Actor actor) {
        this(new ActorWrapperImpl(actor));
    }

    public WorldSensorDecoration(ActorWrapperInterface sprite) {
        super(sprite);
    }

    public boolean atWorldEdge(int offset) {
        return atWorldEdge(offset, offset);
    }

    public boolean atWorldEdge(int x, int y) {
        int xPosition = actor.getX();
        int yPosition = actor.getY();

        if (xPosition < x || xPosition > getWorld().getWidth() - x) {
            return true;
        } else {
            return yPosition < y || yPosition > getWorld().getHeight() - y;
        }
    }

    public void turnAtEdge(int edgeOffset, int degree) {
        if (atWorldEdge(edgeOffset)) {
            actor.turn(degree);
        }
    }

    public void disappearAtEdge() {
        disappearAtEdge(10);
    }

    public void disappearAtEdge(int offset) {
        disappearAtEdge(offset, offset);
    }

    public void disappearAtEdge(int x, int y) {
        if (atWorldEdge(x, y)) getWorld().removeObject(getActor());
    }

}

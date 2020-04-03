package com.github.git_leon.jfoot.sprite;

import greenfoot.Actor;


/**
 * The purpose of this class is to model invisible sprite decorations;
 * i.e. - sensors
 */
public class ActorWrapperImpl implements ActorWrapperInterface {
    protected final Actor actor;

    public ActorWrapperImpl(ActorWrapperInterface sprite) {
        this.actor = sprite.getActor();
    }


    public ActorWrapperImpl(Actor sprite) {
        this.actor = sprite;
    }

    @Override
    public Actor getActor() {
        return actor;
    }
}

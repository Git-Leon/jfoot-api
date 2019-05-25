package com.github.git_leon.jfoot.sprite.npc.ally;

import com.github.git_leon.jfoot.sprite.AnimatedSprite;

public abstract class Ally extends AnimatedSprite implements AllyInterface {
    public Ally(String basename, String suffix, int noOfImages) {
        super(basename, suffix, noOfImages);
    }
}

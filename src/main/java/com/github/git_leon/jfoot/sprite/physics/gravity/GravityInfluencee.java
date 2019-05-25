package com.github.git_leon.jfoot.sprite.physics.gravity;

import com.github.git_leon.jfoot.sprite.Sprite;
import com.github.git_leon.jfoot.sprite.SpriteDecorator;

/**
 * @author leon on 7/31/18.
 */
public abstract class GravityInfluencee extends SpriteDecorator implements GravityInfluenceeInterface {
    public GravityInfluencee(Sprite sprite) {
        super(sprite);
    }
}

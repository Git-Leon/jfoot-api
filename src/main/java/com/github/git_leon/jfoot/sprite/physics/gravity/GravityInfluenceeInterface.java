package com.github.git_leon.jfoot.sprite.physics.gravity;

import com.github.git_leon.jfoot.sprite.SpriteInterface;

/**
 * @author leon on 7/31/18.
 */
public interface GravityInfluenceeInterface extends SpriteInterface {
    Double getVerticalSpeed();

    void setVerticalSpeed(Double i);

    float getTerminalSpeed();

    boolean isOnGround();
}

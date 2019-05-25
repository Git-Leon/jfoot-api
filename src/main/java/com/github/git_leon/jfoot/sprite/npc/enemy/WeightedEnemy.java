package com.github.git_leon.jfoot.sprite.npc.enemy;

import com.github.git_leon.jfoot.sprite.physics.gravity.Gravity;
import com.github.git_leon.jfoot.sprite.physics.gravity.GravityInfluenceeInterface;

public abstract class WeightedEnemy extends Enemy implements GravityInfluenceeInterface {
    private Double verticalSpeed;

    public WeightedEnemy(String basename, String suffix, int noOfImages) {
        super(basename, suffix, noOfImages);
    }

    @Override
    public void postAnimationBehavior() {
        applyGravity();
        super.postAnimationBehavior();
    }

    protected void applyGravity() {
        Gravity.applyNormal(this);
    }

    @Override
    public Double getVerticalSpeed() {
        return verticalSpeed;
    }

    @Override
    public void setVerticalSpeed(Double i) {
        this.verticalSpeed = i;
    }

    @Override
    public float getTerminalSpeed() {
        return 3;
    }
}

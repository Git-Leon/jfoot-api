package com.github.git_leon.jfoot.sprite.physics.gravity;

/**
 * @author leon on 7/31/18.
 */
public enum Gravity {
    NORMAL(1),
    ANTI(-1);

    private final int forceConstant;

    Gravity(int forceConstant) {
        this.forceConstant = forceConstant;
    }

    private void addGravity(GravityInfluenceeInterface sprite, int magnitude) {
        double verticalSpeed = sprite.getVerticalSpeed();
        if (verticalSpeed * forceConstant > sprite.getTerminalSpeed())
            verticalSpeed = sprite.getTerminalSpeed();
        sprite.setVerticalSpeed(verticalSpeed + (forceConstant * magnitude));
    }


    private void move(GravityInfluenceeInterface gravityInfluencee) {
        int x = gravityInfluencee.getX();
        int y = gravityInfluencee.getY() + gravityInfluencee.getVerticalSpeed().intValue();
        gravityInfluencee.setLocation(x, y);
    }

    public void apply(GravityInfluenceeInterface sprite, int magnitude) {
        addGravity(sprite, magnitude);
        move(sprite);
    }

    public void apply(GravityInfluenceeInterface sprite) {
        apply(sprite, 1);
    }

    public static void applyNormal(GravityInfluenceeInterface gravityInfluencee) {
        if (!gravityInfluencee.isOnGround()) {
            NORMAL.apply(gravityInfluencee);
        }
    }
}

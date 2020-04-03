package com.github.git_leon.jfoot.sprite.items.weapon.projectile;

import com.github.git_leon.jfoot.sprite.Sprite;
import com.github.git_leon.jfoot.sprite.SpriteCreatorRemover;
import greenfoot.Actor;

import java.util.function.Supplier;

public abstract class Projectile<VictimClass extends Sprite> extends Sprite implements ProjectileInterface {
    private final Class<VictimClass> victimClass;
    private final SpriteCreatorRemover spriteCreatorRemover;
    private int speed = 5;

    public Projectile(Class<VictimClass> victimClass) {
        super("ant.png");
        this.spriteCreatorRemover = new SpriteCreatorRemover(this);
        this.victimClass = victimClass;
    }

    public void act() {
        move(speed);
        hit(victimClass);
        disintegrate(
                super::isAtEdge,
                this::isCollidingWithVictim);
    }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    private void hit(Class<? extends Sprite> cls) {
        Actor sprite = getOneIntersectingObject(cls);
        if (sprite != null) {
            spriteCreatorRemover.destroy(sprite);
        }
    }

    private boolean isCollidingWithVictim() {
        return getOneIntersectingObject(victimClass) != null;
    }

    private void disintegrate(Supplier<Boolean>... conditions) {
        for (Supplier<Boolean> spriteCondition : conditions) {
            if (spriteCondition.get()) {
                spriteCreatorRemover.destroy();
                return;
            }
        }
    }
}

package com.github.git_leon.jfoot.sprite.npc.enemy;

import com.github.git_leon.jfoot.sprite.AnimatedSprite;
import com.github.git_leon.jfoot.sprite.Sprite;
import com.github.git_leon.jfoot.sprite.SpriteCreatorRemover;
import com.github.git_leon.jfoot.sprite.SpriteSensorDecorator;
import com.github.git_leon.jfoot.sprite.npc.ally.Ally;
import com.github.git_leon.jfoot.sprite.npc.ally.AllyInterface;

public class Enemy  extends AnimatedSprite implements EnemyInterface {
    private final SpriteCreatorRemover spriteRemover;
    protected final SpriteSensorDecorator<Ally> spriteSensor;

    public Enemy(String basename, String suffix, int noOfImages) {
        super(basename, suffix, noOfImages);
        this.spriteRemover = new SpriteCreatorRemover(this);
        this.spriteSensor = new SpriteSensorDecorator<>(this);
    }

    @Override
    public void postAnimationBehavior() {
        moveLeft(1);
        spriteRemover.destroy(getOneIntersectingObject(AllyInterface.class));
        spriteRemover.destroy(Sprite::isAtEdge, this);
    }
}
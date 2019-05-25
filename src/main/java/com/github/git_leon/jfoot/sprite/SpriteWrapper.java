package com.github.git_leon.jfoot.sprite;

public interface SpriteWrapper extends SpriteInterface {
    <SpriteSubType extends Sprite> SpriteSubType getSprite();
}

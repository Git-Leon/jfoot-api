package com.github.git_leon.jfoot.sprite;

import java.util.function.Predicate;

public class SpriteCreatorRemover {
    private final Sprite sprite;

    public SpriteCreatorRemover(Sprite sprite) {
        this.sprite = sprite;
    }

    public void destroy() {
        destroy(sprite);
    }

    public void destroy(Sprite sprite) {
        destroy((x) -> true, sprite);
    }

    public void destroy(Predicate<Sprite> predicate, Sprite sprite) {
        if (predicate.test(sprite)) {
            this.sprite.getWorld().removeSprite(sprite);
        }
    }

    public void add(Sprite sprite) {
        add((x) -> true, sprite);
    }

    public void add(Predicate<Sprite> predicate, Sprite sprite) {
        if (predicate.test(sprite)) {
            this.sprite.getWorld().addSprite(sprite, this.sprite.getX(), this.sprite.getY());
        }
    }
}

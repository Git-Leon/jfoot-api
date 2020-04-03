package com.github.git_leon.jfoot.sprite;

import greenfoot.Actor;

import java.util.function.Predicate;

public class SpriteCreatorRemover {
    private final Actor sprite;

    public SpriteCreatorRemover(Actor sprite) {
        this.sprite = sprite;
    }

    public void destroy() {
        destroy(sprite);
    }

    public void destroy(Actor sprite) {
        destroy((x) -> true, sprite);
    }

    public void destroy(Predicate<Actor> predicate, Actor sprite) {
        if (predicate.test(sprite)) {
            this.sprite.getWorld().removeObject(sprite);
        }
    }

    public void add(Actor sprite) {
        add((x) -> true, sprite);
    }

    public void add(Predicate<Actor> predicate, Actor sprite) {
        if (predicate.test(sprite)) {
            this.sprite.getWorld().addObject(sprite, this.sprite.getX(), this.sprite.getY());
        }
    }
}

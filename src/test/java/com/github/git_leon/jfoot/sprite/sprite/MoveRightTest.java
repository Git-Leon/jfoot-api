package com.github.git_leon.jfoot.sprite.sprite;

import com.github.git_leon.jfoot.sprite.InvisibleSprite;
import com.github.git_leon.jfoot.sprite.Sprite;
import com.github.git_leon.jfoot.system.JFootApplication;
import greenfoot.World;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoveRightTest {
    private Sprite sprite;
    private World world;

    @Before
    public void setup() {
        JFootApplication app = new JFootApplication();
        app.run();
        this.sprite = new InvisibleSprite();
        this.world = app.getWorld();
        this.world.addObject(sprite, 0, 0);
    }

    @Test
    public void test() {
        for (int currentXCoordinate = 0; currentXCoordinate < world.getWidth() - 1; currentXCoordinate++) {
            sprite.moveRight(1);
            Assert.assertEquals(currentXCoordinate + 1, sprite.getX());
        }
    }
}

package com.github.git_leon.jfoot.world.emptyworld;

import com.github.git_leon.jfoot.sprite.InvisibleSprite;
import com.github.git_leon.jfoot.sprite.Sprite;
import com.github.git_leon.jfoot.system.JFootApplication;
import com.github.git_leon.jfoot.world.EmptyWorld;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RemoveSpriteTest {
    private JFootApplication app;
    private EmptyWorld world;

    @Before
    public void setup() {
        this.app = new JFootApplication();
        app.run();
        this.world = new EmptyWorld();
        app.setWorld(world);
    }

    @Test
    public void test() {
        int width = app.getWorld().getWidth();
        int height = app.getWorld().getHeight();
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                test(x,y);
            }
        }
    }

    private void test(int spriteXPosition, int spriteYPosition) {
        // given
        Sprite sprite = new InvisibleSprite();
        Assert.assertFalse(world.containsSprite(sprite));

        // when
        world.addSprite(sprite, spriteXPosition, spriteYPosition);

        // then
        Assert.assertTrue(world.containsSprite(sprite));
        Assert.assertEquals(spriteXPosition, sprite.getX());
        Assert.assertEquals(spriteYPosition, sprite.getY());


        world.removeSprite(sprite);
        Assert.assertFalse(world.containsSprite(sprite));
    }
}

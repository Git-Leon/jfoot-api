package com.github.git_leon.jfoot.world.emptyworld;

import com.github.git_leon.jfoot.sprite.InvisibleSprite;
import com.github.git_leon.jfoot.sprite.Sprite;
import com.github.git_leon.jfoot.system.JFootApplication;
import com.github.git_leon.jfoot.world.AbstractJFootWorld;
import com.github.git_leon.jfoot.world.EmptyWorld;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddSpriteTest {
    private JFootApplication app;

    @Before
    public void setup() {
        this.app = new JFootApplication();
        app.run();
    }

    @Test
    public void test1() {
        test(0, 0);
    }

    @Test
    public void test2() {
        test(10, 50);
    }

    @Test
    public void test3() {
        test(100, 299);
    }

    private void test(int spriteXPosition, int spriteYPosition) {
        // given
        AbstractJFootWorld emptyWorld = new EmptyWorld();
        Sprite sprite = new InvisibleSprite();
        app.setWorld(emptyWorld);

        // when
        emptyWorld.addSprite(sprite, spriteXPosition, spriteYPosition);

        // then
        Assert.assertTrue(emptyWorld.containsSprite(sprite));
        Assert.assertEquals(spriteXPosition, sprite.getX());
        Assert.assertEquals(spriteYPosition, sprite.getY());
    }
}

package com.github.git_leon.jfoot.sprite.sprite;

import com.github.git_leon.jfoot.sprite.InvisibleSprite;
import com.github.git_leon.jfoot.sprite.Sprite;
import com.github.git_leon.jfoot.system.JFootApplication;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SetRotationTest {
    private Sprite sprite;

    @Before
    public void setup() {
        JFootApplication app = new JFootApplication();
        app.run();
        this.sprite = new InvisibleSprite();
        app.getWorld().addObject(sprite, 0, 0);
    }

    @Test
    public void test() {
        for (int theta = 0; theta < 360; theta++) {
            sprite.setRotation(theta);
            Assert.assertEquals(theta, sprite.getRotation());
        }
    }

}

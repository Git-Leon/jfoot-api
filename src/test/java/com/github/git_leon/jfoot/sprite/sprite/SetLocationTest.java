package com.github.git_leon.jfoot.sprite.sprite;

import com.github.git_leon.jfoot.sprite.InvisibleSprite;
import com.github.git_leon.jfoot.sprite.Sprite;
import com.github.git_leon.jfoot.system.JFootApplication;
import greenfoot.World;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SetLocationTest {
    private Sprite sprite;
    private JFootApplication app;
    private World world;

    @Before
    public void setup() {
        this.app = new JFootApplication();
        app.run();
        this.sprite = new InvisibleSprite();
        this.world = app.getWorld();
        this.world.addObject(sprite, 0, 0);
    }

    @Test
    public void test() {
        int width = this.world.getWidth();
        int height = this.world.getHeight();
        for (int x = 0; x < width-1; x++) {
            for (int y = 0; y < height-1; y++) {
                test(x, y);
            }
        }
    }

    private void test(int xLocation, int yLocation) {
        sprite.setLocation(xLocation, yLocation);
        Assert.assertEquals(xLocation, sprite.getX());
        Assert.assertEquals(yLocation, sprite.getY());
    }

}

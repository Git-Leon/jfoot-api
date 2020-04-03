package com.github.git_leon.jfoot.sprite.animatedsprite;

import com.github.git_leon.jfoot.resources.JFootTextImage;
import com.github.git_leon.jfoot.sprite.AnimatedSprite;
import com.github.git_leon.jfoot.system.JFootApplication;
import greenfoot.Color;
import greenfoot.World;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class PostAnimationBehaviorTest {
    private AnimatedSprite sprite;
    private World world;

    @Before
    public void setup() {
        JFootApplication app = new JFootApplication();
        app.run();
        this.world = app.getWorld();
    }

    @Test
    public void test0() {
        // given
        this.sprite = new AnimatedSprite(Arrays.asList(new JFootTextImage("", 0,Color.WHITE))) {
            @Override
            public void postAnimationBehavior() {
                move(1);
            }
        };
        this.world.addObject(sprite, 0, 0);
        int originalXPosition = sprite.getX();
        int expectedXPosition = originalXPosition+1;

        // when
        sprite.act();
        int actualXPosition = sprite.getX();

        // then
        Assert.assertEquals(expectedXPosition, actualXPosition);
    }

    @Test
    public void test1() {
        // given
        this.sprite = new AnimatedSprite(Arrays.asList(new JFootTextImage("", 0,Color.WHITE))) {
            @Override
            public void postAnimationBehavior() {
                move(1);
            }
        };
        this.world.addObject(sprite, 0, 0);
        int originalXPosition = sprite.getX();
        int expectedXPosition = originalXPosition+1;

        // when
        sprite.act();
        int actualXPosition = sprite.getX();

        // then
        Assert.assertEquals(expectedXPosition, actualXPosition);
    }
    }

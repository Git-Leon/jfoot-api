package com.github.git_leon.jfoot.system.jfootapplication;

import com.github.git_leon.jfoot.system.JFootApplication;
import com.github.git_leon.jfoot.world.EmptyWorld;
import org.junit.Assert;
import org.junit.Test;

public class SetWorldTest {
    @Test(expected = IllegalStateException.class)
    public void test1() {
        // given
        JFootApplication jFootApplication = new JFootApplication();
        EmptyWorld world = new EmptyWorld();

        // when
        jFootApplication.setWorld(world);

        // then
        Assert.assertEquals(jFootApplication.getWorld(), world);
    }

    @Test(expected = IllegalStateException.class)
    public void test2() {
        // given
        JFootApplication jFootApplication = new JFootApplication();

        // when
        jFootApplication.getWorld();
    }

    @Test
    public void test3() {
        // given
        JFootApplication jFootApplication = new JFootApplication();
        EmptyWorld world = new EmptyWorld();

        // when
        jFootApplication.run();
        jFootApplication.setWorld(world);

        // then
        Assert.assertEquals(jFootApplication.getWorld(), world);
    }


    @Test
    public void test4() {
        // given
        JFootApplication jFootApplication = new JFootApplication();
        EmptyWorld world1 = new EmptyWorld();
        EmptyWorld world2 = new EmptyWorld();

        // when
        jFootApplication.run();
        jFootApplication.setWorld(world1);
        jFootApplication.setWorld(world2);

        // then
        Assert.assertEquals(jFootApplication.getWorld(), world2);
    }
}

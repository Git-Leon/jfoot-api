package com.github.git_leon.jfoot.system.jfootapplication;

import com.github.git_leon.jfoot.system.JFootApplication;
import org.junit.Assert;
import org.junit.Test;

public class IsRunningTest {
    @Test
    public void test1() {
        // given
        JFootApplication jFootApplication = new JFootApplication();
        Assert.assertFalse(jFootApplication.isRunning());

        // when
        jFootApplication.run();


        // then
        Assert.assertTrue(jFootApplication.isRunning());
    }

    @Test
    public void test2() {
        // given
        JFootApplication jFootApplication = new JFootApplication();
        Assert.assertFalse(jFootApplication.isRunning());

        // when
        jFootApplication.run();
        jFootApplication.stop();


        // then
        Assert.assertFalse(jFootApplication.isRunning());
    }
}

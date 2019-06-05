package com.github.git_leon.jfoot;

import com.github.git_leon.jfoot.system.JFootApplication;
import com.github.git_leon.jfoot.world.EmptyWorld;
import greenfoot.Greenfoot;
import org.junit.Test;

public class DemoAppTest {
    @Test
    public void test() {
        JFootApplication jFootApplication = new JFootApplication();
        jFootApplication.run();
        jFootApplication.setWorld(new EmptyWorld());
        jFootApplication.getWorld();
        Greenfoot.setWorld(new EmptyWorld());
    }
}

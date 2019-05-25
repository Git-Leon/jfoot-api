package com.github.git_leon.jfoot.system;

import com.github.git_leon.jfoot.world.AbstractJFootWorld;
import greenfoot.Greenfoot;
import greenfoot.World;
import greenfoot.core.WorldHandler;

public class JFootApplication implements Runnable {
    private final JFootApplicationInitializer initializer;
    private boolean isRunning;

    public JFootApplication() {
        this.initializer = new JFootApplicationInitializer();
        this.initializer.init();
    }

    public void run() {
        initializer.start();
        this.isRunning = true;
    }

    public void stop() {
        Greenfoot.stop();
        this.isRunning = false;
    }

    public void setWorld(AbstractJFootWorld world) {
        checkRunningState();
        Greenfoot.setWorld(world);
    }

    public World getWorld() {
        checkRunningState();
        return WorldHandler.getInstance().getWorld();
    }

    private void checkRunningState() {
        if(!isRunning) {
            throw new IllegalStateException("JFoot Application is not running.");
        }
    }

    public boolean isRunning() {
        return isRunning;
    }
}

package com.github.git_leon.jfoot.system;

import bluej.Config;
import gitleon.utils.exceptionalfunctionalinterface.ExceptionalConsumer;
import greenfoot.Greenfoot;
import greenfoot.export.GreenfootScenarioMain;
import greenfoot.export.GreenfootScenarioViewer;
import greenfoot.util.StandalonePropStringManager;

import javax.swing.*;
import java.awt.*;
import java.io.InputStream;
import java.net.URL;

class JFootApplicationInitializer {
    private final JFootProperties properties;
    private final JFrame frame;
    private final GreenfootScenarioViewer greenfootScenarioViewers;

    JFootApplicationInitializer() {
        ClassLoader loader = GreenfootScenarioMain.class.getClassLoader();
        InputStream is = loader.getResourceAsStream("standalone.properties");
        this.frame = new JFrame(GreenfootScenarioMain.scenarioName);
        this.greenfootScenarioViewers = new GreenfootScenarioViewer(frame);
        this.properties = new JFootProperties(is);
        Config.initializeStandalone(new StandalonePropStringManager(properties.getProperties()));
    }

    void start() {
        ExceptionalConsumer.tryInvoke(EventQueue::invokeAndWait, this::startScenario);
    }

    void init() {
        System.setProperty("apple.laf.useScreenMenuBar", "true");
        System.setProperty("com.apple.mrj.application.apple.menu.about.name", properties.PROJECT_NAME.get());
        ExceptionalConsumer.tryInvoke(EventQueue::invokeAndWait, this::initializeViewer);
        greenfootScenarioViewers.init();
    }

    private void initializeViewer() {
        URL resource = this.getClass().getClassLoader().getResource("greenfoot.png");
        ImageIcon icon = new ImageIcon(resource);
        frame.setDefaultCloseOperation(3);
        frame.setResizable(false);
        frame.setIconImage(icon.getImage());
    }

    private void startScenario() {
        frame.pack();
        frame.setVisible(true);
        if (Config.getPropBoolean("scenario.hideControls", false)) {
            Greenfoot.start();
        }
    }
}

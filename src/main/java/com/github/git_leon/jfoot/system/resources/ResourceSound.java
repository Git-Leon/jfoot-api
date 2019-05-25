package com.github.git_leon.jfoot.system.resources;

import greenfoot.GreenfootSound;
import javafx.scene.media.MediaPlayer;

import javax.sound.sampled.Clip;

public class ResourceSound extends GreenfootSound {
    public ResourceSound(String filename) {
        super(filename);
    }

    public Clip getClip(String fileName) {
        return Resources.SOUNDS.getClip(fileName);
    }

    // TODO - Migrate definition
    public static MediaPlayer getMediPlayer(String fileName) {
        return Resources.SOUNDS.getMediPlayer(fileName);
    }

    @Deprecated
    public static GreenfootSound getSound(String fileName) {
        return Resources.SOUNDS.getSound(fileName);
    }

}

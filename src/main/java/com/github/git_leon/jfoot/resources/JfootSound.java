package com.github.git_leon.jfoot.resources;

import greenfoot.GreenfootSound;

import javax.sound.sampled.Clip;

public class JfootSound extends GreenfootSound {
    private final Clip clip;
    private final String filename;

    public JfootSound(String filename) {
        super(filename);
        this.filename = filename;
        this.clip = null; //Resources.SOUNDS.getClip(filename);
    }


    @Override
    public void play() {
        clip.start();
    }

    @Override
    public void playLoop() {
        clip.loop(Clip.LOOP_CONTINUOUSLY);
        play();
    }

    @Override
    public void stop() {
        clip.stop();
    }

    @Override
    public void pause() {
        //TODO
    }

    public boolean isPlaying() {
        return this.clip.isActive();
    }

    public int getVolume() {
        return (int) clip.getLevel();
    }

    @Override
    public void setVolume(int level) {
        // TODO
    }

    @Override
    public String toString() {
        String s = super.toString() + " file: " + this.filename + " ";
        if (this.clip != null) {
            s = s + ". Is playing: " + this.isPlaying();
        } else {
            s = s + ". Not found.";
        }

        return s;
    }
}

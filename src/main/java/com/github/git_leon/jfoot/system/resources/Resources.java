package com.github.git_leon.jfoot.system.resources;

import com.github.git_leon.jfoot.exceptions.JFootError;
import com.github.git_leon.jfoot.resources.JfootSound;
import greenfoot.GreenfootImage;
import greenfoot.GreenfootSound;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public enum Resources {
    ROOT(""),
    IMAGES("images/"),
    SOUNDS("sounds/");

    private final File directory;
    private Map<String, GreenfootSound> soundMap = new HashMap<>();
    private Map<String, GreenfootImage> imageMap = new HashMap<>();
    private Map<String, MediaPlayer> mediaPlayerMap = new HashMap<>();

    Resources(String directoryPath) {
        String resourceDirectory = System.getProperty("user.dir") + "/src/main/resources/";
        this.directory = new File(resourceDirectory + directoryPath);
        if (!directory.isDirectory()) {
            throw new IllegalArgumentException(directory.getAbsolutePath() + " is not a directory.");
        }
    }

    public File getResourceFile(String imageName) {
        File file = new File(toString(imageName));
        if (!file.exists()) {
            String errorMessage = "Failed to find file with name [ %s ]";
            Throwable cause = new FileNotFoundException();
            throw new JFootError(cause, String.format(errorMessage, file.getAbsolutePath()));
        }
        return file;
    }


    public GreenfootImage getImage(String imageName) {
        imageName = getResourceFile(imageName).toString();

        if (imageMap.containsKey(imageName)) {
            return imageMap.get(imageName);
        }
        return new GreenfootImage(imageName);
    }



    @Deprecated
    public GreenfootSound getSound(String soundName) {
        soundName = getResourceFile(soundName).toString();

        if (soundMap.containsKey(soundName)) {
            return soundMap.get(soundName);
        }
        return new JfootSound(soundName);
    }

    @Deprecated
    public MediaPlayer getMediPlayer(String fileName) {
        if (!mediaPlayerMap.containsKey(fileName)) {
            File file = new File(toString() + fileName);
            URI uri = file.toURI();
            Media media = new Media(uri.toString());
            MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayerMap.put(fileName, mediaPlayer);
        }
        return mediaPlayerMap.get(fileName);
    }

    @Deprecated
    public Clip getClip(String fileName) {
        Clip clip;
        try {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(new File(fileName)));
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            throw new JFootError(e);
        }
        return clip;
    }

    public String toString(String fileName) {
        return toString() + fileName;
    }

    @Override
    public String toString() {
        return directory.getAbsolutePath() + "/";
    }
}

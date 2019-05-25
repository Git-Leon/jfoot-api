package com.github.git_leon.jfoot.resources;

import greenfoot.Color;

public class JFootTextImageBuilder {
    private String string;
    private int size;
    private Color foreground;
    private Color background = Color.BLACK;
    private Color outline = Color.WHITE;

    public JFootTextImageBuilder setString(String string) {
        this.string = string;
        return this;
    }

    public JFootTextImageBuilder setSize(int size) {
        this.size = size;
        return this;
    }

    public JFootTextImageBuilder setForeground(Color foreground) {
        this.foreground = foreground;
        return this;
    }

    public JFootTextImageBuilder setBackground(Color background) {
        this.background = background;
        return this;
    }

    public JFootTextImageBuilder setOutline(Color outline) {
        this.outline = outline;
        return this;
    }

    public JFootTextImage build() {
        return new JFootTextImage(string, size, foreground, background, outline);
    }
}
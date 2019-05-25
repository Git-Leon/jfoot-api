package com.github.git_leon.jfoot.sprite.temporal;

public class CountDown {
    private final Long startTime;
    private final Long endTime;

    public CountDown(Long startTime, Long startTimeDelta) {
        this.startTime = startTime;
        this.endTime = startTime + startTimeDelta;
    }

    public CountDown(Long startTimeDelta) {
        this(System.currentTimeMillis(), startTimeDelta);
    }

    public boolean isRunning() {
        return System.currentTimeMillis() < endTime;
    }

    @Override
    public CountDown clone() {
        Long startTimeDelta = endTime - startTime;
        Long currentTime = System.currentTimeMillis();
        return new CountDown(currentTime, startTimeDelta);
    }
}

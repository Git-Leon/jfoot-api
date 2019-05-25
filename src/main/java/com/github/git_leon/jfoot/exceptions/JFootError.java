package com.github.git_leon.jfoot.exceptions;

public class JFootError extends Error {
    public JFootError(Throwable throwable) {
        this(throwable, "");
    }
    public JFootError(Throwable throwable, String errorMessage, Object... args) {
        super(String.format(errorMessage, args), throwable);
    }
}

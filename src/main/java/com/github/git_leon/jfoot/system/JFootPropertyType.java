package com.github.git_leon.jfoot.system;

import java.util.Properties;

public enum JFootPropertyType {
    PROJECT_NAME("project.name"),
    MAIN_CLASS("main.class"),
    SCENARIO_FILEINPUT("scenario.fileInput"),
    SCENARIO_HIDECONTROLS("scenario.hideControls"),
    SCENARIO_LOCK("scenario.lock");


    private final String propertyName;

    JFootPropertyType(String propertyName) {
        this.propertyName = propertyName;
    }

    public static JFootPropertyType getValueOf(String propertyName) {
        return JFootPropertyTypeMap.INSTANCE.get(propertyName);
    }

    public void set(Properties properties, String propertyValue) {
        properties.setProperty(propertyName, propertyValue);
    }

    public String get(Properties properties) {
        return properties.getProperty(propertyName);
    }

    @Override
    public String toString() {
        return propertyName;
    }
}

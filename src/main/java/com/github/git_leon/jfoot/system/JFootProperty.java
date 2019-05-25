package com.github.git_leon.jfoot.system;

import java.util.Properties;

public class JFootProperty {
    private final Properties properties;
    private final JFootPropertyType propertyType;

    public JFootProperty(JFootPropertyType jFootPropertyType) {
        this.propertyType = jFootPropertyType;
        this.properties = new Properties();
    }

    public String get() {
        return propertyType.get(properties);
    }

    public JFootProperty set(String propertyValue) {
        if (propertyValue != null)
            propertyType.set(properties, propertyValue);
        return this;
    }

    public void set(Properties properties) {
        set(properties.getProperty(toString()));
    }

    public JFootPropertyType getPropertyType() {
        return propertyType;
    }

    public Properties getProperties() {
        return properties;
    }

    public String toString() {
        return getPropertyType().toString();
    }
}

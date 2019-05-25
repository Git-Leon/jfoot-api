package com.github.git_leon.jfoot.system;

import com.github.git_leon.Introspection;
import com.github.git_leon.jfoot.exceptions.JFootError;
import gitleon.utils.exceptionalfunctionalinterface.ExceptionalConsumer;
import gitleon.utils.exceptionalfunctionalinterface.ExceptionalRunnable;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

public class JFootProperties {
    private Properties properties;
    public final JFootProperty PROJECT_NAME = new JFootProperty(JFootPropertyType.PROJECT_NAME);
    public final JFootProperty MAIN_CLASS = new JFootProperty(JFootPropertyType.MAIN_CLASS);
    public final JFootProperty SCENARIO_FILEINPUT = new JFootProperty(JFootPropertyType.SCENARIO_FILEINPUT);
    public final JFootProperty SCENARIO_HIDECONTROLS = new JFootProperty(JFootPropertyType.SCENARIO_HIDECONTROLS);
    public final JFootProperty SCENARIO_LOCK = new JFootProperty(JFootPropertyType.SCENARIO_LOCK);


    public JFootProperties(InputStream is) {
        this.properties = new Properties();
        ExceptionalConsumer.tryInvoke(properties::load, is);

        PROJECT_NAME.set(properties);
        MAIN_CLASS.set(properties);
        SCENARIO_FILEINPUT.set(properties);
        SCENARIO_HIDECONTROLS.set(properties);
        SCENARIO_LOCK.set(properties);

        ExceptionalRunnable.tryInvoke(is::close);
    }

    public Properties getProperties() {
        return properties;
    }


    public JFootProperty valueOf(String s) {
        JFootPropertyType valueTypeToSeek = JFootPropertyType.valueOf(s);
        for (JFootProperty property : values()) {
            if (property.getPropertyType().equals(valueTypeToSeek)) {
                return property;
            }
        }
        String errorMessage = "Unable to find property with value [ %s ].";
        throw new JFootError(new NullPointerException(), String.format(errorMessage, s));
    }

    public List<JFootProperty> values() {
        return Introspection.getFieldValues(this, JFootProperty.class);
    }

}

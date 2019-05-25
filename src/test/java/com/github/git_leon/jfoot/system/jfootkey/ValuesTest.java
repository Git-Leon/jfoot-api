package com.github.git_leon.jfoot.system.jfootkey;

import com.github.git_leon.jfoot.system.controls.JFootKey;
import org.junit.Assert;
import org.junit.Test;

public class ValuesTest {
    @Test
    public void test1() {
        // given
        JFootKey[] keys = JFootKey.values();

        // then
        Assert.assertEquals(keys.length, 224);
    }
}

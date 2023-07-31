package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.util.ClassUtils;

import java.io.Console;

public class MainTest {

    @Test
    public void test() {
        // JDK17 开始有的方法
        Assert.assertTrue(ClassUtils.hasMethod(Console.class, "charset"));
    }
}

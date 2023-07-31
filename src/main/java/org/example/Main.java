package org.example;

import org.springframework.util.ClassUtils;

import java.io.Console;

public class Main {
    public static void main(String[] args) {
        // JDK17 开始有的方法
        System.out.println(ClassUtils.hasMethod(Console.class, "charset"));
        // JDK11 开始有的方法
        System.out.println(ClassUtils.hasMethod(String.class, "strip"));
    }
}
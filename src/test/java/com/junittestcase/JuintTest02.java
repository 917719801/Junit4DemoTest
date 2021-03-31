package com.junittestcase;

import org.junit.*;

public class JuintTest02 {

    @Test
    public void fun01() {
        System.out.println("@test注解");
    }

    @Test
    public void fun02() {
        System.out.println("@test注解2");
    }

    @Test
    @Ignore //忽略注解
    public void fun03() {
        System.out.println("@test注解3");
    }
}

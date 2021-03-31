package com.junittestcase;

import org.junit.*;

public class JuintTest01 {
    @BeforeClass
    public static void beforeClass(){
        System.out.println("beforeClass");
    }
    @Before
    public void before(){
        System.out.println("before");
    }
    @After
    public void after(){
        System.out.println("after");
    }
    @Test
    public void fun01(){
        System.out.println("@test注解");
    }
    @Test
    public void fun02(){
        System.out.println("@test注解2");
    }
    @Test
    @Ignore //忽略注解
    public void fun03(){
        System.out.println("@test注解3");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("afterclass");
    }
}

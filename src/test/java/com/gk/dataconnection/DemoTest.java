package com.gk.dataconnection;

import org.junit.jupiter.api.*;

public class DemoTest {

    @BeforeAll
    static void beforeall(){
        System.out.println("---------beforeall()-------");
    }
    @AfterAll
    static void afterall(){
        System.out.println("---------afterall()----------");
    }
    @BeforeEach
    public void beforeeach(){
        System.out.println("------------beforeeach()---------");
    }
    @AfterEach
    public void aftereach(){
        System.out.println("---------aftereach()---------------");
    }
    @Test
    public void test1(){
        System.out.println("---------test1--------------------");
    }
}

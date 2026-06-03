package org.example;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;
public class AppTest{
    App sorting;
    @BeforeEach
    void init(){
        sorting = new App();
        System.out.println("Before Test");
    }
    @Test void TestApp(){
        assertTimeout(Duration.ofMillis(2), () -> sorting.TimeCompilation(4,3,12,2,1,9,6,5,8));
        System.out.println("Actual Test Running...!");
    }

    @AfterEach
    void endAll(){
        System.out.println("After Test Cases...!");

    }
}
package org.example;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
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

    @Test void TestBubbleSort(){
        int[] result = sorting.BubbleSort(5,4,2,3,1,10,9,6,7,8);
        int[] expected = {1,2,3,4,5,6,7,8,9,10};

        assertArrayEquals(expected,result);
        assertTimeout(Duration.ofNanos(1), () ->
                sorting.BubbleSort(5,4,2,1000,124,53,3,1,10,9,6,7,8,100,12,23,42,41,34,123,0));
    }

    @AfterEach
    void endAll(){
        System.out.println("After Test Cases...!");

    }
}
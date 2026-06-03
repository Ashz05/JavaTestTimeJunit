package org.example;

import java.util.Arrays;
public class App{
    public int[] TimeCompilation(int... arr){
        for(int i = 0; i <= 1000; i++){
            Arrays.sort(arr);
        }
        return arr;
    }

}
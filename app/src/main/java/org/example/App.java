package org.example;

import java.util.Arrays;
public class App{
    public int[] TimeCompilation(int... arr){
        for(int i = 0; i <= 1000; i++){
            Arrays.sort(arr);
        }
        return arr;
    }
    public int[] BubbleSort(int... arr){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr.length -1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

}
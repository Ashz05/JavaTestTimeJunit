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

    public int[] SelectionSort(int... arr){
        for(int i = 0; i < arr.length ; i++){
            int minindex = i;
            for(int j = i+1 ; j < arr.length; j ++){
                if(arr[j] < arr[minindex]){
                 minindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;
        }
        return arr;
    }

}
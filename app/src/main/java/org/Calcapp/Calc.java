package org.Calcapp;

public class Calc {
    public int getAdd(int... arr){
        int addition = 0 ;
        for(int num : arr){
            addition += num;
        }
        return addition;
    }
    public int getSubtract(int... arr){
        int subtraction = arr[0];
        for(int i = 1; i < arr.length ; i++){
            subtraction -= arr[i];
        }
        return subtraction;
    }
    public int getMultiplication(int... arr){
        int Multiplication = 1;
        for(int i = 0; i < arr.length ; i++){
            Multiplication *= arr[i];
        }
        return Multiplication;
    }
    public int getDivison(int... arr){
        int divison= arr[0];
        for(int i = 1; i < arr.length ; i++){
            try {
                divison /= arr[i];
            }
            catch (ArithmeticException e){
                return -1;
            }
        }
        return divison;
    }

}

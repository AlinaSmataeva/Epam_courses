package org.smataeva.epam1.service;

public class ArrayConditions {

    public int sumOfElements (int array[]){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    public double averageElement(int array[]){
        double count = sumOfElements(array)/(double)array.length;
        return count;
    }

    public int numberOfPositive(int array[]){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > 0){
                count++;
            }
        }
        return count;
    }

    public int numberOfNegative(int array[]){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] < 0){
                count++;
            }
        }
        return count;
    }
}

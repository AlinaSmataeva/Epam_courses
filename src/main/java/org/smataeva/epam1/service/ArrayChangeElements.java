package org.smataeva.epam1.service;

public class ArrayChangeElements {
    public int[] changeNegativeElements(int array[]){
        for(int i = 0; i < array.length; i++){
            if(array[i] < 0){
                array[i] = Math.abs(array[i]);
            }
        }
        return array;
    }

    public int[] changeFirstAndLast(int array[]){
        int tmp;
           tmp = array[0];
           array[0] = array[array.length-1];
           array[array.length - 1] = tmp;

        return array;
    }

}

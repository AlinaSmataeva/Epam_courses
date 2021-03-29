package org.smataeva.epam1.service;

public class ArraySorts {

    public void bubbleSort(int[] array){
        for(int i = array.length-1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }

    public void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minValue = array[i];
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minValue) {
                    minValue = array[j];
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int tmp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = tmp;
            }
        }
    }
    public void insertSort(int[] array){
        for(int i = 0; i < array.length; i++){
            int index = i;
            int tmp = array[i];

            while(index > 0 && array[index-1] >= tmp){
                array[index] = array[index-1];
                index--;
            }
            array[index] = tmp;
        }
    }
}

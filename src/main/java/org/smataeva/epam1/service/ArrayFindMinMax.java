package org.smataeva.epam1.service;


import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayFindMinMax {
    static Logger logger = LogManager.getLogger();

    public  int findMin(int array[]) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        logger.log(Level.INFO,"Min element of array is" + min);
        return min;
    }
    public int findMax(int array[]){
        int max = array[0];

    for (int i = 0; i < array.length; i++)
    {
        if (array[i] > max) {
            max = array[i];
        }
    }
    return max;
    }
}

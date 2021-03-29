package org.smataeva.epam1.service;

import org.smataeva.epam1.entity.ArrayEntity;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayFindMinMaxTest {
    ArrayEntity array = new ArrayEntity(new int[] {1,-2,3,4,5});
    ArrayFindMinMax methodsToChange = new ArrayFindMinMax();

    @Test
    public void findMaxTest(){
        int actualMax = 5;
        int expected = methodsToChange.findMax(array.getArray());
        Assert.assertEquals(expected, actualMax);
    }

    @Test
    public void findMinTest(){
        int actualMin = -2;
        int expected = methodsToChange.findMin(array.getArray());
        Assert.assertEquals(expected, actualMin);
    }
}

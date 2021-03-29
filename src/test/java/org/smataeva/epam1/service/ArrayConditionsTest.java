package org.smataeva.epam1.service;

import org.smataeva.epam1.entity.ArrayEntity;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayConditionsTest {
    ArrayEntity array = new ArrayEntity(new int[] {1,-2,3,4,5});
    ArrayConditions methodsToChange = new ArrayConditions();

    @Test
    public void sumOfElementsTest(){
        int actualSum = 11;
        int expected = methodsToChange.sumOfElements(array.getArray());
        Assert.assertEquals(expected, actualSum);
    }

    @Test
    public void numberOfNegativeTest(){
        int actualCount = 1;
        int expected = methodsToChange.numberOfNegative(array.getArray());
        Assert.assertEquals(expected, actualCount);
    }

    @Test
    public void averageElementTest(){
        double actualAverage = 2.2;
        double expected = methodsToChange.averageElement(array.getArray());
        Assert.assertEquals(expected, actualAverage, 0.01);
    }

    @Test
    public void numberOfPositiveTest(){
        int actualCount = 4;
        int expected = methodsToChange.numberOfPositive(array.getArray());
        Assert.assertEquals(expected, actualCount);
    }
}

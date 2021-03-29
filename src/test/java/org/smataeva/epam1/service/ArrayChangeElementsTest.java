package org.smataeva.epam1.service;

import org.smataeva.epam1.entity.ArrayEntity;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayChangeElementsTest {
    ArrayEntity array = new ArrayEntity(new int[] {1,-2,3,4,5});
    ArrayChangeElements methodsToChange = new ArrayChangeElements();

    @Test
    public void changeNegativeElementsTest(){
        int[] actualArray = new int[]{1,2,3,4,5};
        int[] expected = methodsToChange.changeNegativeElements(array.getArray());
        Assert.assertEquals(expected, actualArray);
    }

    @Test
    public void changeFirstAndLastTest(){
        int[] actualArray = new int[]{5,-2,3,4,1};
        int[] expected = methodsToChange.changeFirstAndLast(array.getArray());
        Assert.assertEquals(expected, actualArray);
    }

}

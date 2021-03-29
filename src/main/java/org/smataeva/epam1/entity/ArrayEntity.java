package org.smataeva.epam1.entity;

import java.util.Arrays;

public class ArrayEntity {
    private int[] array;

    public ArrayEntity(){
    }

    public ArrayEntity(int[] array) {
        this.array = Arrays.copyOf(array, array.length);;
    }

    public int [] getArray(){
        return array;
    }

    public void setArray(int[] array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    @Override
    public int hashCode() {
        if(array == null) {
            return 0;
        }
        int result = 1;
        for(int element : array){
            result = 31 * result + element;
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArrayEntity that = (ArrayEntity) o;

        return Arrays.equals(array, that.array);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int a : array){
            sb.append(a).append(" ");
        }
        return sb.toString();
    }
}


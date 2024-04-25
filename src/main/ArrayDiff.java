package main;

import java.util.Arrays;

public class ArrayDiff {

    //https://www.codewars.com/kata/523f5d21c841566fde000009

    public int[] arrayDiff(int[] a, int[] b) {
        for (int tmpb : b) {
            a = removeElement(a, tmpb);
        }
        return a;
    }

    private int[] removeElement(int[] arr, int key) {
        int index = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != key)
                arr[index++] = arr[i];
        return Arrays.copyOf(arr, index);
    }
}

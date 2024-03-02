package main;

public class ZeroShifting {

    public int[] moveAllZerosToEnd(int[] array) {
        int counter = 0;
        for (int i=0;i<array.length;i++){
             if (array[i]>0){
                 array[counter++] = array[i];
             }
        }
        while (counter<array.length){
            array[counter++] = 0;
        }
        return array;
    }
}

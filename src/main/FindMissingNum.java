package main;

public class FindMissingNum {

    public int findMissingNum(int[] arr) {
        int n = arr.length + 1;
        int sumOfN = n * (n + 1) / 2;
        int sumOfArr = 0;
        for (int a : arr) {
            sumOfArr += a;
        }
        return sumOfN - sumOfArr;
    }
}

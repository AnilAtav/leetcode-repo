package main.neetCodeIO;

import java.util.ArrayList;

public class Design_Dynamic_Array {

        private ArrayList<Integer> arr;
        private int capacity;

        public Design_Dynamic_Array(int capacity) {
            if (capacity <= 0) {
                throw new IllegalArgumentException("Capacity must be greater than 0");
            }
            this.capacity = capacity;
            this.arr = new ArrayList<>(capacity);
        }

        public int get(int i) {
            return arr.get(i);
        }

        public void set(int i, int n) {
            arr.set(i, n);
        }

        public void pushback(int n) {
            if (arr.size() == capacity) {
                resize();
            }
            arr.add(n);
        }

        public int popback() {
            if (arr.isEmpty()) {
                throw new IllegalStateException("Array is empty");
            }
            return arr.remove(arr.size() - 1);
        }

        private void resize() {
            capacity *= 2;
            ArrayList<Integer> newArr = new ArrayList<>(capacity);
            for (int num : arr) {
                newArr.add(num);
            }
            arr = newArr;
        }

        public int getSize() {
            return arr.size();
        }

        public int getCapacity() {
            return capacity;
        }

}

package org.example;

public class oddOrPos {
    private int count;

    public oddOrPos(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public int calculateOddOrPos(int[] x) {
        for (int i = 0; i < x.length; i++) {
            if (x[i]%2 == 1 || x[i] > 0) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return "oddOrPos{" +
                "count=" + count +
                '}';
    }
}

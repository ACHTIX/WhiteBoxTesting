package org.example;

public class Main {
    public static void main(String[] args) {
        oddOrPos one = new oddOrPos(0);
        one.calculateOddOrPos(new int[]{-3, -2, 0, 1, 4});
        System.out.println(one);

        oddOrPos two = new oddOrPos(0);
        two.calculateOddOrPos(new int[]{-10, -5, -3, 0});
        System.out.println(two);

        oddOrPos three = new oddOrPos(0);
        three.calculateOddOrPos(new int[]{-10 , -5 , -3 , 0 , 8});
        System.out.println(three);

        oddOrPos four = new oddOrPos(0);
        four.calculateOddOrPos(new int[]{2 , 4 , 8 ,16});
        System.out.println(four);
    }
}
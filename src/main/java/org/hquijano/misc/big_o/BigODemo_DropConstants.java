package org.hquijano.misc.big_o;

public class BigODemo_DropConstants {
    public static void printItems(int n){
        for (int i = 0; i < n; i++){
            System.out.println(i);
        }

        for (int j = 0; j < n; j++){
            System.out.println(j);
        }
    }

    // n + n = 2n - Drop Constants (D = 2)
    // O(n) - Constant Time Complexity - Constant execution time regardless of input size

    public static void main(String[] args) {
        printItems(10);
    }
}



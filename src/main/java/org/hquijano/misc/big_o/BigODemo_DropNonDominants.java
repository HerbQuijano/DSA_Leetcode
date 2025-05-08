package org.hquijano.misc.big_o;

public class BigODemo_DropNonDominants {
    public static void printItems(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.println(i + " " + j);
            }
        }

        for (int k = 0; k < n; k++){
            System.out.println(k);
        }
    }



    // n * n + n = 0(n^2 + n)  // Drop non-dominant terms => O(n^2)


    public static void main(String[] args) {
        printItems(10);
    }
}



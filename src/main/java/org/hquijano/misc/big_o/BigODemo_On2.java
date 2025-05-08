package org.hquijano.misc.big_o;

public class BigODemo_On2 {
    public static void printItems(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.println(i + " " + j);
            }
        }

        // The time complexity of this algorithm is O(n^2) because of the nested loops.
        // This means that as the input size (n) increases, the time taken to execute the algorithm increases quadratically.
        // This is a classic example of O(n^2) complexity.

    }

    public static void main(String[] args) {
        printItems(10);
    }
}



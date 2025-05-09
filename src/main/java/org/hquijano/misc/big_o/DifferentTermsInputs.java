package org.hquijano.misc.big_o;

public class DifferentTermsInputs {
    private void printItems(int a, int b) {
        for (int i = 0; i < a; i++){
            System.out.println(i);
        }

        for (int j = 0; j < b; j++){
            System.out.println(j);
        }

        // Time complexity: O(a + b) because we have two nested loops that run a + b times respectively.
    }

    private void printItems2(int a, int b) {
        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                System.out.println(j);
            }

            // Time complexity: O(a * b) because we have two nested loops that run a * b times respectively.
        }
    }
}

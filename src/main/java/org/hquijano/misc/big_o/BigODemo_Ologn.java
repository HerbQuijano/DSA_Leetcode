package org.hquijano.misc.big_o;

public class BigODemo_Ologn {

    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,8,9,10};
        int target = 6;

        findItem(arr, target);

        // Time complexity: O(log n) because the search space is halved in each iteration
    }

    public static void findItem(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) { // while left side is less than or equal to right side
            int mid = left + (right - left) / 2; // finds the middle index

            if (arr[mid] == target) { // if item is found, print its index and return
                System.out.println("Item found at index: " + mid);
                return;
            }

            if (arr[mid] < target) { // if item is greater than mid, search in the right half
                left = mid + 1;
            } else { // if item is less than mid, search in the left half
                right = mid - 1;
            }
            // repeat until left side is greater than right side
            // if item is not found, print a message indicating that
            System.out.println("Item not found in the array.");
        }
    }
}






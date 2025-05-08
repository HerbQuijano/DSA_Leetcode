package org.hquijano.misc.big_o;

public class BigODemo_O1 {
    public static int addItems(int n){
        return n + n;
    }

    // The time complexity of this method is O(1)
    // This is because the number of operations (n + n) does not depend on the input size

    public static void main(String[] args) {
        System.out.println(addItems(1000000));
    }
}



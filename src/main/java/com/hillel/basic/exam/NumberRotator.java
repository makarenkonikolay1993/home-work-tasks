package com.hillel.basic.exam;

/**
 * Take a number: 56789. Rotate left, you get 67895.
 * Keep the first digit in place and rotate left the other digits: 68957.
 * Keep the first two digits in place and rotate the other ones: 68579.
 * Keep the first three digits and rotate left the rest: 68597. Now it is over since keeping the first four it remains
 * only one digit which rotated is itself.
 * <p>
 * You have the following sequence of numbers:
 * 56789 -> 67895 -> 68957 -> 68579 -> 68597
 * and you must return the greatest: 68957.
 * <p>
 * Calling this function max_rot (or maxRot or ... depending on the language)
 * max_rot(56789) should return 68957
 */

public class NumberRotator {

    public static long rotate(long n) {
//<<<<<<< HEAD

        long max = n;
        String t = String.valueOf(n);
        String temp = "";
        String temp1 = "";
        for (int i = 0 ; i < 2; i++){
            temp = t.substring(i, i+1);
            temp1 = t.substring(0, i);
            t=temp1+t.substring(i+1)+temp;
            max = Math.max(max, Long.parseLong(t));
        }

        return max;
//=======
//        String input = String.valueOf(n);
//        for (int i = 0; i < input.length()-1; i++) {
//            input = input.substring(0, i) + input.substring(i + 1) + input.charAt(i);
//            long current = Long.parseLong(input);
//            if (n < current) {
//                n = current;
//            }
//        }
//        return n;
//>>>>>>> upstream/master
    }
}

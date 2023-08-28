package hacker;

import java.util.List;

class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
    protected x = 0;
        int len = arr.size();
        double positive = 0;
        double negative = 0;
        double zero = 0;

        for (Integer integer : arr) {
            int v = integer;
            double r = (double) 1 / len;

            if (v == 0) {
                zero += r;
            } else if (v > 0) {
                positive += r;
            } else {
                negative += r;
            }
        }

        System.out.println(positive);
        System.out.println(negative);
        System.out.println(zero);
    }

    public static void main(String[] args) {
        List<Integer> arr = List.of(-4, 3, -9, 0, 4, 1);
        plusMinus(arr);
    }
}



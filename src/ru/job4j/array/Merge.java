package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int indexL = 0;
        int indexR = 0;
        int indexRsl = 0;
        int[] rsl = new int[left.length + right.length];
        while (indexL < left.length && indexR < right.length) {
            if (left[indexL] < right[indexR]) {
                rsl[indexRsl++] = left[indexL++];
            } else {
                rsl[indexRsl++] = right[indexR++];
            }
        }
        while (indexL < left.length) {
            rsl[indexRsl++] = left[indexL++];
        }
        while (indexR < right.length) {
            rsl[indexRsl++] = right[indexR++];
        }
        return rsl;
    }
}

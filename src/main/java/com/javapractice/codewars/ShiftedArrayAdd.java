package com.javapractice.codewars;

public class ShiftedArrayAdd {
    public static int[] addingShifted(int[][] arrayOfArrays, int shift) {
        int[] result = new int[arrayOfArrays[0].length + shift * (arrayOfArrays.length - 1)];
        for (int i = 0; i < arrayOfArrays.length; i++) {
            for (int j = 0; j < arrayOfArrays[i].length; j++) {
                int shiftIndex = shift * i;
                result[j + shiftIndex] += arrayOfArrays[i][j];
            }
        }
        return result;
    }
}

package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // -- Array algorithms --

        //HW 3 Selection Sort

        int[] DATA = {-4, 11, 7, -12, 6, 1};

        for (int i=0; i<DATA.length; i++){
            int smallest = i;
            for (int j=i; j<DATA.length; j++){
                if (DATA[smallest] < DATA[j]){
                    smallest = j;
                }
            }
            int b = DATA[i];
            DATA[i] = DATA[smallest];
            DATA[smallest] = b;
        }
        System.out.println(Arrays.toString(DATA));

        //HW 3 Bubble Sort

        int[] DATA2 = {-4, 11, 7, -12, 6, 1};
        boolean changed = true;

        while (changed == true) {
            changed = false;
            for (int i = 0; i < DATA2.length; i++) {

                if (i != 0) {
                    if (DATA2[i - 1] > DATA2[i]) {
                        DATA2 = swap_elements(DATA2, i - 1, i);
                        changed = true;
                    }
                }

                if (i != DATA2.length - 1) {
                    if (DATA2[i + 1] < DATA2[i]) {
                        DATA2 = swap_elements(DATA2, i + 1, i);
                        changed = true;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(DATA2));

        //HW 5
        int[] ARRAY = {9, 7, 2, 11};

        for (int i=1; i<ARRAY.length; i++){
            int VAL = ARRAY[i];
            int j = i - 1;
            while (j >= 0 && ARRAY[j] > VAL){
                ARRAY[j + 1] = ARRAY[j];
                j -= 1;
            }
            ARRAY[j + 1] = VAL;
        }
        System.out.println(Arrays.toString(ARRAY));
    }

    public static int[] swap_elements(int[] array, int i, int j) {
        int b = array[i];
        array[i] = array[j];
        array[j] = b;
        return array;
    }
}

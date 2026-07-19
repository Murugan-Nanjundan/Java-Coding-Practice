package ArrayPack;

import java.util.Arrays;

public class MoveZerosToEnd {

    public static void main(String[] args) {

        int[] arr = {0, 5, 0, 3, 8, 0, 1};

        int index = 0;

        for (int num : arr) {
            if (num != 0)
                arr[index++] = num;
        }

        while (index < arr.length)
            arr[index++] = 0;

        System.out.println(Arrays.toString(arr));
    }
}
package ArrayPack;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {

    public static void main(String[] args) {

        int[] arr = {1,1,2,2,3,4,4,5};

        int index = 1;

        for(int i=1;i<arr.length;i++){

            if(arr[i] != arr[i-1]){
                arr[index++] = arr[i];
            }
        }

        System.out.println(Arrays.toString(Arrays.copyOf(arr,index)));
    }
}
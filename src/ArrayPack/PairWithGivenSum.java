package ArrayPack;

import java.util.HashSet;

public class PairWithGivenSum {

    public static void main(String[] args) {

        int[] arr = {2,7,11,15,3,6};
        int target = 9;

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){

            if(set.contains(target-num)){
                System.out.println((target-num)+" "+num);
                return;
            }

            set.add(num);
        }

        System.out.println("No Pair Found");
    }
}
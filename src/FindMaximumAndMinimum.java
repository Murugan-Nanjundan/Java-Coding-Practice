public class FindMaximumAndMinimum {
    public static void main(String[] args) {
        int[] arr={10,50,40,20,30};
        int min =arr[0];
        int max =arr[0];

        for(int num:arr)
        {
            if(num<min)
            {
                min=num;
            }
            if(num>max)
            {
                max=num;
            }
        }
        System.out.println("Min num:" + min +"Max Num: " + max);
    }
}

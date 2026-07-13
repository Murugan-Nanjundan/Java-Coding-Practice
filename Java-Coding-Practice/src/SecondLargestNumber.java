public class SecondLargestNumber {
    public static void main(String[] args) {

        int[] numbers={3,6,2,8,9,40,20,5,99,78};
        int first =Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for(int number:numbers)
        {
            if(number>first){
                second =first;
                first=number;
            }
            else if(number>second && number!=first)
            {
                second=number;
            }
        }

        System.out.println("Second highest number" + second);
    }
}

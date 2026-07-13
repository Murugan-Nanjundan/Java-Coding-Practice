public class ReverseString {
    public static void main(String[] args) {
        String name="Murugan";

        // option1
       StringBuilder reverseStringOption1= new StringBuilder();
       for(int i = name.length()-1 ;i>=0;i--)
       {
           reverseStringOption1.append(name.charAt(i));
       }
       System.out.println("option1 " + reverseStringOption1);

       //option 2

        StringBuilder str = new StringBuilder(name);
        System.out.println("option 2 " + str.reverse());
    }
}
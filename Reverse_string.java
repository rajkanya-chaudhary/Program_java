// public class Reverse_string {
//     public static void main(String[] args) {
//         String str = "madam";
//         String rev = "";
//         for(int i = str.length()-1;i>=0;i--)
//         {
//             rev = rev +str.charAt(i);
//         }
//          System.out.println(rev);
//         if(str.equals(rev))
//         {
//             System.out.println("palindrome String ");
//         }
//         else
//         {
//             System.out.println("Not Palindrome Sring ");
//         }
//     }
// }

// public class Reverse_string
// {
//     public static void main(String[] args) {
//         String str = "Dimpal";
//         String rev = " ";
//         for(int i = str.length()-1;i>0;i--)
//         {
//             rev = rev + str.charAt(i);
//         }
//         System.out.println("String Reverse = " + rev);
//     }
// }

public class Reverse_string
{
    public static void main(String[] args) {
        String str = "madam";
        String rev = "";
        for(int i = str.length()-1;i>=0;i--)
        {
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev))
        {
            System.out.println("Palindrome String ");
        }
        else{
            System.out.println("Not Palindrome String");

        }
    }
}
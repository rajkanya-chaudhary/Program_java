// public class Largest_element_string {
//     public static void main(String[] args) {
//         String str = "dimpal is a Software developer";
//              str = str + " ";
//              String Largest = "";
//              String currtword = "";
//              for(int i = 0;i<str.length();i++)
//              {
//                 char ch = str.charAt(i);
//                 if(ch != ' ')
//                 {
//                     currtword = currtword + ch;
//                 }
//                 else
//                 {
//                     if(currtword.length()>Largest.length())
//                     {
//                         Largest = currtword;
//                     }
//                     currtword = "";
//                 }
//              }
//              System.out.println("Largest String = " + Largest);
//              System.out.println("LArgest String lenght = " + Largest.length());
//     }
// }
public class Largest_element_string {
    public static void main(String[] args) {
        String str = "dimpal";
        String rev = "";
        for(int i = str.length()-1;i>=0;i--)
        {
            rev = rev + str. charAt(i);
        }
        // System.out.println(rev);
        if (str.equals(rev)) {
            System.out.println("Palindrome String ");
        }
        else
        {
            System.out.println("String is not Palindrome " );
        }
    }
}
// public class Largest_string {
//     public static void main(String[] args) {
//         String str = "dimpal is a good developer";
//         str = str + " ";
//         String largest = "";
//         String currentword = "";
//         for(int i = 0;i<str.length();i++)
//         {
//             char ch  = str.charAt(i);
//             if(ch != ' ')
//             {
//                 currentword = currentword + ch;
//             }
//             else{
//                 if(currentword.length()>largest.length())
//                 {
//                     largest = currentword;
//                 }
//                 currentword = "";
//             }

//         }
//         System.out.println("Print Largest String = " +largest);

//     }

    
// }

// public class Largest_string {
//     public static void main(String[] args) {
//         String str = "Dimpal is  Software developers";
//         str = str + " ";
//         String Largest = "";
//         String currtword = "";
//         for(int i = 0;i<str.length();i++)
//         {
//             char ch = str.charAt(i);
//             if(ch != ' ')
//             {
//                 currtword = currtword + ch;
//             }
//             else
//             {
//                 if(currtword.length()>Largest.length())
//                 {
//                     Largest = currtword;
//                 }
//                 currtword = "";
//             }
            
//         }
//         System.out.println("Print Largest String = " + Largest);
//         System.out.println("Print Largest String Length = " + Largest.lenght())

//     }
// }
// Reverse String in java
// public class Largest_string {
//     public static void main(String[] args) {
//         String str = "rajkanya";
//         String rev = "";
//         for( int i = str.length()-1;i>=0;i--)
//         {
//             rev = rev + str.charAt(i);

//         }
//         System.out.println("print Reverse String = " + rev);

//     }
// }

public class Largest_string {
    public static void main(String[] args) {
        String str = "level";
        String rev = "";
        for(int i = str.length()-1;i>=0;i--)
        {
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev))
        {
            System.out.println("Palindime String ");
        }
        else
        {
            System.out.println("Not Palindrome String ");
        }
    }
    

    }




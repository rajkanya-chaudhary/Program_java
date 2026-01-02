// public class Remove_duplicate {
//     public static void main(String[] args) {
//         String str = "aaabbccddss";
//         String result = "";
//         for(int i = 0;i<str.length();i++)
//         {
//             char ch = str.charAt(i);
//             boolean found = false;
//             for(int j = 0;j<result.length();j++)
//             {
//                 if(result.charAt(j)==ch)
//                 {
//                     found = true;
//                     break;
//                 }
//             }
//             if(!found)
//             {
//                 result = result + ch;
//             }
//         }
//         System.out.println("After Removing Duplicate element = " + result);
//     }
// }

// // public class Remove_duplicate {
// //     public static void main(String[] args) {

// //         String str = "aaaabbccdd";
// //         String result = "";

// //         for(int i = 0; i < str.length(); i++) {

// //             char ch = str.charAt(i);
// //             boolean found = false;

// //             // check in result, not in str
// //             for(int j = 0; j < result.length(); j++) {
// //                 if(result.charAt(j) == ch) {
// //                     found = true;
// //                     break;
// //                 }
// //             }

// //             if(!found) {
// //                 result = result + ch;
// //             }
// //         }

// //         System.out.println("After removing duplicates: " + result);
// //     }
// // }

// public class Remove_duplicate
// {
//     public static void main(String[] args) {
//         String str = "aaabbddcccss";
//         String result = "";
//         for(int i = 0;i<str.length();i++)
//         {
//             char ch = str.charAt(i);
//             boolean found = false;
//             for(int j = 0;j<result.length();j++)
//             {
//                 if(result.charAt(j)== ch)
//                 {
//                     found = true;
//                     break;
//                 }
//             }
//             if(!found)
//             {
//                 result = result + ch;
//             }
//         }
//         System.out.println("After removing duplicate element = " + result);
//     }
// }

// public class Remove_duplicate
// {
//     public static void main(String[] args) {
//         String str = "aahchsbwshuwvfdbdssssssssss";
//         String remove = "";
//         for(int i = 0 ; i<str.length();i++)
//         {
//             char ch = str.charAt(i);
//             boolean found = false;
//             for(int j = 0;j<remove.length();j++)
//             {
//                 if(remove.charAt(j) == ch)
//                 {
//                     found = true;
//                     break;
//                 }
//             }
//             if (!found) {
//                 remove = remove + ch;
                
//             }
//         }
//         System.out.println( " After Removing duplicate element  = " + remove);
//     }
// }



 public class Remove_duplicate {
    public static void main(String[] args) {
        String str = "aaabbbcc";
        String result = "";
        for(int i = 0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            boolean found = false;
            for(int j = 0;j<result.length();j++)
            {
                if(result.charAt(j) == ch)
                {
                    found = true;
                    break;
                }
            }
            if(!found)
            {
                result = result + ch;
            }
        }
        System.out.println(" After removing Duplicate element = " + result);
    }
 }

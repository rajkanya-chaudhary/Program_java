// // // public class Remove_space_string {
// // //     public static void main(String[] args) {
// // //         String str = "d i m p a l chuadhary";
// // //         String result = "";
// // //         for(int i = 0;i<str.length();i++)
// // //         {
// // //             if(str.charAt(i) != ' ')
// // //             {
// // //                 result = result + str.charAt(i);
// // //             }
// // //         }
// // //         System.out.println(result);
// // //     }
// // // }



// // public class Remove_space_string {
// //     public static void main(String[] args) {
// //         String str = "D impal chaudhary ";
// //         String result = "";
// //         for(int i = 0;i<str.length();i++)
// //         {
// //             if(str.charAt(i) != ' '){
// //             result = result + str.charAt(i);
// //         }
// //     }
// //     System.out.println("Removing Space i String  = " +result);

// //     }
// // }

 
// public class Remove_space_string {
//     public static void main(String[] args) {
//         String str = "Dimpal";
//         int  count = 0;
//         for(int i = 0;i<str.length();i++)
//         {
//              count++;
             
//         }
//         System.out.println("Count String = " + count);
//     }
// }

public class Remove_space_string {
    public static void main(String[] args) {
        String str = "dimpal is a good girl";
        int count = 1;
        for(int i = 0;i<str.length();i++)
        {
           if(str.charAt(i) == ' ')
           {
            count++;
           }
        }
        System.out.println("Count all String word = " + count);
    }
}
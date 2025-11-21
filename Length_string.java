// public class Length_string {
//     public static void main(String[] args) {
//         String str = "Dimpal";
//         int count = 0;
//         for(char c : str.toCharArray())
//         {
//             count++;
//         }
//         System.out.println("print the lenght = " + count);
//     }
// }
// public class Length_string {
//     public static void main(String[] args) {
//         String str = "dimpal chaudhary";
//         int count = 0;
//         for(int i = 0;i<str.length();i++)
//         {
//             count++;
//         }
//         System.out.println("print the length = " + count);
//     }
// }
public class Length_string {
    public static void main(String[] args) {
        String str = "dimpal";
        String rev = "";
        for(int i = str.length()-1;i>=0;i--)
        {
            rev = rev + str.charAt(i);
        }
        System.out.println("String Reverse = " + rev);
    }
}

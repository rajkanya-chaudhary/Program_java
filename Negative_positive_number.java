// // public class Negative_positive_number {
// //     public static void main(String[] args) {
// //         int n = 00;
// //         if(n>0)
// //         {
// //             System.out.println("The number is Positive ");
// //         }
// //         else if(n<0)
// //         {
// //             System.out.println("number is Negative");
// //         }
// //         else
// //         {
// //             System.out.println("Number is Zero");
// //         }
// //     }
// // }

// // sub of natural numbers 

// // public class Negative_positive_number
// // {
// //     public static void main(String[] args) {
// //         int n = 5;
// //         int sum = 0;
// //         for(int i = 0;i<=n;i++)
// //         {
// //             sum = sum + i;
// //         }
// //         System.out.println("Sum of number = " + sum);
// //     }
// // }

// public class Negative_positive_number{
//     public static void main(String[] args) {
//         int n = 4;
//         boolean isPrime = true;
//         for(int i = 2; i<=n-1;i++)
//         {
//             if(n % i == 0)
//             {
//                 isPrime = false;
//                 break;
//             }
//         }
//         if(isPrime == true)
//         {
//             System.out.println( n + " is Prime  number ");
//         }
//         else
//             {
//             System.out.println( n + " Not Prime number");
//         }
        
    
//     }
// }

public class Negative_positive_number {
    public static void main(String[] args) {
        int n = 3;
        boolean isPrime = true;

        for(int i = 2; i <= n-1; i++) {
            if(n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            System.out.println(n + " is Prime number");
        } else {
            System.out.println(n + " Not Prime number");
        }
    }
}


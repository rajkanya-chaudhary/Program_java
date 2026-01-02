// public class All_array_code {
//     // Largest number 
//     public static void main(String[] args) {
//         int a[] = {1,2,55,22,88,91};
//         int Largest = a[0];
//         for(int i = 1;i<a.length;i++)
//         {
//             if(a[i] > Largest)
//             {
//                 Largest = a[i];
//             }
//         }
//         System.out.println("Largest Number in array = " + Largest);

//     }

    
// }

// second largets element print
//  public class All_array_code {
//     public static void main(String[] args) {
//         int a[] = {11,33,28,44,32,10,50};
//         int temp;

//         for(int i = 0; i < a.length; i++) {
//             for(int j = i + 1; j < a.length; j++) {
//                 if(a[i] < a[j]) {
//                     temp = a[i];
//                     a[i] = a[j];
//                     a[j] = temp;
//                 }
//             }
//         }

//         System.out.println("Second Largest Number = " + a[1]);
//     }
// }
// Sort array without using any method 
//  
//  public class All_array_code {
//     public static void main(String[] args) {
//         int a[] = {11,33,28,44,32,10,50};
//         int temp;

//         for(int i = 0; i < a.length; i++) {
//             for(int j = i + 1; j < a.length; j++) {
//                 if(a[i] < a[j]) {  // a[i]<a[j] to decending order  ghatate krm me print hoga 
//                     temp = a[i];     // a[i]<a[j] to Ascending  order  bdate krm mr print krega  krm me print hoga
//                     a[i] = a[j];
//                     a[j] = temp;
//                 }
//             }
//         }
//         for(int i = 0;i<a.length;i++){
//         System.out.print(a[i] + " ");
//         }
//     }
//  }

// print target number
//  public class All_array_code {
//     public static void main(String[] args) {
//         int a[] = {11,2,44,3,12,7,17};
//         int sum = 5;
//         for(int i = 0;i<a.length;i++)
//         {
//             for(int j = i + 1;j<a.length-1;j++)
//             {
//                 if(a[i]+a[j]==sum)
//                 {
//                     System.out.println("Print target Number = " + a[i] + " , " + a[j]);
//                 }
//             }
//         }
        
//     }
//  }


// public class All_array_code {
//     public static void main(String[] args) {
//         int a [] = {1,2,6,8,2,9,2,5,2,7,1};
//         System.out.println("Removing duplicate element = " );
//         for(int i = 0;i<a.length;i++)
//         {
//             boolean duplicate = false;
//             for(int j = 0;j<i;j++)
//             {
//                 if(a[i]==a[j])
//                 {
//                     duplicate = true;
//                     break;
//                 }
//             }
//             if(!duplicate)
//             {
//                 System.out.print(a[i] + " ");
//             }
//         }
//     }
// }


// public class All_array_code {
//     public static void main(String[] args) {
//         int a[] = {1,3,8,4,2,9,1};
//         int first = 0;
//         int last = a.length-1;
//         while (first < last) {
//             int temp = a[last];
//             a[last] = a[first];
//             a[first] = temp;
//             first++;
//             last--;
            
//         }
//         for(int i = 0;i<a.length;i++)
//         {
//             System.out.print(a[i] + " ");
//         }
//     }
        
    
// }
// public class All_array_code {
//     public static void main(String[] args) {
//         int a[] = {1,4,8,2,6,21,44,92};
//         int Largest = 0;
//         for(int i = 1;i<a.length;i++)
//         {
//             if(a[i] > Largest)
//             {
//                 Largest = a[i];

//             }
//         }
//         System.out.println("Print Largest Element = " + Largest);
//     }
// }

// public class All_array_code {
//     public static void main(String[] args) {
//         int a[] = {1,5,38,4,29,2};
//         int Largest = a[0];
//         int index = 0;
//         for(int i = 1;i<a.length;i++)
//         {
//             if(a[i] >Largest)
//             {
//                 Largest = a[i];
//                 index = i;
//             }
//         }
//         System.out.println("Print Largest = " + Largest);
//         System.out.println("Print index = " +index);
//     }
// }
// public class All_array_code {
//     public static void main(String[] args) {
//         int a[] = {1,2,7,4,3,91,3,0};
//         int Min = a[0];
//         int index = 0;
//         for(int i = 1;i<a.length;i++)
//         {
//             if(a[i] < Min)
//             {
//                 Min = a[i];
//                 index = i;
//             }
//         }
//         System.out.println("Print Minimum Number = " + Min);
//         System.out.println("Print Index = " + index);
//     }
// }
public class All_array_code {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int sum = 0;
        for(int i = 0;i<a.length;i++)
        {
            sum = sum + a[i];
        }
        System.out.println("Print Number sum of all element = " + sum);

    }
}



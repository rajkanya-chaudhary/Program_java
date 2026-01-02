public class Removing_duplicate {
    public static void main(String[] args) {
        int a[] = {1,3,2,5,2,5,3,8,4,2,1};
        for(int i = 0;i<a.length;i++)
        {
            boolean duplicate = false;
            for(int j = 0;j<i;j++)
            {
                if(a[i]==a[j])
                {
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate)
            {
                System.out.print(a[i] + " ");
            }
        }

    }
     
    
}
// public class Removing_duplicate {
//     public static void main(String[] args) {

//         int a[] = {1,3,2,5,2,5,3,8,4,2,1};

//         System.out.print("Array after removing duplicates: ");

//         for(int i = 0; i < a.length; i++) {
//             boolean duplicate = false;

//             // check previous elements
//             for(int j = 0; j < i; j++) {
//                 if(a[i] == a[j]) {
//                     duplicate = true;
//                     break;
//                 }
//             }

//             if(!duplicate) {
//                 System.out.print(a[i] + " ");
//             }
//         }
//     }
// }

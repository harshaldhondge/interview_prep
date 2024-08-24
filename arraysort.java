// public class arraysort {
//     public static void main(String[] args) {
//         int arr[] = new int []{60,30,80,50,20,10};

//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 int k = 0;
//                 if(arr[i]>arr[j]){
//                 k = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = k;
//                 }
//             }
//             System.out.println(arr[i]);
//         }
//     }
// }


//OR
import java.util.*;
public class arraysort {
        public static void main(String[] args) {
            int arr[] = new int []{60,30,80,50,20,10};

            Arrays.sort(arr);

            for(int x:arr){
                System.out.println(x);
            }

        }
    }


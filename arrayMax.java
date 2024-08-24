// public class arrayMax {
//     public static void main(String[] args) {
//         int arr[] = new int[]{10,20,30,40,70,30};

//         int max = arr[0];

//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>max){
//                 max = arr[i];
//             }
//         }
//         System.out.println(max);
//     }
// }


// OR

import java.util.*;

public class arrayMax {
    public static void main(String[] args) {
        
        ArrayList al = new ArrayList();

        al.add(43);
        al.add(68);
        al.add(23);
        al.add(56);
        al.add(34);
        al.add(44);

        System.out.println(Collections.max(al));
        al.remove(1);
        System.out.println(Collections.max(al));
    }
}
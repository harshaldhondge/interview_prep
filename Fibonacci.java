import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;

        for(int i=1;i<=num;i++){
            System.out.print(a+" ");
            int c = a+b;
            a = b;
            b = c;
        }
    }
    
}

import java.util.Scanner;
public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        int sum = 0;

        while(num!=0){
            int a = num % 10;
            sum = sum + a;
            num = num/10;
        }
        System.out.println(sum);
    }    
}

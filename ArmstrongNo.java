import java.util.Scanner;

public class ArmstrongNo{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        
        int sum = 0;
        int temp = num;
        
        while(num!=0){
            int a = num % 10;
            sum = sum + a*a*a;
            num = num / 10;
        }

        if(temp==sum){
            System.out.println(temp+" is a Armstrong Number");
        } else {
            System.out.println(temp+" is not a Armstrong Number");
        }
    }
}
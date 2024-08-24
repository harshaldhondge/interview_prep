import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        int a = 0;
        int rev = 0;
        int temp = num;

        while(num!=0){
            a = num % 10;
            rev = rev * 10 + a;
            num = num / 10;
                }
        if(rev==temp){
            System.out.println(temp +" is a Palindrome Number");
        } else {
            System.out.println(temp +" is not a Palindrome Number");
        }
    }
}

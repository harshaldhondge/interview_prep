import java.util.Scanner;
class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        int a = 0;
        int rev = 0;

        while (num!=0) {
            a = num % 10;
            rev = rev*10+a;
            num = num / 10;
        }
        System.out.println(rev);
    }    
}

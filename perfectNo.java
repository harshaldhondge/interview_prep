import java.util.Scanner;

public class perfectNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        int sum = 0;

        for(int i=1;i<num;i++){
            if(num%i==0){
                sum = sum + i;
            }
        }
        if(num==sum){
            System.out.println(num+" is a perfect Number");
        } else {
            System.out.println(num+" is not a perfect Number");
        }
    }    
}

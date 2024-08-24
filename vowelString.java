public class vowelString {
    public static void main(String[] args) {
         String str = "Harshal";
         int count = 0;
         for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }
        }
        if(count>0){
            System.out.println("The Given String contains Vowels");
            } else {
                System.out.println("The Given String does not contains Vowels");
            }
    }
}

public class reverseString {
    public static void main(String[] args) {
        
        String str = "Harshal";

        StringBuffer sb = new StringBuffer(str);

        str = sb.reverse().toString();
        System.out.println(str);
    }
}

package kiran.com;

public class program12 {
    public static void main(String[] args) {
        String st = "Hii i am kiran how are you";
        int total_count=st.length();
        int remove_i=st.replace("i","").length();
        int i=total_count-remove_i;
        System.out.println("the total time of i occur in this string is "+i+ " times");
    }
}

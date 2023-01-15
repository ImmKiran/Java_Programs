package kiran.com;

public class recursion5 {
    static void sum(int a,int b,int sum){
        if (a==b) {
            sum += a;
            System.out.println(sum);
             return;
        }
        sum+=a;
           sum(a+1,b,sum);
    }

    public static void main(String[] args) {
        sum(1,20,0);
    }
}

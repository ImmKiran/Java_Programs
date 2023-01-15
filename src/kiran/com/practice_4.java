package kiran.com;
public class practice_4 {
    static int sum_rec(int n){
        // 1+2+3+4..........
        if( n==1){
            return 1;
        }
        return n+sum_rec(n-1);
    }

    public static void main(String[] args) {
        System.out.println(sum_rec(10));
    }
}

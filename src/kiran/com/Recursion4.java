package kiran.com;

public class Recursion4 {
    static void odd(int x){
        if (x>20){
            return;
        }
        else{
            if (x%2==0)
                x+=1;
            else
                System.out.println(x);
            odd(x+2);
        }
    }
    public static void main(String[] args) {
        odd(1);
    }
}

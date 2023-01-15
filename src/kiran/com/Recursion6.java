package kiran.com;

public class Recursion6{
    static int sumOfEven(int a){
        if(a==1)
            return(2);
        return sumOfEven(2*a-1);
    }
    public static void main(String[] args) {
        System.out.println(sumOfEven(20));
    }
}

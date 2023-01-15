package kiran.com;

public class varrage {
    static int sum(int...arr){  // if write sum(int x, int...arr) means we have to pass at_least 1 variable
        int result=0;
        for (int a: arr){
            result=result+a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(3));
        System.out.println(sum(3,4));
        System.out.println(sum(3,4,5));
        System.out.println(sum());
        System.out.println(sum(3,7,6,4));//it throws error if we fix x in the above
    }

}

package kiran.com;

public class Recursion3 {
    static void even(int x){
        if(x==0){
            return;
        }
        else {

            if(x%2!=0){
                x+=1;
            }
                System.out.println(x);
                even(x-2);
        }
    }
    public static void main(String[] args) {
        even(21);
    }
}

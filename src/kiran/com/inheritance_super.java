package kiran.com;
class base{
    base(){
        System.out.println("this is our base constructor");
    }
    base (int x){
        System.out.println("the base value of x is "+ x);
    }
}
class derived extends base {
    derived(){
        System.out.println("this is derived constructor");
    }
    derived(int x, int y){
        super(x);
        System.out.println("this is derived constructor "+ x +" "+ y);
    }
}
class child extends derived {
    child(){
        System.out.println("this is child constructor");
    }
    child(int x,int y,int z){
        super(x,y);
        System.out.println("this child is "+ z);
    }
}

public class inheritance_super{
    public static void main(String[] args) {
        child cd = new child(3,4,5);
    }
}

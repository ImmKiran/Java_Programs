package kiran.com;
public class methods {
  // int l (int x,int y)
    static int l(int x,int y)
   {
        int z;
        if (x>y){
            z= x+y;
        }
        else {
            z=x*y;
        }
        return z;
    }

    public static void main(String[] args) {
        int a=3;
        int b=4;
        int c;
//        methods ob=new methods();
//        c = ob.l (a,b);         if no static word mention then we have to create an object
        c=l(a,b);
        System.out.println(c);
        int a1=5;
        int b1=3;
        int c1=l(a1,b1);
        System.out.println(c1);
    }

}

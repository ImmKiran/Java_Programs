package kiran.com;
class A {
    public int k() {
        return 2;
    }

    public void meth1() {
        System.out.println("meth1 of class A");
    }
}
    class B extends A{
        public void meth1(){
            System.out.println("meth1 of class B");
        }
        public void meth2(){
            System.out.println("meth2 of class B");
        }
    }

public class method_overloading {
    public static void main(String[] args) {
        A a= new A();
        B b=new B();
        a.meth1();
        b.meth2();
        System.out.println(a.k());
        b.meth1();
        System.out.println(b.k());
    }
}

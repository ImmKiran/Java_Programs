package kiran.com;
interface child1{
    void meth1();
    void meth2();
}
interface child2 extends child1 {
     void meth3();
     void meth4();
}
  class my_class implements child2{
     @Override
     public void meth1() {
         System.out.println("meth1");
     }
     public void meth2() {
         System.out.println("meth2");
     }
     public void meth3() {
         System.out.println("meth3");
     }
     public void meth4() {
         System.out.println("meth4");

     }

 }

public class implement_inheritance {
    public static void main(String[] args) {
        my_class obj =new my_class();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}

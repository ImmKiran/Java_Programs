package kiran.com;
class my_thread extends thread{
    public void run(){
        int i=0;
        while (i<5) {
            System.out.println("i am good");
            i++;
        }
    }
}
class thread1 extends thread{
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("playing");
        }
    }
}
public class thread {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        my_thread t2 = new my_thread();
        t1.run();
        t2.run();
    }
}

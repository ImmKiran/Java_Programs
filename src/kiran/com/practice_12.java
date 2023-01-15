package kiran.com;
abstract class telephone{
    abstract void ring();
    abstract void connect();
}
class my_smart_phone extends telephone{
    @Override
    void ring() {
        System.out.println("ringing the phone");
    }
    @Override
    void connect() {
        System.out.println("connecting call..");
    }
    void music(){
        System.out.println("start music...");
    }
}
public class practice_12 {
    public static void main(String[] args) {
        telephone mobile=  new my_smart_phone();
        mobile.connect();
        mobile.ring();
       // mobile.music(); --> shows error
        my_smart_phone smart_mobile = new my_smart_phone();
        smart_mobile.music();
        smart_mobile.ring();
        smart_mobile.connect();
    }
}

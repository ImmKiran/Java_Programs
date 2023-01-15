package kiran.com;
class phone{
    phone(){
        System.out.println("these are the simple phone");
    }
    public void call(){
        System.out.println("phone calling");
    }
    public void showtime(){
        System.out.println("time is 9 am");
    }
}
class smart_phone extends phone{
    public void music(){
        System.out.println("play music");
    }
    public void call(){
        System.out.println("smart phone is calling");
    }
}

public class dynamic_method {
    public static void main(String[] args) {
       phone obj =new smart_phone();
      obj.call();
      obj.showtime();
      // obj.music(); it throw error
        smart_phone mi =new smart_phone();
        mi.music();
    }
}

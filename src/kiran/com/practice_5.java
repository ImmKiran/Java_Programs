package kiran.com;
interface tv_remote{
    void switch_channel();
    void sound();
    default void display() {

        System.out.println("picture quality is high resolution");
    }
}
interface smart_tv_remote extends tv_remote{
    void open_youtube();
    void open_hot_star();
}
class remote implements smart_tv_remote{
    public void charge(){
        System.out.println("charge the battery");
    }
    @Override
    public void open_youtube() {
        System.out.println("opening you tube");
    }

    @Override
    public void open_hot_star() {
        System.out.println("opening hot star");
    }

    @Override
    public void switch_channel() {
        System.out.println("change the channel");
    }

    @Override
    public void sound() {
        System.out.println("increase or decrease the sound");
    }
}
public class practice_5 {
    public static void main(String[] args) {
      remote DD = new remote();
       DD.display();
       DD.sound();
       DD.switch_channel();
        DD.charge();
       smart_tv_remote Dish =new remote();
        Dish.open_youtube();
        Dish.open_hot_star();
        Dish.display();
//        Dish.charge();  --> throw error
         tv_remote sony = new remote();
         sony.display();
         sony.sound();
         sony.switch_channel();
    }
}

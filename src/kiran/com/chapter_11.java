package kiran.com;
interface cycle{
    int a=10;
    void speedup(int increment);
    void apply_break(int decrement);
}

interface horn{
    void horn1();
    void horn2();
    }
    class hero implements cycle,horn{
    void blow_horn() {
        System.out.println("pee po pee");
    }
        public void speedup(int increment){
            System.out.println("apply speed");
    }
   public void apply_break(int decrement){
        System.out.println("slow down");
   }
        @Override
        public void horn1() {
            System.out.println("go go gone");
        }

        @Override
        public void horn2() {
            System.out.println("side please");
        }
    }

public class chapter_11 {
    public static void main(String[] args) {
        hero ob = new hero();
        ob.apply_break(2);
        ob.blow_horn();
        ob.horn1();
        ob.horn2();
        ob.speedup(4);
    System.out.println(ob.a);

    }
}

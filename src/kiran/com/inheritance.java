package kiran.com;
class animal {
    private int number;

    public int getNumber() {
        return number;
    }
    public void setNumber(int n){
        this.number = n;
        System.out.println("animals are believable " + n);
    }
}
    class cat extends animal{
       public int x;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
            System.out.println("cats are cute");
        }
        public void print(){
            System.out.println("you are beautiful");
        }
    }
public class inheritance {
    public static void main(String[] args) {
       animal an  =new animal() ;
       an.setNumber(4);
       System.out.println(an.getNumber());
        cat c=new cat();
        c.setX(5);
        System.out.println(c.getX());
    }
}

import java.io.DataInputStream;

public class k {

        public static void main(String[] args)
        {
            DataInputStream ob=new DataInputStream(System.in);
            int x=0, y=0, z;
            try
            {
                x=Integer.parseInt(ob.readLine());
                y=Integer.parseInt(ob.readLine());
            }

            catch(Exception ignored) {

            }
            z=x+y;
            System.out.println("sum=" + z);
        }
    }



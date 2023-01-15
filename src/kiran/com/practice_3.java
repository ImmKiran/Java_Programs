package kiran.com;

public class practice_3 {
    public static void main(String[] args) {
        int n=5;
        /*   1.  print ***
                       **
                       *
        for(int i=n;i>0;i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }  */
        /*   2.   print *****
        for (int i=0;i<n;i++){
            System.out.print("*");
        }  */
         /*    3.   print  *
                           **
                           ***

          */
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<i+1;j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

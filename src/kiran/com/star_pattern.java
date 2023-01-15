package kiran.com;

public class star_pattern {
    public static void main(String[] args) {
        pattern6(4);
    }
    static void pattern1(int n){
        for (int i = 0; i< n; i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
    }
            System.out.println();
            }
        }
    static void pattern2(int n){
        for(int row =1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int i=0;i<n;i++){
            for (int j=1;j<=i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
   static void pattern5(int n){
        for (int i=0;i<2*n;i++){
            int TotalColInRow = i>n ? 2*n -i :i;
            for (int j=0;j<TotalColInRow;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
   }
    static void pattern6(int n){
        for (int i=0;i<2*n;i++){
            int TotalColInRow = i>n ? 2*n -i :i;
            int NoOfSpace=n-TotalColInRow;
            for (int s=0;s<NoOfSpace;s++){
                System.out.print(" ");
            }
        for (int j=0;j<TotalColInRow;j++){
                System.out.print("* ");
            }
               System.out.println();
        }
    }

    }

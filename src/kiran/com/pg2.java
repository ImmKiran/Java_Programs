package kiran.com;

public class pg2 {
        public static void main(String[] args) {
            int n=7;
            for (int i=n; i>0; i-- ) {
                for (int j=0;j<i;j++){
                    System.out.print(" ");
                }
                for(int k=i+1;k<2*i+1;k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

//    public static void main(String[] args) {
//        String st="Hello good morning";
//        String words[]=st.split(" ");
//        for (int i=0;i< words.length;i++){
//            String s= words[i];
//            System.out.println(s.charAt(0));
//        }
//    }

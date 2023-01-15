package kiran.com;

public class program14 {
    public static void main(String[] args) {
        String st="hii welcome to java";
        String []word=st.split(" ");
        String rst="";
        for (String w:word) {
            String rsw="";
            for (int i=w.length()-1;i>=0;i--){
                rsw=rsw+w.charAt(i);
            }
            rst=rst+rsw+" ";
        }
        System.out.println(rst);
    }
}

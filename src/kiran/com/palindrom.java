package kiran.com;

public class palindrom {
    public static void main(String[] args) {
        String st="kayak";
        String rev="";
        for (int i=st.length()-1;i>=0;i--){
            rev=rev+st.charAt(i);
        }
        if (st.equals(rev)){
            System.out.println("p");
        }
        else {
            System.out.println("np");
        }
    }
}

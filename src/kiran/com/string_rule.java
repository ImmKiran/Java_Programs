package kiran.com;
import java.util.Scanner;

public class string_rule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String name = sc.nextLine();
        int value=name.length(); //it counts spaces also
        System.out.println( "you entered " +value +" digit characters");
//        String name="KIrankirran";
        String li = name.toLowerCase();
        System.out.println( "convert name to lower case "+ li);
        String up =name.toUpperCase();
        System.out.println("convert name to upper case " + up);
        System.out.println(name);// Original value of string not changed
        String st ="    kumar  ";
        String st2 = st.trim();
        System.out.println(st);
        System.out.println(st2);
        System.out.println(name.substring(1));//characters start from 1th position
        System.out.println(name.substring(1,5));//characters start from 1th position and ended in 4th position i.e previous one position
        System.out.println(name.replace("r","s"));
        System.out.println(name.replace("r","sk"));
        System.out.println(name.startsWith("n"));
        System.out.println(name.startsWith("ki"));
        System.out.println(name.startsWith("KI"));
        System.out.println(name.charAt(2));//name of the letter whose index is 2
//       // System.out.println(name.charAt(15));// it can't exicute because index 15 is out of bonds
        System.out.println(name.indexOf("ar"));//return - because there is no such sequence present
        System.out.println(name.indexOf("ra"));//return where the 1st match happen
        System.out.println(name.indexOf("a"));//return where the 1st match happen
        System.out.println(name.lastIndexOf("an"));// it start searching from last
        System.out.println(name.equals("kirankirran"));// case sensitive
        System.out.println(name.equalsIgnoreCase("KIrAN"));//Not case sensitive
    }
}

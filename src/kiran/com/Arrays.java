package kiran.com;

public class Arrays { public static void main(String[] args) {
        int[] marks = {81, 49, 80, 88};
        System.out.println(marks.length);// 1.
       // 2.    int []marks= new int[5];
//        3.  int[]marks;                    These three lines are same we can initialise arrays in 3 ways
//           marks=new int[5];
             // Print arrays

    for (int mark : marks) {

        System.out.println(mark);
    }
//        Reverse arrays element
    System.out.println("the reverse array elements is");
          int l= marks.length;
               int k = Math.floorDiv(l,2);
         int temp;
         for (int i=0;i<k;i++) {
             temp = marks[i];
             marks[i] = marks[l-i-1];
             marks[l-i-1] = temp;
         }
    for (int mark : marks) {
        System.out.println(mark);
    }

    }
}

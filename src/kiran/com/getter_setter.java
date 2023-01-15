package kiran.com;
 class student {
     private int id;
     private String name;

     public void setId(int i) {
         id = i;
     }

     public int getId() {

         return id;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getName() {
         return name;
     }

     public static class getter_setter {
         public static void main(String[] args) {
             student kiran = new student();
//            kiran.id=2;
//        System.out.println(kiran.id);   --> through error due to private id
             kiran.setId(2);
             kiran.setName("hello");
             System.out.println(kiran.getId());
             System.out.println(kiran.getName());
         }
     }
 }

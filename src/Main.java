class Student{
     String name;
     int rollNumber;
     char grade;
     Student(){
          name="Savio Bijo";
          rollNumber=64;
          grade='B';
     }
     public void displayDetails() {
          System.out.println("Name:"+name);
          System.out.println("Roll Number:"+rollNumber);
          System.out.println("Grade:"+grade);
     }
}          
public class Main {
      public static void main(String[] args) {
        Student student=new Student();
           student.displayDetails();
    }
}

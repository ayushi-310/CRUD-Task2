import java.util.*;

public class task2{
    public static void main(String[] args) {

       List<student> s1 = new ArrayList<>();


       //adding student objects to the list
       s1.add(new student(1, "Alice", 30));
       s1.add(new student(2, "Bob", 10));
       s1.add(new student(3, "Charlie", 20));

       //displaying the student details
        for(student s : s1){
              System.out.println("ID: " + s.ID + ", Name: " + s.name + ", Marks: " + s.marks);
         }

        //updating the marks of a student
         s1.get(1).updateMarks(95);   // updating Bob's marks to 95
         s1.get(2).updatename("ravi"); // updating Charlie's name to ravi

        System.out.println("\nAfter updating marks:\n");

        for(student s : s1){
              System.out.println("ID: " + s.ID + ", Name: " + s.name + ", Marks: " + s.marks);
         }

        s1.remove(1);      // removing Bob from the list

        for(student s : s1){
              System.out.println("ID: " + s.ID + ", Name: " + s.name + ", Marks: " + s.marks);
         }


    }
}
class student {
    int ID;
    String name;
    int marks;

    student(int ID, String name, int marks){
        this.ID = ID;
        this.name = name;
        this.marks = marks;
    }

    void updateMarks(int newMarks){
        this.marks = newMarks;
    }

    void updatename(String newname){
        this.name = newname;
    }

    void updateid(int newID){
        this.ID = newID;
    }


}

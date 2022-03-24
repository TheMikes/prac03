package collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {

    public static void displayStudents(ArrayList<Student> students){
        for(Student student: students){
            System.out.println("Name: " + student.getName() + "\t\tGrade: " + student.getGrade());
        }
    }
    public static void main(String[] args)
    {
        // 1. Declare an ArrayList<Student> variable
        ArrayList<Student> myList = new ArrayList<>();

        // 2. Add the students in Student.STUDENTS_ARRAY to your ArrayList

        Collections.addAll(myList, Student.STUDENTS_ARRAY);

        // 3. Create a function named displayStudents(), which takes an ArrayList<Student>
        //    and prints the list of students and their grades. No code needs to be added to
        //    main() for this step.
        displayStudents(myList);
        System.out.println("------------");
        // 4. Sort the ArrayList into alphabetical order by student name and then display
        //    its contents with displayStudents(). First, change the Student class to implement
        //    Comparable<Student>, then write a compareTo method to handle the sorting by name
        //    Then call sort(null) on the ArrayList before displaying it.

        Collections.sort(myList);
        displayStudents(myList);
        System.out.println("------------");
        // 5. Create a HashMap<String, Student> and add the students in the ArrayList to it.
        //    Use the student's name as the key and the student object as the value. This way
        //    students can be efficiently looked up in the HashMap.
        HashMap<String, Student> myHashMap = new HashMap<>();

        for(Student student:myList){
            myHashMap.put(student.getName(), student);
        }
        // 6. Use the HashMap to help you set Joshua's grade to 95. Then print out the list of students again.
        Student temp = myHashMap.get("Joshua");
        temp.setGrade(95);

        displayStudents(myList);
    }


}

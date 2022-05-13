//Description of project work:
//Create a console application in healthcare, education or economics topic. Minimal functionality of application:
//- Get the list of elements and print to console.
//- Register a new element.
//- Modify an element.
//- Delete an element.
//It is recommended to organize all of these into a menu, so that user can decide, which action they want to examine and how many times. The fifth menuitem can be exit, which would end the program.
//Communicate with the user via console (data input and output). Manage and store element data in an XML file.
//The program should be structu
//
// red and well documented. The documentation should include the purpose and structure of the program (eg. objectives and functions of classes and XML tags). The documentation can be created as a Javadoc, README.md or standalone word document.
//You need to submit stand-alone solutions, two students cannot have solve the same task.
//
//
//
//Solutions must be submitted by midnight on May 13th. The submission is made with the help of GitHub, similarly to the exam:
//1. Create a new repository named PMI_projectwork.
//2. Upload the solution into this repository (Commit and Push).
//3. Send the repository link in a Teams message or email (csekok@gamma.ttk.pte.hu


import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Student> c = new ArrayList<Student>(); //List of students
        Scanner s = new Scanner(System.in); //Scanner for int
        Scanner s1 = new Scanner(System.in); //Scanner for String

        int ch = 6; //choice
        System.out.println("Welcome to Student Management System!"); // Menu
        do {
            System.out.println("1 - Print the list of students");
            System.out.println("2 - Register a new student");
            System.out.println("3 - Modify a student");
            System.out.println("4 - Delete a student");
            System.out.println("5 - Search a student");
            System.out.println("0 - Exit");
            System.out.println("Please type the number: ");
            ch = s.nextInt();

            if (ch == 1) {
                System.out.println("---------------------------------");
                Iterator<Student> i = c.iterator();
                while (i.hasNext()) { //until the end of the array, printing out
                    Student stu = i.next();
                    System.out.println(stu);
                }
                System.out.println("---------------------------------");
            }

            if (ch == 2) { // Register a new student
                System.out.print("Enter number: ");
                int s_num = s.nextInt();
                System.out.print("Enter a name: ");
                String s_name = s1.nextLine();
                System.out.print("Enter grade: ");
                int grade = s.nextInt();

                c.add(new Student(s_num, s_name, grade));
            }

            if (ch == 3) { // Modify a student
                boolean found = false; // boolean for error handling
                System.out.print("Enter the number to modify: ");
                int s_num = s.nextInt();
                System.out.println("---------------------------------");
                ListIterator<Student> li = c.listIterator();
                while (li.hasNext()) {
                    Student stu = li.next();
                    if (stu.get_s_num() == s_num) {
                        System.out.print("Enter a new name: ");
                        String s_name = s1.nextLine();

                        System.out.print("Enter new grade: ");
                        int grade = s.nextInt();
                        li.set(new Student(s_num, s_name, grade));
                        found = true;
                    }
                }

                if (!found) {
                    System.out.println("NOT FOUND");
                } else {
                    System.out.println("The student is updated.");
                }
                System.out.println("---------------------------------");

            }
            if (ch == 4) { // Delete a student
                boolean found = false;
                System.out.println("Enter the number to delete");
                int s_num = s.nextInt();
                System.out.println("---------------------------------");
                Iterator<Student> i = c.iterator();
                while (i.hasNext()) {
                    Student stu = i.next();
                    if (stu.get_s_num() == s_num) {
                        i.remove();
                        found = true;
                    }
                }

                if (!found) {
                    System.out.println("NOT FOUND");
                } else {
                    System.out.println("The student is deleted.");
                }
                System.out.println("---------------------------------");

            }
            if (ch == 5) { // Search a student
                boolean found = false;
                System.out.print("Enter the number to search: ");
                int s_num = s.nextInt();
                System.out.println("---------------------------------");
                Iterator<Student> i = c.iterator();
                while (i.hasNext()) {
                    Student stu = i.next();
                    if (stu.get_s_num() == s_num) {
                        System.out.println(stu);
                        found = true;
                    }
                }

                if (!found) {
                    System.out.println("NOT FOUND");
                }
                System.out.println("---------------------------------");

            }


        } while (ch != 0); // If user input is 0, it ends


    }
}




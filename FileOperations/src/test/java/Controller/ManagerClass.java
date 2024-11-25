package Controller;

import model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerClass {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
       service.ServiceImplementation serv = new service.ServiceImplementation();
        while (true) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Menu: ");
            System.out.println("1. Add Student\n 2. Remove Student\n 3.Get Student\n 4.dispaly student Details\n 5.display teacher Details\n");
            int option = sc.nextInt();
            switch (option)
            {
                case 1:
                {
                    while (true) {
                        System.out.print("Enter student's Id: ");
                        int id = sc.nextInt();

                        System.out.print("Enter student's Marks: ");
                        int marks = sc.nextInt();

                        System.out.print("Enter student's age: ");
                        int age = sc.nextInt();

                        students.add(new Student(id, marks, age));
                        System.out.print("Do you want to add another student? (yes/no): ");
                        String response = sc.next();

                        if (!response.equalsIgnoreCase("yes"))
                        {
                            break;
                        }
                    }
                }
                break;
                case 2:
                {
                    System.out.println("Enter the student ID you want Remove: ");
                    int studentID = sc.nextInt();
                    serv.removeStudentById(students, studentID);
                }
                break;
                case 3:
                {
                    System.out.println("Enter the student ID you want fetch: ");
                    int studentID = sc.nextInt();
                    serv.getStudentById(students, studentID);


                }
                break;
                case 4:
                {
                    serv.displayStudents(students);
                }
                break;
                default:
                {
                    System.out.println("Invalid option");
                }
                break;
            }
        }

    }
}

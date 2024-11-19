package SchoolManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

    public static void main(String args[]) {
        ArrayList<Student> astudent = new ArrayList<Student>();
        ArrayList<Teacher> ateacher = new ArrayList<Teacher>();

     /*   Student stu=new Student();
        System.out.println("Enter the student id");
        Scanner sc= new Scanner(System.in);
        int sid= sc.nextInt();
        System.out.println("Enter the student name");
        String sname=sc.next();
        System.out.println("Enter the student age");
        int sage= sc.nextInt();
        System.out.println("Enter the student course");
        String scourse=sc.next();
        System.out.println("Enter the student marks");
        int smarks= sc.nextInt();

        stu.setId(sid);
        stu.setName(sname);
        stu.setAge(sage);
        stu.setCourse(scourse);
        stu.setMarks(smarks);
        stu.displayDetails();
        stu.calculateGrade();

        Teacher tt=new Teacher();
        System.out.println("Enter the Teacher id");
        int tsid= sc.nextInt();
        System.out.println("Enter the Teacher name");
        String tsname=sc.next();
        System.out.println("Enter the Teacher age");
        int tsage= sc.nextInt();
        System.out.println("Enter the Teacher Salary");
        double tsal=sc.nextDouble();
        System.out.println("Enter the Teacher Subject");
        String tsub= sc.next();
        tt.setId(tsid);
        tt.setName(tsname);
        tt.setAge(tsage);
        tt.setSalary(tsal);
        tt.setSubject(tsub);
        tt.displayDetails();
        ateacher.add(tt);*/
            int num;
        do{
            System.out.println("Menu");
            System.out.println("1.addStudent");
            System.out.println("2.addTeacher");
            System.out.println("3.Exit");
            System.out.println("Enter the choice");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();

              switch (num) {
                case 1:
                    System.out.println("Enter the student details\n");
                    Student stu = new Student();
                    System.out.println("Enter the student id");
                    int sid = sc.nextInt();
                    System.out.println("Enter the student name");
                    String sname = sc.next();
                    System.out.println("Enter the student age");
                    int sage = sc.nextInt();
                    System.out.println("Enter the student course");
                    String scourse = sc.next();
                    System.out.println("Enter the student marks");
                    int smarks = sc.nextInt();

                    stu.setId(sid);
                    stu.setName(sname);
                    stu.setAge(sage);
                    stu.setCourse(scourse);
                    stu.setMarks(smarks);
                    stu.displayDetails();
                    stu.calculateGrade();
                    astudent.add(stu);
                    break;
                case 2:
                    System.out.println("Enter the Teacher details\n");
                    Teacher tt = new Teacher();
                    System.out.println("Enter the Teacher id");
                    int tsid = sc.nextInt();
                    System.out.println("Enter the Teacher name");
                    String tsname = sc.next();
                    System.out.println("Enter the Teacher age");
                    int tsage = sc.nextInt();
                    System.out.println("Enter the Teacher Salary");
                    double tsal = sc.nextDouble();
                    System.out.println("Enter the Teacher Subject");
                    String tsub = sc.next();
                    tt.setId(tsid);
                    tt.setName(tsname);
                    tt.setAge(tsage);
                    tt.setSalary(tsal);
                    tt.setSubject(tsub);
                    tt.displayDetails();
                    ateacher.add(tt);
                    break;
                case 3:
                    System.out.println("Exit");
                    default:
                      System.out.println("Enter the correct choice");


            }}

            while (num > 3) ;
    }}

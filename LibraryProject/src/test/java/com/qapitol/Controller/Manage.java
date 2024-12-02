package com.qapitol.Controller;

import com.qapitol.Model.Books;
import com.qapitol.Model.Students;
import com.qapitol.Service.ServiceImplementation;

import java.io.IOException;
import java.util.*;

public class Manage {

    public static void main(String args[]) throws IOException {
        List<Students> students = new ArrayList<>();
        List<Books> books = new ArrayList<>();
       // Students stu = new Students();
       // Books bk = new Books();
        ServiceImplementation si = new ServiceImplementation();
        int rr;
        int choice;
        int choice1;

        do {
            System.out.println("Menu");
            System.out.println("1.Student");
            System.out.println("2.Book");
            System.out.println("3.Exit");
            Scanner sc = new Scanner(System.in);
            rr = sc.nextInt();

            switch (rr) {
                case 1:
                    do {
                        System.out.println("Menu");
                        System.out.println("1.addStudent");
                        System.out.println("2.DisplayStudent");
                        System.out.println("3.Update");
                        System.out.println("4.Delete");
                       // System.out.println("5.Get Student by id");
                        System.out.println("5.Exit");
                        System.out.println("Enter the choice");
                        choice = sc.nextInt();
                        switch (choice) {
                            case 1:
                                si.addStudent();
                                break;
                            case 2:
                                si.displayStudent();
                                break;
                            case 3:
                                si.updateStudent();
                                break;
                            case 4:
                                si.deleteStudent();
                                break;

                            case 5:
                                System.out.println("Exit");
                                break;
                            default:
                                System.out.println("Enter the correct choice");

                        }
                    }
                    while (choice != 5);
                    break;

                case 2:

                    do {
                        System.out.println("Menu");
                        System.out.println("1.AddBook");
                        System.out.println("2.DisplayBook");
                        System.out.println("3.Update");
                        System.out.println("4.Delete");
                        System.out.println("5.Borrow");
                        System.out.println("6.Exit");
                        System.out.println("Enter the choice");
                        choice1 = sc.nextInt();
                        switch (choice1) {
                            case 1:
                                si.addBook();
                                break;
                            case 2:
                                si.displayBook();
                                break;
                            case 3:
                                si.updateBook();
                            case 4:
                                si.deleteBook();
                                break;
                            case 5:
                                si.borrowBook();

                            case 6:
                                System.out.println("Exit");
                                break;
                            default:
                                System.out.println("Enter the correct choice");

                        }
                    }
                    while (choice1 != 4);
                    break;

                case 3:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Enter the correct choice");
            }

        } while (rr != 2);


    }


}
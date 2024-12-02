package com.qapitol.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qapitol.Model.Books;
import com.qapitol.Model.Students;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceImplementation implements service {
    ObjectMapper objectMapper;
    List<Students> students = new ArrayList<>();
    List<Books> books = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    Books book =new Books();
    Students  stu;


    @Override
    public void addStudent() throws IOException {
        stu=new Students();
        System.out.println("Enter the student id");
        int sid = sc.nextInt();
        System.out.println("Enter the student name");
        String sname = sc.next();
        System.out.println("Enter the student age");
        int sage = sc.nextInt();
        System.out.println("Enter the student Address");
        String sadd = sc.next();
        stu.setId(sid);
        stu.setAge(sage);
        stu.setAddress(sadd);
        stu.setName(sname);
        students.add(stu);
        File fil=new File("C:\\New prog\\LibraryProject\\src\\test\\java\\com\\qapitol\\Utility\\Student.json");
        objectMapper=new ObjectMapper();
        students= objectMapper.readValue(fil, new TypeReference<List<Students>>() {
        });


        //  lst.add(stu);
        //objectMapper.writeValue(fil,students);
        students.add(stu);

        System.out.println("Data saved to person.json");

        objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("C:\\New prog\\LibraryProject\\src\\test\\java\\com\\qapitol\\Utility\\Student.json"), students);
      }

    @Override
    public void deleteStudent() throws IOException {
        //Students stu = new Students();

        System.out.println("Enter the id");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        students.removeIf(stu->stu.getId()==num);

            System.out.println("\nDeleted");
        File fil=new File("C:\\New prog\\LibraryProject\\src\\test\\java\\com\\qapitol\\Utility\\Student.json");

        ObjectMapper objectMapper = new ObjectMapper();

        // Write the object to a JSON file

        System.out.println("Data saved to person.json");
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(fil, students);

    }
    @Override
    public void updateStudent() throws IOException {
        File fil=new File("C:\\New prog\\LibraryProject\\src\\test\\java\\com\\qapitol\\Utility\\Student.json");

        ObjectMapper objectMapper = new ObjectMapper();
        students = objectMapper.readValue(fil, objectMapper.getTypeFactory().constructCollectionType(List.class, Students.class));


        System.out.println("Enter the student id");
        int iid = sc.nextInt();

        for (Students stu : students) {
            Scanner sc = new Scanner(System.in);
            if (stu.getId() == iid)
            {
                    System.out.println("Which field do you to update");
                    System.out.println("1 age");
                    System.out.println("2 name");
                    System.out.println("3 Address");
                    int ch = 0;
                   ch= sc.nextInt();
                    switch (ch) {
                        case 1:
                            int ssage = sc.nextInt();
                            stu.setAge(ssage);
                            break;
                        case 2:
                            String mane = sc.next();
                            stu.setName(mane);
                            break;
                        case 3:
                            String add = sc.next();
                            stu.setAddress(add);
                            break;
                        case 4:
                            System.out.println("Exit");
                            break;
                        default:
                            System.out.println("Enter the correct choice");

                    }

                System.out.println("Updated");
                    }}

        // Write the object to a JSON file

        System.out.println("Data saved to person.json");
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(fil, students);



    }

    @Override
    public void displayStudent() throws IOException {
        System.out.println("\nStudents");
        File fil=new File("C:\\New prog\\LibraryProject\\src\\test\\java\\com\\qapitol\\Utility\\Student.json");

        ObjectMapper objectMapper = new ObjectMapper();

        students = objectMapper.readValue(fil, objectMapper.getTypeFactory().constructCollectionType(List.class, Students.class));

        for (Students stu :students) {
            System.out.println(stu);

        }

      }



    @Override
        public void addBook() throws IOException {
        System.out.println("Enter the book id");
        int bid=sc.nextInt();
        System.out.println("Enter the book Subject");
        String sub=sc.next();
        System.out.println("Enter the book count");
        int count=sc.nextInt();
        book.setBid(bid);
        book.setBcount(count);
        book.setSubject(sub);
        books.add(book);
         File file=new File("C:\\New prog\\LibraryProject\\src\\test\\java\\com\\qapitol\\Utility\\Books.json");
        objectMapper  = new ObjectMapper();

      //  List<Books> listbookdet;

        //books.add(book);
       objectMapper.writerWithDefaultPrettyPrinter().writeValue(file, books);
        System.out.println("Data saved to person.json");
        books= objectMapper.readValue(file, new TypeReference<List<Books>>() {

        });


    }

    public  Students getStudById() throws IOException {

        File fil = new File("C:\\New prog\\LibraryProject\\src\\test\\java\\com\\qapitol\\Utility\\Student.json");
        objectMapper = new ObjectMapper();
        students = objectMapper.readValue(fil, new TypeReference<List<Students>>() {
        });


        System.out.println("Enter the id");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //Students =new Students();
        for (Students stu : students) {
            if (stu.getId() == num) {
                System.out.println(stu);
               }
            }
       // return num;
        return stu;

    }

        @Override
        public void deleteBook() throws IOException {
            System.out.println("Enter the id");
            Scanner sc=new Scanner(System.in);
            int num=sc.nextInt();
            books.removeIf(book->book.getBid()==num);

            System.out.println("\nDeleted");
            File fil=new File("C:\\New prog\\LibraryProject\\src\\test\\java\\com\\qapitol\\Utility\\Books.json");

            ObjectMapper objectMapper = new ObjectMapper();

            // Write the object to a JSON file

            System.out.println("Data saved to person.json");
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(fil,books);

        }

        @Override
        public void updateBook () {

        }

        @Override
        public void displayBook () throws IOException {

        File file=new File("C:\\New prog\\LibraryProject\\src\\test\\java\\com\\qapitol\\Utility\\Books.json");

            ObjectMapper objectMapper1 = new ObjectMapper();
            //List<Books> bookdetails;
            books = objectMapper1.readValue(file, objectMapper1.getTypeFactory().constructCollectionType(List.class, Books.class));

            System.out.println("\nBooks");
            for (Books book: books) {
                System.out.println(book);
            }
        }

    @Override
    public void borrowBook() throws IOException {
        Books book =new Books();
        Students  stu=new Students();

        File file=new File("C:\\New prog\\LibraryProject\\src\\test\\java\\com\\qapitol\\Utility\\Books.json");
      File file1=new File("C:\\New prog\\LibraryProject\\src\\test\\java\\com\\qapitol\\Utility\\Student.json");
        ObjectMapper objectMapper1 = new ObjectMapper();
        List<Students> students1=objectMapper1.readValue(file1, new TypeReference<List<Students>>() {
        });
        List<Books> bookdetails;
        try {
            bookdetails = objectMapper1.readValue(file, new TypeReference<List<Books>>() {
            });
        }   catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Enter the id");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //Students =new Students();
        for (Students stu1 : students1) {
            if (stu1.getId() == num) {
                System.out.println(stu1);
                System.out.println("Enter the book you want to borrow");
                int num1=sc.nextInt();
                for(Books books1: bookdetails){
                    if(books1.getBid()==num1) {
                        System.out.println(books1);
                        books1.addStudent(stu1);
                        System.out.println(stu1);

                        books1.addStudent(stu1);
                        System.out.println(books1);





                    }

                }
        }



        }
        
    }
}

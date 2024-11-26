package service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import model.Student;
import model.Teacher;

import java.io.File;
import java.io.IOException;
import java.util.List;

    public class ServiceImplementation implements ServiceInterface {

        @Override
        public void displayTeachers(List<Teacher> teachers) {
            System.out.println("\nTeachers:");
            for (Teacher teacher : teachers) {
                System.out.println("Name: " + teacher.getName() + ", Subject: " + teacher.getSubject() + ", Salary: " + teacher.getSalary());

                ObjectMapper objectMapper = new ObjectMapper();
                ObjectMapper map=new ObjectMapper(new YAMLFactory());
                try {
                    objectMapper.writeValue(new File("teacher.json"), teachers);
                    System.out.println("Data saved to person.json");
                    objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("teacher.json"), teachers);
                    map.writeValue(new File("teacheryaml.json"), teachers);
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        }

        @Override
        public void displayStudents(List<Student> students) {
            System.out.println("\nStudents:");
            for (Student student : students) {
                System.out.println("ID: " + student.getId() + ", Marks: " + student.getMarks() + ", Age: " + student.getAge());
                ObjectMapper objectMapper = new ObjectMapper();
                ObjectMapper map=new ObjectMapper(new YAMLFactory());
                try {

                    objectMapper.writeValue(new File("Stu.json"), students);

                    map.writeValue(new File("studentyaml.yaml"), students);

                    System.out.println("Data saved to person.json");

                    objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("Stu.json"), students);

                } catch (IOException e) {
                    e.printStackTrace();
                }




            }
        }

        @Override
        public void modifyTeacher(List<Teacher> teachers, int index, String newName, String newSubject, double newSalary) {
            if (index >= 0 && index < teachers.size()) {
                Teacher modifiedTeacher = new Teacher(newName, newSubject, newSalary) {

                };
                teachers.set(index, modifiedTeacher);
                System.out.println("Teacher details updated successfully.");
            } else {
                System.out.println("Invalid index for teacher modification.");
            }
        }

        @Override
        public void modifyStudent(List<Student> students, int index, int newId, int newMarks, int newAge) {
            if (index >= 0 && index < students.size()) {
                Student modifiedStudent = new Student(newId, newMarks, newAge) {
                };
                students.set(index, modifiedStudent);
                System.out.println("Student details updated successfully.");
            } else {
                System.out.println("Invalid index for student modification.");
            }
        }

        public void removeStudentById(List<Student> students, int id) {
            students.removeIf(student -> student.getId() == id);
            System.out.println("Successfully Removed student "+id);
            System.out.println("to check please select 7");
        }

        public void getStudentById(List<Student> students, int id) throws IOException {
            for (Student student : students) {
                if (student.getId() == id) {
                    System.out.println("ID: " + student.getId() + ", Marks: " + student.getMarks() + ", Age: " + student.getAge());

                }
            }
        }

        public void removeTeacherByName(List<Teacher> teachers, String name) {
            teachers.removeIf(teacher -> teacher.getName().equals(name));
            System.out.println("Successfully Removed teacher Details "+name);
            System.out.println("to check please select 8");
        }

        public void getTeacherByName(List<Teacher> teachers, String name) {
            for (Teacher teacher : teachers) {
                if (teacher.getName().equals(name)) {
                    System.out.println("Name: " + teacher.getName() + ", Subject: " + teacher.getSubject() + ", Salary: " + teacher.getSalary());

                }

            }}}
package service;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.Student;

import java.io.File;
import java.io.IOException;
import java.util.List;

    public class ServiceImplementation implements ServiceInterface {

        @Override
        public void displayStudents(List<Student> students) {
            System.out.println("\nStudents:");
            for (Student student : students) {
                System.out.println("ID: " + student.getId() + ", Marks: " + student.getMarks() + ", Age: " + student.getAge());
                ObjectMapper objectMapper = new ObjectMapper();

                // Write the object to a JSON file
                try {
                    objectMapper.writeValue(new File("student.json"), students);
                    System.out.println("Data saved to person.json");
                } catch (IOException e) {
                    e.printStackTrace();
                }

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

        public void getStudentById(List<Student> students, int id) {
            for (Student student : students) {
                if (student.getId() == id) {
                    System.out.println("ID: " + student.getId() + ", Marks: " + student.getMarks() + ", Age: " + student.getAge());
                }
            }
        }


}

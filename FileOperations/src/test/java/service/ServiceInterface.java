package service;

import model.Student;

import java.util.List;

public interface ServiceInterface {
    void displayStudents(List<Student> students);
    void modifyStudent(List<Student> students, int index, int newId, int newMarks, int newAge);
    void removeStudentById(List<Student> students, int id);
    void getStudentById(List<Student> students, int id);


}

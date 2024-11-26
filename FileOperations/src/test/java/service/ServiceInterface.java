package service;

import model.Student;
import model.Teacher;

import java.io.IOException;
import java.util.List;

public interface ServiceInterface {
    void displayTeachers(List<Teacher> teachers);
    void displayStudents(List<Student> students);
    void modifyTeacher(List<Teacher> teachers, int index, String newName, String newSubject, double newSalary);
    void modifyStudent(List<Student> students, int index, int newId, int newMarks, int newAge);
    void removeStudentById(List<Student> students, int id);
    void getStudentById(List<Student> students, int id) throws IOException;
    void removeTeacherByName(List<Teacher> teachers,String name);
    void getTeacherByName(List<Teacher> teachers,String name);


}

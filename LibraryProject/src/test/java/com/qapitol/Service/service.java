package com.qapitol.Service;

import com.qapitol.Model.Students;

import java.io.IOException;
import java.util.List;

public interface service {
   void  addStudent() throws IOException;
   void deleteStudent() throws IOException;
   void updateStudent() throws IOException;
   void  displayStudent() throws IOException;


    void  addBook() throws IOException;
    void deleteBook() throws IOException;
    void updateBook();
    void  displayBook() throws IOException;
    void borrowBook() throws IOException;
  //  void getStudById() throws IOException;





}

package com.qapitol.fileoperations;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class JsonExample {

    public static class Person {
        public String name;
        public int age;

        // Constructor
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        // Create a sample object
        Person person = new Person("John Doe", 30);

        // Create an ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        // Write the object to a JSON file
        try {
            objectMapper.writeValue(new File("person.json"), person);
            System.out.println("Data saved to person.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

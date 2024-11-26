package com.qapitol.fileoperations;

    import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;

    public class YamlFile  {

        public static void main(String[] args) throws IOException {
            // Define the file path of the YAML file
            Person person=new Person();
            person.setAge(12);
            person.setId(13);
            person.setAddress("Shrinagar");
            person.setSub("CS");

            // Create ObjectMapper instance for YAML
            ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

           mapper.writeValue(new File("Yam.yaml"), person);
                // Deserialize YAML into a Java object
           /* Person str = mapper.readValue(new File("Yam.yaml"), Person.class);

               // Output the Java object
            System.out.println(str.getAge());
            System.out.println(str.getId());
            System.out.println(str.getAddress());
            System.out.println(str.getSub());*/




        }
    }



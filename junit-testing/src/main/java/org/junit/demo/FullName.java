package org.junit.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

public class FullName {

    private static final Logger logger = LoggerFactory.getLogger(FullName.class);

    public static void main(String[] args) {

        FullName fullName = new FullName();
        String personName = fullName.getFullName("John", "Doe");
        System.out.println(personName); //John Doe
    }

    public String getFullName(String firstName, String lastName){
        if(firstName == null || firstName.isEmpty()){
            firstName = "";
        }
        if(lastName == null){
            lastName = "";
        }

//        System.out.println(firstName);
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warning message");
        logger.error("This is an error message");

//        logging.level.root=INFO
//
//        logging.level.org.springframework.web=WARN


        return firstName.concat(lastName);
    }
}

package com.batch.demo;

import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {

    @Override
    public Person process(Person person) throws Exception {

        String processedFirstName = person.firstName().toUpperCase();
        String processedLastName = person.lastName().toUpperCase();

        System.out.println("Transformed Person : " + processedFirstName + " " + processedLastName);
        return new Person(processedFirstName, processedLastName);
    }
}

package com.advanced;

public record PersonRecord(int id, String name) {
    //Built in parameterized constructor, toString, built in hash code and equals, getters

    public static String ADDRESS = "India"; //static variable

    //static method
    public static PersonRecord unNamed(int id, String address){
        return new PersonRecord(id, ADDRESS);
    }

    public static void main(String[] args) {
        PersonRecord record = new PersonRecord(12, "John");
        PersonRecord record1 = new PersonRecord(14, "Peter");
        PersonRecord record2 = new PersonRecord(12, "John");


        System.out.println(record.id() + " " + record.name());
        System.out.println(record1);
        System.out.println(record.hashCode());
        System.out.println(record1.hashCode());
        System.out.println(record2.hashCode());

        System.out.println(PersonRecord.ADDRESS);
        System.out.println(PersonRecord.unNamed(45, "Chennai"));
    }
}

//
//class PersonRecordTest {
//
//    public static void main(String[] args) {
//        PersonRecord record = new PersonRecord(12, "John");
//        PersonRecord record1 = new PersonRecord(14, "Peter");
//        PersonRecord record2 = new PersonRecord(12, "John");
//
//
//        System.out.println(record.id() + " " + record.name());
//        System.out.println(record1);
//        System.out.println(record.hashCode());
//        System.out.println(record1.hashCode());
//        System.out.println(record2.hashCode());
//
//        System.out.println(PersonRecord.ADDRESS);
//        System.out.println(PersonRecord.unNamed(45, "Chennai"));
//    }
//}
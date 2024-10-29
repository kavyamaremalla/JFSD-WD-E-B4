package com.demo;

final class ImmutablePerson {

    private final String name;

    private final int age;

    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "ImmutablePerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class TestImmutablePerson {
    public static void main(String[] args) {
        ImmutablePerson person = new ImmutablePerson("Peter", 20);
        System.out.println(person.getAge());
        System.out.println(person.getName());
    }
}

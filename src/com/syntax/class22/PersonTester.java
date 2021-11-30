package com.syntax.class22;

public class PersonTester {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Amran");
        teacher.eat();
        Person[] persons = {new Student("Alex"), new Employee("nayma"), new Teacher("Asel")};
        for (Person persons2 : persons) {
            persons2.performDailyTasks();

            if( persons2 instanceof Teacher){
                ((Teacher)persons2).designClasses();
            }

        }
    }
}
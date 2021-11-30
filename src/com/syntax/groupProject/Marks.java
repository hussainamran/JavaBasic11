package com.syntax.groupProject;

abstract class Marks {
    /*
    We have to calculate the average of marks obtained in three subjects by student A and by student B.
    Create class 'Marks' with an abstract method 'getPercentage' that will be returning the average percentage of marks.
    Provide implementation of abstract method in classes 'A' and 'B'. The constructor of student A takes the marks
    in three subjects as its parameters and the marks in four subjects as its parameters for student B. Test your code
     */

    abstract void getPercentage();
}

class A extends Marks {
    double marks1;
    double marks2;
    double marks3;

    A(double marks1, double marks2, double marks3) {
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public void getPercentage() {
        System.out.println("The student A marks is: " + ((marks1 + marks2 + marks3) / 300) * 100);
    }
}

class B extends A{

    double marks4;
    B(double marks1,double marks2, double marks3, double marks4) {
       super(marks1,marks2,marks3);
        this.marks4=marks4;
    }
    public void getPercentage() {
        System.out.println("The student B marks is: "+((marks1+marks2+marks3+marks4)/400)*100);

    }

}
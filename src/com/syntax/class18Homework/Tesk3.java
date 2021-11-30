package com.syntax.class18Homework;

public class Tesk3 {
     /*
   Write a Java program called Teacher.  Identify features and behaviour of that Class.
   Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it
   their own features and behaviour. Test all 4 classes
     */
     public static void main(String[] args) {
         MathTeacher mathTeacher=new MathTeacher();
         mathTeacher.name="Demir";
         mathTeacher.techMath();

         ChemistryTeacher chemistryTeacher=new ChemistryTeacher();
         chemistryTeacher.name="Demir";
         chemistryTeacher.techChemistry();

     }
}
class Teacher {
    String name;
    void tech (){
        System.out.println(name+"Teaches subject");
    }
}
class MathTeacher extends Teacher{
    void techMath(){
        System.out.println(name+" Teaches math");
    }

}
class ChemistryTeacher extends Teacher{
    void techChemistry(){
        System.out.println(name+" Teaches chemistry");
    }
}
class PianoTeacher extends Teacher{
    void techPiano(){
        System.out.println(name+"Teaches piano");
    }
}
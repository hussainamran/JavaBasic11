package com.syntax.reviewclass2;

public class Hospital {
    public static void main(String[] args) {
         Doctor doctor1=new Doctor("John","Smith","Dentist",20000);
        Doctor.hospital="Inova";
        doctor1.printInfo();
        doctor1.work();


        Doctor doctor2=new Doctor("Jane","Doe","Cardiologyst");

        doctor2.speciality="Cardiologyes";
        doctor2.lastName="Baond";
        doctor2.work();

        // change will affect all class
        doctor2.hospital=" JW Hospital";

        System.out.println();
        doctor2.work();
        doctor2.work();
        System.out.println(doctor1.lastName);
        System.out.println(doctor2.lastName);

        doctor1.treatPatient("james");
        doctor2.treatPatient("Amran");

    }
}

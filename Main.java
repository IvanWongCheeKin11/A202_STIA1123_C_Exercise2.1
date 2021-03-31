package com.cheekin;

public class Main {

    public static void main(String[] args) {

        Triangle Equilateral = new Triangle();

        Equilateral.Name = "Equilateral";
        Equilateral.InternalAngel = "3 same internal angles";
        Equilateral.Lenght = "3 equal length";
        System.out.println("Object 1: " + Equilateral.Name + "\n" + "Internal angel: " + Equilateral.InternalAngel + "\n" + "Lenght: " + Equilateral.Lenght);
        Equilateral.Behavior();
        System.out.println();


        Triangle Isosceles = new Triangle();

        Isosceles.Name = "Isosceles";
        Isosceles.InternalAngel = "2 same internal angles";
        Isosceles.Lenght = "2 equal length";
        System.out.println("Object 2: " + Isosceles.Name + "\n" + "Internal angel: " + Isosceles.InternalAngel + "\n" + "Lenght: " + Isosceles.Lenght);
        Isosceles.Behavior();
        System.out.println();


        Triangle Scalene = new Triangle();

        Scalene.Name = "Scalene";
        Scalene.InternalAngel = "3 different internal angles";
        Scalene.Lenght = "3 unequal length";
        System.out.println("Object 3: " + Scalene.Name + "\n" + "Internal angel: " + Scalene.InternalAngel + "\n" + "Lenght: " + Scalene.Lenght);
        Scalene.Behavior();
    }
}

package lt.bit.oop_project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Hello.");
        System.out.println("Enter 1 to Login or 2 to Sign Up: "); //TODO Login
        int signUp = input.next().charAt(0);
        if (signUp == 2){ //TODO redo in Switch when other options are done
            registrator();
        }

        Person Bob = new Person(1,"Bob",180,200);
        System.out.println(Bob.countBMI());
    }

    private static void registrator() {
        /*
        * Build Person object:
        * ask for:
        * name
        * height
        * weight
        * call bmi counter
        * export to .txt*/

    }
}

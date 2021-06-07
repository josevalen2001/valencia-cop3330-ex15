package base;
import java.util.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jose Valencia
 */

public class app {

    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);

        //Input
        System.out.print("What is the password? ");
        String input = newScan.nextLine();

        //Comparison and Output
        if(input.equals("abc$123"))
            System.out.println("Welcome!");
        else
            System.out.println("I don't know you.");

    }

}

package com.facilio;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner1=new Scanner(System.in);
        System.out.println("enter your first name");
        String firstname=scanner1.nextLine();
        System.out.println("enter your last name");
        String lastname= scanner1.nextLine();
        System.out.println("your full name is:"+ firstname+" "+lastname);

    }
}
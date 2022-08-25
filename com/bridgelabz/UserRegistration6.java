package com.bridgelabz;
import java.util.regex.Pattern;
import java.util.Scanner;
public class UserRegistration6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password : ");
        String password = scanner.next();
        System.out.println(Pattern.matches("^(?=.*[A-Z]).{8,}$", password));
    }
}


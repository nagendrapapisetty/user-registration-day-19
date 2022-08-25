package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Pattern;
public class UserRegistration5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password : ");
        String password = scanner.next();
        System.out.println(Pattern.matches("^[a-zA-Z0-9].{7,}$", password));
    }
}


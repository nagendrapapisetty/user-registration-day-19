package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Pattern;
public class UserRegistration4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mobile no. : ");
        String phNum = scanner.nextLine();
        System.out.println(Pattern.matches("[0-9]{2}[\\s][0-9]{10}", phNum));
    }
}

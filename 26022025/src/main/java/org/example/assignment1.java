package org.example;

import java.util.Scanner;

public class assignment1 {
    public static String determineCollege(int rank, double cgpa) {
        if (rank <= 1000 && cgpa >= 9.0) {
            return "IIT or NIT";
        } else if (rank <= 5000 && cgpa >= 8.5) {
            return "Top Government College";
        } else if (rank <= 10000 && cgpa >= 8.0) {
            return "State University";
        } else if (rank <= 20000 && cgpa >= 7.5) {
            return "Private University";
        } else {
            return "Local College";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.print("Enter Entrance Test Rank: ");
        int rank = sc.nextInt();

        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();

        // Determining college
        String college = determineCollege(rank, cgpa);

        // Displaying the result
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Rank: " + rank);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Eligible College: " + college);

        sc.close();
    }
}

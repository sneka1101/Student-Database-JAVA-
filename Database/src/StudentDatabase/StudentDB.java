package StudentDatabase;

import java.util.Scanner;

public class StudentDB {

    public static void main(String[] args) {
        // Ask how many students need to be enrolled
        System.out.println("Enter number of students to be enrolled: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        // Create and enroll each student
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("\n--- Enrolling Student " + (i + 1) + " ---");
            students[i] = new Student(); // Create a new Student object

            students[i].enroll(); // Call enroll on the individual student
            students[i].payTutition(); // Call payTuition on the individual student

            System.out.println(students[i].toString()); // Print student info
        }
    }
}








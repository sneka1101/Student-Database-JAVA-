package StudentDatabase;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costPerCourse = 600;
    private static int id = 1000;
    //prompt to enter name and year

    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter FirstName ");
        this.firstName = in.nextLine();

        System.out.println("Enter LastName ");
        this.lastName = in.nextLine();

        setStudentID();

        System.out.println("1.Freshman\n 2.Sophmere\n 3.Junior\n 4.Senior\n ");
        this.gradeYear = in.nextInt();
        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
    }

    //generate ID
    private void setStudentID() {
        // Grade level + ID
        id++;
        this.studentID = gradeYear + " " + id;
    }


    //enroll in courses

    public void enroll() {
        //giving in loop
        do {
            System.out.println("Enter the courses to enroll (Q to exit)");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (course.equalsIgnoreCase("Q")) {
                break;
            } else {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costPerCourse;
            }
        } while (true);
        System.out.println("ENROLLD IN" + courses);
        System.out.println("TUTION BALANCE" + tuitionBalance);


    }

// view balance

    public void viewBalance(){

        System.out.println("Your balance is " + tuitionBalance);
    }
    //pay tution

    public void payTutition( )
    {
        System.out.println("enter your amount");
        Scanner in = new Scanner((System.in));
        int payment = in.nextInt();
        tuitionBalance=tuitionBalance-payment;
        System.out.println("Thank you for your payment" + payment);
        viewBalance();
    }

    //show status

    public String toString(){
        return "Name"  + firstName + " "+ lastName +
                "\nCoursesEnrolled" + courses +
                "\nBalance" + tuitionBalance;


    }
}

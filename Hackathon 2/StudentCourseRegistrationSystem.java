import java.util.Scanner;

public class StudentCourseRegistrationSystem {
    private String studentName;
    private int rollNumber;
    private int marks;
    private String courseName;
    private int courseCredits;

    public StudentCourseRegistrationSystem(String studentName, int rollNumber, int marks, String courseName, int courseCredits) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }

    public double calculateFee() {
        return courseCredits * 1500;
    }

    public boolean checkEligibility() {
        return marks >= 50;
    }

    public double calculateScholarship() {
        if (marks >= 85) {
            return calculateFee() * 0.20;
        } else if (marks >= 70) {
            return calculateFee() * 0.10;
        } else {
            return 0;
        }
    }

    public double calculateFinalFee() {
        return calculateFee() - calculateScholarship();
    }

    public void displayDetails() {
        System.out.println("\nStudent Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Course: " + courseName);
        System.out.println("Credits: " + courseCredits);
        System.out.println("Eligible: Yes");
        System.out.println("Fee: Rs. " + calculateFee());
        System.out.println("Scholarship: Rs. " + calculateScholarship());
        System.out.println("Final Fee: Rs. " + calculateFinalFee());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter course name: ");
        String course = sc.nextLine();
        System.out.print("Enter course credits: ");
        int credits = sc.nextInt();

        StudentCourseRegistrationSystem s = new StudentCourseRegistrationSystem(name, roll, marks, course, credits);

        if (s.checkEligibility()) {
            s.displayDetails();
        } else {
            System.out.println("Not eligible for registration.");
        }

        sc.close();
    }
}

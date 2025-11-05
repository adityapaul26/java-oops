import java.util.ArrayList;
import java.util.Scanner;

interface Department{
    String deptName = "", deptHead = "";
    void displayAttributes();
}

class Hostel{
    String hostelName,hostelLocation;
    int numberOfRooms;

    Hostel(String hostelName, String hostelLocation,int numberOfRooms ){
        this.hostelName = hostelName;
        this.hostelLocation= hostelLocation;
        this.numberOfRooms = numberOfRooms;
    }

    void displayHostelAttributes(){
        System.out.println("Hostel name :"+ hostelName);
        System.out.println("Hostel location :"+ hostelLocation);
        System.out.println("Number of rooms :"+ numberOfRooms);
    }
}

class Student extends Hostel implements Department{
    String studentName, electiveSubject;
    long regNo;
    double avgMarks;

    Student(String hostelName, String hostelLocation, int numberOfRooms,String studentName, String electiveSubject,long regNo, double avgMarks ) {
        super(hostelName, hostelLocation, numberOfRooms);
        this.studentName = studentName;
        this.electiveSubject = electiveSubject;
        this.regNo= regNo;
        this.avgMarks = avgMarks;
    }

    public void displayAttributes(){
        super.displayHostelAttributes();
        System.out.println("Student name :"+ studentName);
        System.out.println("Elective subject :"+ electiveSubject);
        System.out.println("Average marks :"+ avgMarks);
        System.out.println("Registration number :"+ regNo);
    }
}

public class DepartmentMain {
    static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Student> stdDB = new ArrayList<>();
        int choice;
        long regNo;

        do {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Admit New Student");
            System.out.println("2. Migrate a Student");
            System.out.println("3. Display Student Details by Registration Number");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // To consume the leftover newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Hostel Name: ");
                    String hostelName = sc.nextLine();

                    System.out.print("Enter Hostel Location: ");
                    String hostelLocation = sc.nextLine();

                    System.out.print("Enter Number of Rooms: ");
                    int numberOfRooms = sc.nextInt();
                    sc.nextLine();  // consume leftover newline

                    System.out.print("Enter Student Name: ");
                    String studentName = sc.nextLine();

                    System.out.print("Enter Elective Subject: ");
                    String electiveSubject = sc.nextLine();

                    System.out.print("Enter Registration Number: ");
                    regNo = sc.nextLong();
                    sc.nextLine(); // consume leftover newline

                    System.out.print("Enter Average Marks: ");
                    double avgMarks = sc.nextDouble();
                    sc.nextLine(); // optional, only if more string inputs will follow


                    stdDB.add(new Student(hostelName, hostelLocation, numberOfRooms, studentName, electiveSubject, regNo, avgMarks));
                    System.out.println("The admitted student details are :");
                    stdDB.getLast().displayAttributes();
                    System.out.println("Admit New Student Selected.");
                    break;

                case 2:
                    // Logic to migrate a student
                    System.out.print("Enter new Registration Number: ");
                    long regNonew = sc.nextLong();

                    System.out.print("Enter new Hostel Name: ");
                    String hostelNamenew = sc.nextLine();

                    System.out.print("Enter new Hostel Location: ");
                    String hostelLocationnew = sc.nextLine();

                    System.out.print("Enter new Number of Rooms: ");
                    int numberOfRoomsnew = sc.nextInt();
                    sc.nextLine();  // Consume newline

                    System.out.print("Enter old Registration Number: ");
                    regNo = sc.nextLong();

                    for (Student student : stdDB)
                        if (student.regNo == regNo) {
                            student.displayAttributes();

                            student.regNo = regNonew;
                            student.hostelName = hostelLocationnew;
                            student.hostelLocation = hostelLocationnew;
                            student.numberOfRooms = numberOfRoomsnew;
                        }
                    System.out.println("Migrate Student Selected and details are updated.");
                    break;

                case 3:
                    // Logic to display student details
                    System.out.print("Enter Registration Number: ");
                    regNo = sc.nextLong();
                    System.out.println("Display details for Reg No: " + regNo);
                    for (Student student : stdDB)
                        if (student.regNo == regNo)
                            student.displayAttributes();
                    break;

                case 4:
                    System.out.println("Exiting Program...");
                    sc.close();
                    System.exit(1);
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (true);
    }
}
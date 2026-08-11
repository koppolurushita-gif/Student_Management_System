package com.studentmanagement;
import java.util.Scanner;



public class Main {
	


	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        StudentService service = new StudentService();

	        while (true) {

	            System.out.println();
	            System.out.println("===== STUDENT MANAGEMENT SYSTEM =====");
	            System.out.println("1. Add Student");
	            System.out.println("2. View All Students");
	            System.out.println("3. Search Student");
	            System.out.println("4. Update Student");
	            System.out.println("5. Delete Student");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice: ");

	            int choice;

	            try {
	                choice = Integer.parseInt(sc.nextLine());
	            }
	            catch (NumberFormatException e) {
	                System.out.println("Please enter a valid number.");
	                continue;
	            }

	            try {

	                switch (choice) {

	                    case 1:

	                        System.out.print("Enter ID: ");
	                        int id = Integer.parseInt(sc.nextLine());

	                        System.out.print("Enter Name: ");
	                        String name = sc.nextLine();

	                        System.out.print("Enter Age: ");
	                        int age = Integer.parseInt(sc.nextLine());

	                        System.out.print("Enter Course: ");
	                        String course = sc.nextLine();

	                        System.out.print("Enter Email: ");
	                        String email = sc.nextLine();

	                        Student student = new Student(
	                                id,
	                                name,
	                                age,
	                                course,
	                                email
	                        );

	                        service.addStudent(student);

	                        break;


	                    case 2:

	                        service.viewAllStudents();

	                        break;


	                    case 3:

	                        System.out.print("Enter Student ID: ");

	                        int searchId =
	                                Integer.parseInt(sc.nextLine());

	                        Student foundStudent =
	                                service.findStudentById(searchId);

	                        System.out.println("Student Found:");
	                        System.out.println(foundStudent);

	                        break;


	                    case 4:

	                        System.out.print("Enter Student ID: ");

	                        int updateId =
	                                Integer.parseInt(sc.nextLine());

	                        System.out.print("Enter New Name: ");
	                        String newName = sc.nextLine();

	                        System.out.print("Enter New Age: ");
	                        int newAge =
	                                Integer.parseInt(sc.nextLine());

	                        System.out.print("Enter New Course: ");
	                        String newCourse = sc.nextLine();

	                        System.out.print("Enter New Email: ");
	                        String newEmail = sc.nextLine();

	                        service.updateStudent(
	                                updateId,
	                                newName,
	                                newAge,
	                                newCourse,
	                                newEmail
	                        );

	                        break;


	                    case 5:

	                        System.out.print("Enter Student ID: ");

	                        int deleteId =
	                                Integer.parseInt(sc.nextLine());

	                        service.deleteStudent(deleteId);

	                        break;


	                    case 6:

	                        System.out.println(
	                                "Thank you for using Student Management System."
	                        );

	                        sc.close();

	                        return;


	                    default:

	                        System.out.println(
	                                "Invalid choice. Please try again."
	                        );
	                }

	            }
	            catch (StudentNotFoundException e) {

	                System.out.println(
	                        "Error: " + e.getMessage()
	                );
	            }
	            catch (NumberFormatException e) {

	                System.out.println(
	                        "Invalid input. Please enter the correct value."
	                );
	            }
	        }
	    }
}
	           

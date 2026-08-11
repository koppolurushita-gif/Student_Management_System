package com.studentmanagement;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
	

	    private List<Student> students = new ArrayList<>();

	    // CREATE
	    public void addStudent(Student student) {
	        students.add(student);
	        System.out.println("Student added successfully.");
	    }

	    // READ
	    public void viewAllStudents() {

	        if (students.isEmpty()) {
	            System.out.println("No students found.");
	            return;
	        }

	        for (Student student : students) {
	            System.out.println(student);
	        }
	    }

	    // SEARCH
	    public Student findStudentById(int id)
	            throws StudentNotFoundException {

	        for (Student student : students) {

	            if (student.getId() == id) {
	                return student;
	            }
	        }

	        throw new StudentNotFoundException(
	                "Student with ID " + id + " not found."
	        );
	    }

	    // UPDATE
	    public void updateStudent(
	            int id,
	            String name,
	            int age,
	            String course,
	            String email)
	            throws StudentNotFoundException {

	        Student student = findStudentById(id);

	        student.setName(name);
	        student.setAge(age);
	        student.setCourse(course);
	        student.setEmail(email);

	        System.out.println("Student updated successfully.");
	    }

	    // DELETE
	    public void deleteStudent(int id)
	            throws StudentNotFoundException {

	        Student student = findStudentById(id);

	        students.remove(student);

	        System.out.println("Student deleted successfully.");
	    }
}
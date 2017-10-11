package main;

import java.util.ArrayList;

public class DriverMain {
	public static void main(String[] args) {
		Student s1 = new Student("Shane", 20, "10/10/1996", 1431);
		Student s2 = new Student("Steven", 22, "10/10/1994", 1123);
		Student s3 = new Student("Autumn", 21, "10/10/1995", 3121);
		Student s4 = new Student("Emma", 20, "10/10/1996", 9089);
		Student s5 = new Student("Katie", 22, "10/10/1994", 1230);
		Student s6 = new Student("George", 23, "10/10/1993", 1010);
		Student s7 = new Student("Kieran", 21, "10/10/1995", 0001);
		Student s8 = new Student("Frank", 26, "10/10/1990", 0010);

		Module MA101 = new Module("Math", "MA101");
		Module MA102 = new Module("Algebra", "MA102");
		Module CT101 = new Module("Programming", "CT101");
		Module CT102 = new Module("Algorithms", "CT102");

		MA101.setStudentList(new ArrayList<Student>());
		MA102.setStudentList(new ArrayList<Student>());
		CT101.setStudentList(new ArrayList<Student>());
		CT102.setStudentList(new ArrayList<Student>());

		CourseProgramme mathProgramme = new CourseProgramme("Mathematics");
		CourseProgramme csProgramme = new CourseProgramme("Computer Science");

		mathProgramme.setModuleList(new ArrayList<Module>());
		csProgramme.setModuleList(new ArrayList<Module>());

		mathProgramme.addModule(MA101);
		mathProgramme.addModule(MA102);
		csProgramme.addModule(CT101);
		csProgramme.addModule(CT102);

		MA101.addStudent(s1);
		MA101.addStudent(s2);
		MA102.addStudent(s3);
		MA102.addStudent(s4);
		CT101.addStudent(s5);
		CT101.addStudent(s6);
		CT102.addStudent(s7);
		CT102.addStudent(s8);

		printResult(mathProgramme);
		printResult(csProgramme);
		
	}

	public static void printResult(CourseProgramme programme){
		System.out.println("Programme: " + programme.getCourseName());
		for (Module module : programme.getModuleList()) {
			System.out.println(" module : " + module.getModuleName());
			for (Student student : module.getStudentList()) {
				System.out.print(" student : ");
				System.out.print(student.getName() + "\n");
			}
		}
		System.out.print("\n");
	}
}

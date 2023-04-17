package practiesforoopsconcept;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {

	Scanner scadd = new Scanner(System.in);
	int stdrollnumber;
	String stdfirstname;
	String stdlastname;
	String stdAddress;
	int stdstandard;
	long stdphonenumber;
	String stddvision;

	ArrayList<StudentEntity> studentlist = new ArrayList<StudentEntity>();

	void addStudentData() {

		System.out.println("Enter Student Roll Number");
		stdrollnumber = scadd.nextInt();

		System.out.println("Enter Student First Name");
		stdfirstname = scadd.next();

		System.out.println("Enter Student Last Name");
		stdlastname = scadd.next();

		System.out.println("Enter Student Address");
		stdAddress = scadd.next();

		System.out.println("Enter Student Standard");
		stdstandard = scadd.nextInt();

		System.out.println("Enter Student Phone Number");
		stdphonenumber = scadd.nextLong();

		System.out.println("Enter Student Divison");
		stddvision = scadd.next();

		studentlist.add(new StudentEntity(stdrollnumber, stdfirstname, stdlastname, stdAddress, stdstandard,
				stdphonenumber, stddvision));

	}

	void viewlistStudent() {

		if (studentlist.isEmpty()) {
			System.out.println("No recored found please enter the data");
		} else {
			for (int i = 0; i < studentlist.size(); i++) {

				System.out.println("Student Roll Number" + " " + studentlist.get(i).getStdrollnumber());
				System.out.println("Studnet First Name" + " " + studentlist.get(i).getStdfirstname());
				System.out.println("Student Last Name" + " " + studentlist.get(i).getStdlastname());
				System.out.println("Student Address" + " " + studentlist.get(i).getStdAddress());
				System.out.println("Studnet Standard" + " " + studentlist.get(i).getStdstandard());
				System.out.println("Studnet Phone Number" + " " + studentlist.get(i).getStdphonenumber());
				System.out.println("Studnet Divison" + " " + studentlist.get(i).getStddvision());

				System.out.println("*****************************************");
			}

		}
	}

}

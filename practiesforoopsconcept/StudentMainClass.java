package practiesforoopsconcept;

import java.util.Scanner;

public class StudentMainClass {

	public static void main(String[] args) {

		Scanner inputeOption = new Scanner(System.in);

		// Create Sutdent class object
		Student student = new Student();

		System.out.println("Option Note : \n 1) Add student data \n 2) View Student data \n 3) Exite ");

		int temp = 0;

		while (temp == 0) {

			System.out.println("Enter the options Number");
			int optionNumber = inputeOption.nextInt();
			switch (optionNumber) {

			case 1:
				student.addStudentData();
				break;
			case 2:
				student.viewlistStudent();
				break;
			case 3:
				temp = 1;
				System.out.println("Thank you for visiting");

			default:
				if (temp != 0) {

					System.out.println("Please Enter the valid options");
				}
			}

		}
	}

}

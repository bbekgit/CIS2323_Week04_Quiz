import java.util.Scanner;

public class Person {
	String firstName, lastName;
	char sex;
	int age;
	Scanner inputDevice = new Scanner(System.in);
	
	private getFirstName(){
		firstName = inputDevice.nextLine();
		System.out.println("Your First Name is : " + firstName);
		return firstName;
	}
	private getLastName(){
		lastName = inputDevice.nextLine();
		System.out.println("Your Last name is: " + lastName);
		return lastName;
	}
		private getSex(){
		sex = inputDevice.nextChar();
		System.out.println("Your sex is: " + sex);
		return sex;
	}
	private getAge(){
		age = inputDevice.nextLine();
		System.out.println("Your age is: " + age);
		return age;
	}
	private static void showInfo(){
		
		System.out.println("Your First Name is: " + firstName);
		System.out.println("Your Last Name is:: " + lastName);
		System.out.println("Your Age is: " + age);
		System.out.println("Your Sex is: " + sex);
	}
}
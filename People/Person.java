import java.util.Scanner;

public class Person {
	String firstName, lastName;
	char sex;
	int age;
	Scanner inputDevice = new Scanner(System.in);
	
	private void getFirstName(){
		
		System.out.println("Your First Name is : " + firstName);
		
	}
	private void getLastName(){
	
		System.out.println("Your Last name is: " + lastName);
		
	}
		private void getSex(){
		
		System.out.println("Your sex is: " + sex);
		
	}
	private void getAge(){
		
		System.out.println("Your age is: " + age);
	
	}
	private static void showInfo(){
		
		System.out.println("Your First Name is: " + firstName);
		System.out.println("Your Last Name is:: " + lastName);
		System.out.println("Your Age is: " + age);
		System.out.println("Your Sex is: " + sex);
	}
}
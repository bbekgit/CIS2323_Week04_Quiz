import java.util.Scanner;

public class MakeAPerson{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String firstName, lastName, sex;
		
		int age;
		
       System.out.print("Please, enter your first name: ");
       firstName = input.nextLine();
	    System.out.print("Please, enter your last name: ");
       lastName = input.nextLine();
	   System.out.print("Please, enter your sex: ");
       sex = input.nextLine();
	    System.out.print("Please, enter your age: ");
       age = input.nextInt();
	    
		
		System.out.println(" I am "+ firstName + " " + lastName + " . \n " + "I am " + age + " years old. " + "I am " + sex + " . ");
		
	}
}
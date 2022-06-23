import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int n1=sc.nextInt();
		System.out.println("Enter second number:");
		int n2=sc.nextInt();
		
		System.out.println("Addition= "+ n1+n2);
		System.out.println("Substraction= "+ (n1 - n2));
		System.out.println("Multiplication= "+n1*n2);
		System.out.println("Division= "+n1/n2);
		
		System.out.println("Percentage= "+(n1+n2/200)*100);
		
	}
}

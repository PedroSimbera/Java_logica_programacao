
import java.util.Scanner;
public class main {

public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
	double num1, num2, num3;
		
	System.out.println("Digite os três números: ");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		num3 = sc.nextDouble();
		
	if (num1<=num2 && num1<=num3) {
		System.out.println("O menor número é: " + num1);}
	
	else if (num2<=num3) {
		System.out.println("O menor número é: " + num2);} 
	
	else {
			System.out.println("O menor número é: " + num3);}
			
		sc.close();

	}

}


import java.util.Scanner;
public class Retangulo_area_diag_peri {
public static void main(String[] args) {


	Scanner sc = new Scanner(System.in);
		
	double base, altura, area, diagonal, perimetro;
		
	System.out.print("Digite a base do retangulo: ");
	base = sc.nextDouble();
	System.out.print("Digite a altura do retangulo: ");
	altura = sc.nextDouble();
	            
	area = base * altura;
	perimetro = 2* (base + altura);
	diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));
			
	System.out.println("A área: " + area + ". O perímetro: " + perimetro + ". A diagonal: " + diagonal);
		
	sc.close();
}
}

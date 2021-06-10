import java.util.Scanner;

public class PseudocodigoEjercicio2{

	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		int numero;
		
		System.out.print("Ingrese un numero entero: ");
		numero = entrada.nextInt();
		
		for(int i = 0; i<numero; i++){
			System.out.println( i + " ");
		}
		
	}
	
	
}

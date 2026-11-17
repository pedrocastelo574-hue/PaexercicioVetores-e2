import java.util.Scanner;

public class exercicioA {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			final int TAM = 10;
			int a[], b[], i;
			a = new int [TAM];
			b = new int [TAM];
			
			for(i=0; i<TAM; i++) {
				System.out.println("Entre com o "+(i+1)+"o número do vetor");
				a[i] = scanner.nextInt();
				b[i] = a[i] * a[i];
			}
			
			System.out.print("\nA = [ ");
			for(i=0; i<TAM; i++) {
				System.out.print(a[i]+" ");
			}
			System.out.print(" ]");
			
			System.out.print("\nB = [ ");
			for(i=0; i<TAM; i++) {
				System.out.print(b[i]+" ");
			}
			System.out.print(" ]");
			
}

}

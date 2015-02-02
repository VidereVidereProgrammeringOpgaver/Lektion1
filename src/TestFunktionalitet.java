import java.util.Scanner;

public class TestFunktionalitet {

	/**
	 * Test the thingy program
	 */
	public static void main(String[] args) {
		IFunktionalitet e = new Funktionalitet();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Klar til at modtage kommando!");
		System.out.println("Kommando modtaget send et cpr nr!");
		while(scanner.hasNext()){
			
			System.out.println(e.getBMI(scanner.next()));
				
			
		}
		scanner.close();
			
		
		
		

	}

}

package tema_curs2;

import java.util.Scanner;

public class exercitii {

	public static void main(String[] args) {
		//problema1
		System.out.println("Problema 1:\n");

		Scanner inputObj = new Scanner(System.in);
		System.out.println("scrie un numar: ");
		int nr1Prob1 = inputObj.nextInt();
		if(nr1Prob1 >= 1 && nr1Prob1 <= 10)
			if(nr1Prob1 > 5)
				System.out.println("ADMIS\n");
			else
				System.out.println("RESPINS\n");
		else
			System.out.println("INVALID\n");
		
		//problema2
		System.out.println("Problema2:\n");
		System.out.println("Scrie un numar: ");
		int nr1Prob2 = inputObj.nextInt();
		switch(nr1Prob2) {
		case 1:
			System.out.println("UNU");
			break;
		case 2:
			System.out.println("DOI");
			break;
		case 3:
			System.out.println("TREI");
			break;
		case 4:
			System.out.println("PATRU");
			break;
		case 5:
			System.out.println("CINCI");
			break;
		default:
			System.out.println("INVALID");
		}
		
	}

}

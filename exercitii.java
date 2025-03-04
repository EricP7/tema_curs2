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

		
	}

}

package tema_curs2;

import java.util.Scanner;

public class exercitii {

	public static void main(String[] args) {
		//problema1
		System.out.println("Problema 1:\n");

		Scanner inputObj = new Scanner(System.in);
		System.out.println("scrie un numar: ");
		int nr1P1 = inputObj.nextInt();
		if(nr1P1 >= 1 && nr1P1 <= 10)
			if(nr1P1 > 5)
				System.out.println("ADMIS\n");
			else
				System.out.println("RESPINS\n");
		else
			System.out.println("INVALID\n");
		
		//problema2
		System.out.println("Problema2:\n");
		System.out.println("Scrie un numar: ");
		int nr1P2 = inputObj.nextInt();
		switch(nr1P2) {
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
		System.out.println("\n");
		
		//problema3
		System.out.println("Problema3\n");
		System.out.println("scrie primul numar: ");
		int nr1P3 = inputObj.nextInt();
		System.out.println("scrie al doilea numar: ");
		int nr2P3 = inputObj.nextInt();
		
		if((nr1P3 + nr2P3) % 2 == 0)
			if(nr1P3 % 2 == 0)
				System.out.println((nr1P3 + nr2P3) / 2);
			else
				System.out.println(nr1P3 * nr2P3);
		else
			System.out.println(nr1P3 + nr2P3);
		
		System.out.println("\n");
		

		//problema4
		System.out.println("Problema4:\n");
		System.out.println("scrie 3 numere: ");
		int nr1P4 = inputObj.nextInt();
		int nr2P4 = inputObj.nextInt();
		int nr3P4 = inputObj.nextInt();
		if((nr1P4 <= nr2P4) && (nr2P4 <= nr3P4))
			System.out.println(nr1P4);
		else if((nr2P4 <= nr1P4) && (nr1P4 <= nr3P4))
			System.out.println(nr2P4);
		else
			System.out.println(nr3P4);
		
		System.out.println("\n");
		
		
		//problema5
		System.out.println("Problema5:\n");
		System.out.println("n= ");
		int n = inputObj.nextInt();
		int sum = 0;
		int i;
		for(i = 0; i <= n; i+=2)
			sum+=i;
		System.out.println(sum + "\n");
		
		
		//problema6
		System.out.println("Problema6:\n");
		System.out.println("n= ");
		n = inputObj.nextInt();
		sum = 0;
		for(i = 1; i <= n; i+=2)
			sum+=i;
		System.out.println(sum + "\n");
		
		//problema7
		System.out.println("Problema7:\n");
		System.out.println("n= ");
		n = inputObj.nextInt();
		sum = 0;
		for(i = 1; i<=n; i++)
			sum+=i;
		System.out.println(sum/i);
		
		
		//problema8
		System.out.println("Problema8:\n");
		System.out.println("n= ");
		n = inputObj.nextInt();
		int fact = 1;
		for(i = 1; i<=n; i++)
			fact*=i;
		System.out.println(fact);
		
		
		//problema9
		System.out.println("Problema9:\n");
		System.out.println("n= ");
		n = inputObj.nextInt();
		int m = 0;
		if(n!=0 && n!=1)
			for(i = 2; i<=n/2; i++)
				if(n % i == 0)
					m++;
		if(m==0)
			System.out.println("n este prim");
		else
			System.out.println("n nu este prim");
		
		
		//problema10
		System.out.println("Problema10:\n");
		n = 1000;
		m = 0;
		boolean ok = false;
		
		for(n=1000; ok == false; n++) {
			for(i=2; i*i<=n; i++) {
				if(n%i == 0)
					m++;
			}
			if(m==0)
				ok = true;
			m = 0;
		}
		
		System.out.println(n-1);
		
		
		}

}

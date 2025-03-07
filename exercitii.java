package tema_curs2;

import java.util.Scanner;

public class exercitii {

	public static void main(String[] args) {
		//problema1
		System.out.println("Problema 1:\n");

		Scanner inputObj = new Scanner(System.in);
		System.out.println("scrie un numar: ");
		int n1 = inputObj.nextInt();
		if(n1 >= 1 && n1 <= 10)
			if(n1 > 5)
				System.out.println("ADMIS\n");
			else
				System.out.println("RESPINS\n");
		else
			System.out.println("INVALID\n");
		
		//problema2
		System.out.println("Problema2:\n");
		System.out.println("Scrie un numar: ");
		n1 = inputObj.nextInt();
		switch(n1) {
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
		n1 = inputObj.nextInt();
		System.out.println("scrie al doilea numar: ");
		int nr2P3 = inputObj.nextInt();
		
		if((n1 + nr2P3) % 2 == 0)
			if(n1 % 2 == 0)
				System.out.println((n1 + nr2P3) / 2);
			else
				System.out.println(n1 * nr2P3);
		else
			System.out.println(n1 + nr2P3);
		
		System.out.println("\n");
		

		//problema4
		System.out.println("Problema4:\n");
		System.out.println("scrie 3 numere: ");
		n1 = inputObj.nextInt();
		int n2 = inputObj.nextInt();
		int n3 = inputObj.nextInt();
		if((n1 <= n2) && (n2 <= n3))
			System.out.println(n1);
		else if((n2 <= n1) && (n1 <= n3))
			System.out.println(n2);
		else
			System.out.println(n3);
		
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
		
		System.out.println("\n");
		
		
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
		
		System.out.println("\n");
		
		
		//problema11
		System.out.println("Problema11:\n");
		n = inputObj.nextInt();
		
		for(i=1; i<=n; i++)
			if(n%i == 0)
				System.out.println(i);
		
		
		//problema12
		System.out.println("Problema12:\n");
		n = inputObj.nextInt();
		int j;
		for(i=2; i<=n; i++)
			if(n%i == 0) {
				m = 0;
				for(j=2; j<=i; j++) {
					if(i%j == 0)
						m++;
				}
				if(m<=1)
					System.out.println(i);
			}
		
		
		//problema13
		for(i=1; i<1000; i+=17) 
			for(j=1; j<1000; j+=19) 
				if(i+j == 1000)
					System.out.println(i + " + " + j);
		
		
		//problema14
		for(i=1; i<1000; i+=17) {
			for(j=1; j<1000; j+=19) {
				if(i+j == 1000)
					System.out.println(i + " + " + j);
			}
			for(j=1; j<1000; j+=7)
				if(i+j == 1000)
					System.out.println(i + " + " + j);
		}
	}

}

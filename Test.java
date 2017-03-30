import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		/*
		Kula kulka = new Kula(50,50);
	
		kulka.wypiszMoment();
		Walec walec1 = new Walec(20,20,50);
		
		walec1.wypiszMoment();
		Pret precik = new Pret(20,50);
		
		precik.wypiszMoment();
		Pkt[] pochodne = new Pkt[3];
			
			for(int i = 0; i < pochodne.length; i++)
			{
				pochodne[0] = new Walec(50,70,50);
				pochodne[1] = new Pret(30,45);
				pochodne[2] = new Kula(22,54);
			}
			
			for(int i = 0; i< pochodne.length; i++)
			{
				
				pochodne[i].wypiszMoment();
				pochodne[i].twSteinera(30);
				pochodne[i].getTwSteinera();
			}
		
		
		*/
		/*
		 Powyżej kod zadania podstawowego,
		 Poniżej kod zadania na ocene bdb,
		 Kod powyżej znajduję sie w komenatrzu,
		 aby lepiej i przejżysciej mozna bylo sprawdzic dzialanie programu poniższego.
		 
		 
		 
		 
		 */

		
		Scanner skaner = new Scanner(System.in);
		int a;
		boolean dziala = true;
		double masa;
		double r;
		double odleglosc;
		
		do{
				System.out.println("Wybierz bryłe do policzenia :  \n 1-Walec \n 2-Kula \n 3-Pret \n 4 -Wyjscie z programu\n");
				a = skaner.nextInt();
				
				switch(a)
				{
				case 1:
					
					System.out.println("Podaj mase : \n");
					masa = skaner.nextDouble();
					System.out.println("Podaj promien : \n");
					r = skaner.nextDouble();
					System.out.println("Podaj odleglosc : \n");
					odleglosc = skaner.nextDouble();
					Walec walec1 = new Walec(masa,r,50);
					walec1.twSteinera(odleglosc);
					walec1.wypiszMoment();
					walec1.getTwSteinera();
					System.out.println("\n");
					break;
				case 2:
					System.out.println("Podaj mase : \n");
					masa = skaner.nextDouble();
					System.out.println("Podaj promien : \n");
					r = skaner.nextDouble();
					System.out.println("Podaj odleglosc : \n");
					odleglosc = skaner.nextDouble();
					Kula kulka = new Kula(masa,r);
					
					kulka.twSteinera(odleglosc);
					kulka.wypiszMoment();
					kulka.getTwSteinera();
					System.out.println("\n");
					break;
				case 3:
					System.out.println("Podaj mase : \n");
					masa = skaner.nextDouble();
					System.out.println("Podaj promien : \n");
					r = skaner.nextDouble();
					System.out.println("Podaj odleglosc : \n");
					odleglosc = skaner.nextDouble();
					Pret precik = new Pret(masa,r);
					precik.twSteinera(odleglosc);
					precik.wypiszMoment();
					precik.getTwSteinera();
					System.out.println("\n");
					break;
				case 4:
					System.out.println("Żegnam");
					skaner.close();
					dziala = false;
				default:
					System.out.println("Nie wybrałes nic - wracam do menu");
					continue;
				}
				
		}while(dziala);	
				
				
			
		}
		
		
}
	
		

		
		
		
	
package Zadatak;

public class Ispis {

	

			public static void main(String[] args) {
				

				int mesec=11;
				int godina=2022;
				
				for(int dan=1;dan<=30;dan+=7) {
					
					System.out.println(dan+"."+mesec+"."+godina+".");
				}
				
				for (int dan=6; dan<=31;dan+=7) {
					mesec=12;
					if(dan==25 && mesec==12) {
						System.out.print("Srećan Božić!");
					}
					
					System.out.println(dan+"."+mesec+"."+godina+".");
				}
				
				for(int dan=3;dan<=17;dan+=7) {
					mesec=1;
					if(dan==1 && mesec==1) {
						System.out.println("Srećna Nova godina!");
					}
					if (dan==3 && mesec==1) {
						System.out.print("Neradni dan."+" ");
					}
					if(dan==7 && mesec==1) {
						System.out.print("Srećan Božić!");
					}
					
					System.out.println(dan+"."+mesec+"."+godina+".");
				
				}
				
				
				
			}
		}
					
				






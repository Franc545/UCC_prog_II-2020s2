package co.edu.campusucc;

public class ProgramaNumerosPrimos {
	public static void main(String[] args) {
	
		System.out.println("..............");
		System.out.println("................");
		System.out.println("..................");
		System.out.println("........................");
		System.out.println("...Franz Erick Landazuri.");
		System.out.println("....Fecha:2020/11/16.....");
		System.out.println("..Programa de nuemros primos..");
		System.out.println(".....Del 2 hasta el 1000....");
		System.out.println(".....................");
		System.out.println();
		
			int a = 2;
	        int e = 1000;
	        boolean p;

	        for (int l = a; l <= e; l++) {
	            p = true;

	            for (int d = 2; d <= Math.sqrt(l) && p; d++)
	            {
	            	
	                if (l % d == 0) 
	                {
	                	
	                    p = false;
	                }
	            }

	            if (p) {
	                System.out.println(l);
	            }
	        }
	}
}
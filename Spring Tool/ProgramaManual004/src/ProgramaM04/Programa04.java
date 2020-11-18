package ProgramaM04;

public class Programa04 {
	public static void main(String[] args) {

		Scanner snow = new Scanner (System.in);
		int inglaterra=0, invento=0, land=0;
		
		System.out.println("¿Ingalterra es un pais suramericano? [0]Para no, [1]Para si");
		inglaterra= snow.nextInt();
		
		System.out.println("¿Marie Currie invento el Radio? [0]Para no, [1]Para si");
		invento= snow.nextInt();
		
		land = inglaterra + invento;
		
		System.out.println("El valor de land es:" + land);
	}

}

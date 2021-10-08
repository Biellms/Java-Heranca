package JavaHerança;

public class TesteEmpregado1 {

	public static void main(String[] args) {

		Empregado1 danillo = new Empregado1("Danillo Cavalcante","Rua da Marola,99",
				"33555667876",948484848,24,322,10000,15);
		danillo.imprimirInfo();
		danillo.calcularSalario();
	}
}


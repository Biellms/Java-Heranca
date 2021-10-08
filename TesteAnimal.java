package JavaHerança;

import java.util.Scanner;

public class TesteAnimal {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		int op;
		
		// Criando Objetos
		CachorroClass dog = new CachorroClass("Bill",1,"Canino","Gonden Retriever","Grande");
		CavaloClass horse = new CavaloClass("Pé de Pano",3,"Equino","Puro-sangue inglês","Preto");
		PreguiçaClass tired = new PreguiçaClass("Gabriel",2,"Bradypus Variegatus","preguiça-anã-de-três-dedos",70);
		
		do {
		System.out.println("\n -----------------------------");
		System.out.printf("\n Escolha uma opção");	
		System.out.printf("\n 1) CACHORRO");	
		System.out.printf("\n 2) CAVALO");
		System.out.printf("\n 3) BICHO-PREGUIÇA");
		System.out.printf("\n Opção: "); op = ler.nextInt();
		System.out.println("\n -----------------------------");
			
		switch (op) {
		
		case 1: dog.print();	// Exibe escolha
		System.out.print("\n -----------------------------");
		System.out.print("\n 1) Latir");
		System.out.print("\n 2) Correr");
		System.out.print("\n Opção: "); op = ler.nextInt();
		while (op >=1 || op <= 2) {	// Exibe Método
			if (op == 1) { dog.som(); break; } if (op == 2) { dog.correr(); break; }
		}
		break;
		
		case 2: horse.print();	// Exibe escolha
		System.out.print("\n -----------------------------");
		System.out.print("\n 1) Rinchar");
		System.out.print("\n 2) Correr");
		System.out.print("\n Opção: "); op = ler.nextInt();
		while (op >=1 || op <= 2) {	// Exibe Método
			if (op == 1) { horse.som(); break; } if (op == 2) { horse.correr(); break; }
		}
		break;
		
		case 3: tired.print();	// Exibe escolha
		System.out.print("\n -----------------------------");
		System.out.print("\n 1) Emitir Som");
		System.out.print("\n 2) Subir Árvore");
		System.out.print("\n Opção: "); op = ler.nextInt();
		while (op >=1 || op <= 2) {	// Exibe Método
			if (op == 1) { tired.som(); break; } if (op == 2) { tired.subir(); break; }
		}
		break;
		
		default: System.out.println("\n OPÇÃO INVALIDA"); break;
			}
		} while (op != 0);
	}
}

package JavaHeran�a;

public class Pregui�aClass extends AnimalClass{

	// Atributos
	int tamanho;
	
	// Construtor
	public Pregui�aClass (String nome, int idade, String especie, String raca, int tamanho) {
		super(nome, idade, especie, raca);
		this.tamanho = tamanho;
	}
	
	// M�todos
	public void print() {
		System.out.print(" BICHO-PREGUI�A");
		System.out.print("\n Nome: "+getNome());
		System.out.print("\n Idade: "+getIdade());
		System.out.print("\n Esp�cie: "+getEspecie());
		System.out.print("\n Ra�a: "+getRaca());
		System.out.print("\n Tamanho: "+tamanho+"cm");
	}
	
	public void som() {
		System.out.print("\n O pregui�a come�ou a EMITIR um som!!");
		System.out.print("\n AAAAAAHHHHHH");
	}
	
	public void subir() {
		System.out.print("\n A pregui�a come�ou a SUBIR a �rvore!!");
	}

	// Get e Set
	public int getTamanho() { return tamanho; }

	public void setTamanho(int tamanho) { this.tamanho = tamanho;}
	
}


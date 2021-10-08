package JavaHerança;

public class CachorroClass extends AnimalClass{
	
	// Atributos
	private String porte;
	
	// Construtor
	public CachorroClass (String nome, int idade, String especie,String raca, String porte) {
		super(nome, idade, especie, raca);
		this.porte = porte;
	}
	
	// Métodos
	public void print() {
		System.out.print(" CACHORRO");
		System.out.print("\n Nome: "+getNome());
		System.out.print("\n Idade: "+getIdade());
		System.out.print("\n Espécie: "+getEspecie());
		System.out.print("\n Raça: "+getRaca());
		System.out.print("\n Porte: "+porte);
	}
	
	public void som() {
		System.out.print("\n O cachorro começou a LATIR!!");
		System.out.print("\n AUAUAUAUAU");
	}
	
	public void correr() {
		System.out.print("\n O cachorro começou a CORRER!!");
	}

	// Get e Set
	public String getPorte() {return porte; }

	public void setPorte(String porte) { this.porte = porte;}
	
}

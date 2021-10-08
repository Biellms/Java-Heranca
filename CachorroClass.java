package JavaHeran�a;

public class CachorroClass extends AnimalClass{
	
	// Atributos
	private String porte;
	
	// Construtor
	public CachorroClass (String nome, int idade, String especie,String raca, String porte) {
		super(nome, idade, especie, raca);
		this.porte = porte;
	}
	
	// M�todos
	public void print() {
		System.out.print(" CACHORRO");
		System.out.print("\n Nome: "+getNome());
		System.out.print("\n Idade: "+getIdade());
		System.out.print("\n Esp�cie: "+getEspecie());
		System.out.print("\n Ra�a: "+getRaca());
		System.out.print("\n Porte: "+porte);
	}
	
	public void som() {
		System.out.print("\n O cachorro come�ou a LATIR!!");
		System.out.print("\n AUAUAUAUAU");
	}
	
	public void correr() {
		System.out.print("\n O cachorro come�ou a CORRER!!");
	}

	// Get e Set
	public String getPorte() {return porte; }

	public void setPorte(String porte) { this.porte = porte;}
	
}

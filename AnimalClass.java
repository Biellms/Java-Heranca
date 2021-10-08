package JavaHeran�a;

public class AnimalClass {

	// Atributos
	private String nome;
	private int idade;
	private String especie;
	private String raca;
	
	// Construtor
	public AnimalClass (String nome, int idade, String especie, String raca) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.especie = especie;
		this.raca = raca;
	}
	public AnimalClass (String nome, int idade, String especie) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.especie = especie;
	}

	// Get e Set
	public String getNome() {return nome; }

	public void setNome(String nome) {this.nome = nome;}

	public int getIdade() { return idade; }

	public void setIdade(int idade) { this.idade = idade; }

	public String getEspecie() { return especie; }

	public void setEspecie(String especie) { this.especie = especie; }

	public String getRaca() { return raca; }

	public void setRaca(String ra�a) { this.raca = ra�a; }
	
}

package entidades;

public class Produto {
	private String nome;
	private double preco;
	private int quant;

	//Contrutor
	public Produto() {}

	
	public Produto(String nome, double preco, int quant) {
		this.setNome(nome);
		this.setPreco(preco);
		this.setQuant(quant);
	}

	public Produto(String nome, double preco) {
		this.setNome(nome);
		this.setPreco(preco);
	}

	//Getters
	public String getNome() {
		return this.nome;
	}

	public double getPreco() {
		return this.preco;
	}

	public int getQuant() {
		return this.quant;
	}

	//Setters
	public void setNome(String valor) {
		this.nome = valor;
	}

	public void setPreco(double valor) {
		this.preco = valor;
	}

	private void setQuant(int valor) {
		this.quant = valor;
	}

	//Métodos comuns
	public double valorTotalEstoque() {
		return quant * preco;
	}

	public void atualizarEstoque(int quant, String opcao) {
		String teste = opcao.toLowerCase();
		this.setQuant(teste == "add" ? this.getQuant() + quant : this.getQuant() - quant);
		System.out.println("Dados Atualizados: " + this.getNome() + ", $ " + this.getPreco() + ", quantidade " + this.getQuant() + ", Total: " + valorTotalEstoque());
	}

	public String toString() {
		return "Dados do Produto: " + this.getNome() + ", $ " + String.format("%.2f", this.getPreco()) + ", quantidade " + this.getQuant() + ", Total: " + valorTotalEstoque();
	}
}

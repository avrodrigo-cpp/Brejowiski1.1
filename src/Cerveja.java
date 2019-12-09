
public class Cerveja {
	
	private String Tipo;
	private String Nome;
	private String Recipiente;
	private double Preco;
	private String Estabelecimento;
	private String Cidade;
	
	public String getRecipiente() {
		return Recipiente;
	}

	public void setRecipiente(String recipiente) {
		Recipiente = recipiente;
	}

	public double getPreco() {
		return Preco;
	}

	public void setPreco(double i) {
		Preco = i;
	}

	public String getEstabelecimento() {
		return Estabelecimento;
	}

	public void setEstabelecimento(String estabelecimento) {
		Estabelecimento = estabelecimento;
	}

	public String getCidade() {
		return Cidade;
	}

	public void setCidade(String cidade) {
		Cidade = cidade;
	}

	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		this.Nome = nome;
	}
	
	public String getTipo() {
		return Tipo;
	}
	
	public void setTipo(String tipo) {
		this.Tipo = tipo;
	}
	public String toString() {
		return this.Nome;
		
	}
}

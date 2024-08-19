package act1;

public class Brinquedo {

	 private String nome;
	 private String faixaEtaria;
	 private float preço;
	 
	 public void setNome(String nome) {
		 this.nome = nome;
	 }
	 
	 public String getNome() {
		 return nome;
	 }
	 
	 public void setFaixaEtaria(String faixaEtaria) {
		 if (faixaEtaria == "0 a 2" || faixaEtaria == "3 a 5" || faixaEtaria == "6 a 10" || faixaEtaria == "acima de 10" ) {
			 this.faixaEtaria = faixaEtaria;
		 }else {
			 System.out.println("Erro: Faixa invalida");
		 }
	 }
	 
	 public String getfaixaEtaria() {
		 return faixaEtaria; 
	 }
	 
	 public void setPreço(float preço) {
		 this.preço = preço;
	 }
	 
	 public float getPreço() {
		 return preço;
	 }
	 
	 public Brinquedo() {
		 this.nome = "";
		 this.faixaEtaria = "";
		 this.preço = 0.0f;
	 }
	 
	 public Brinquedo(String nome) {
		 this.nome = nome;
		 this.faixaEtaria = "";
	 }
	 
	 public Brinquedo(String nome, float preço) {
		 this.nome = nome;
		 this.preço = preço;
		 this.faixaEtaria = "";
	 }
	 
	 public void mostrar() {
		 System.out.println("Nome: " + nome);
		 System.out.println("Faixa Etaria: " + faixaEtaria);
		 System.out.println("Preço: " + preço);
	 }
}

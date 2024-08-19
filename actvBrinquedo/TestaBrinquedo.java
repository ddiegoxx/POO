package act1;

public class TestaBrinquedo {

	public static void main(String[] args) {
		
		Brinquedo brinquedo1 = new Brinquedo();
		Brinquedo brinquedo2 = new Brinquedo("Boneco");
		Brinquedo brinquedo3 = new Brinquedo("Quebra Cabeças", 10f);
		
		brinquedo1.setNome("Carrinho");
		brinquedo1.setFaixaEtaria("3 a 5");
		brinquedo1.setPreço(5);
		brinquedo1.mostrar();
		
		brinquedo2.setFaixaEtaria("13");
		brinquedo2.setPreço(14);
		brinquedo2.mostrar();
		
		brinquedo3.setFaixaEtaria("acima de 10");
		brinquedo3.mostrar();

	}

}

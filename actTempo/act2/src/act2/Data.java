package act2;

public class Data extends Tempo {
	private int dia;
	private int mes;
	private int ano;

	public Data() {}

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getDia() {
		return dia;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getMes() {
		return mes;
	}

	public void setAno(int ano) {	
		this.ano = ano;
	}

	public int getAno() {
		return ano;
	}

	@Override
	public long quantidade() {
		return (ano * 31104000) + (mes * 2592000) + (dia * 86400);
	}

	@Override
	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}
}

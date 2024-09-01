package act2;

public class Horario extends Tempo {
	private int hora;
	private int minuto;
	private int segundo;

	public Horario() {}

	public Horario(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getHora() {
		return hora;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}

	public int getSegundo() {
		return segundo;
	}

	@Override
	public long quantidade() {
		return (hora * 3600) + (minuto * 60) + segundo;
	}

	@Override
	public String toString() {
		return hora + ":" + minuto + ":" + segundo;
	}
}

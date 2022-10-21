package Cubo;

public class Cubo {

	private double lado;
	private double rend;
	private double tipo;
	private double areaBase;
	private double areaTot;
	private double volume;
	private double diag;
	private double litro;
	private double lata;
	private double valor;
	
	public Cubo(double lado, double rend, double tipo) {
		super();
		this.lado = lado;
		this.rend = rend;
		this.tipo = tipo;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getRend() {
		return rend;
	}

	public void setRend(double rend) {
		this.rend = rend;
	}

	public double getTipo() {
		return tipo;
	}

	public void setTipo(double tipo) {
		this.tipo = tipo;
	}

	public double getAreaBase() {
		return areaBase;
	}

	public void setAreaBase(double areaBase) {
		this.areaBase = areaBase;
	}

	public double getAreaTot() {
		return areaTot;
	}

	public void setAreaTot(double areaTot) {
		this.areaTot = areaTot;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getDiag() {
		return diag;
	}

	public void setDiag(double diag) {
		this.diag = diag;
	}

	public double getLitro() {
		return litro;
	}

	public void setLitro(double litro) {
		this.litro = litro;
	}

	public double getLata() {
		return lata;
	}

	public void setLata(double lata) {
		this.lata = lata;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double mostraBase() {
		setAreaBase(getLado() * getLado());
		return areaBase;
	}
	
	public double mostraAreaTot() {
		setAreaTot(getAreaBase() * 6);
		return areaTot;
	}
	
	public double mostraVolume() {
		setVolume(Math.pow(getLado(), 3));
		return volume;
	}
	
	public double mostraDiagonal() {
		setDiag(getLado() * (Math.sqrt(3)));
		return diag;
	}
	
	public double mostraLitro() {
		setLitro(getAreaTot() / getRend());
		return litro;
	}
	
	public double mostraLata() {
		setLata(getLitro() / 18);
		return Math.round(lata);
	}
	
	public double mostraValor() {
		if(getTipo() == 1)
			setValor(getLata() * 101.90);
			else if(getTipo() == 2)
				setValor(getLata() * 212.45);
			else if(getTipo() == 3)
				setValor(getLata() * 345.56);
		return valor;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cubo \na= ");
		builder.append(lado);
		builder.append("\nrend= ");
		builder.append(rend);
		builder.append("\ntipo= ");
		builder.append(tipo);
		builder.append("\nareaBase= ");
		builder.append(mostraBase());
		builder.append("\nareaTot= ");
		builder.append(mostraAreaTot());
		builder.append("\nVolume= ");
		builder.append(mostraVolume());
		builder.append("\ndiagonal= ");
		builder.append(mostraDiagonal());
		builder.append("\nlitro= ");
		builder.append(mostraLitro());
		builder.append("\nlata= ");
		builder.append(mostraLata());
		builder.append("\nvalor= ");
		builder.append(mostraValor());
		return builder.toString();
	}
	
}

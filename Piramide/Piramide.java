package Piramide;

public class Piramide {
	
	private double ab;
	private double h;
	private double tipo;
	private double a1;
	private double areaTri;
	private double areaBase;
	private double areaTot;
	private double litro;
	private double lata;
	private double preco;
	private double volume;
	
	public Piramide(double ab, double h, int tipo) {
		super();
		setAb(ab);
		setH(h);
		setTipo(tipo);
	}
	
	public double getAb() {
		return ab;
	}
	public void setAb(double ab) {
		this.ab = ab;
	}
	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h;
	}
	public double getTipo() {
		return tipo;
	}
	public void setTipo(double tipo) {
		this.tipo = tipo;
	}
	
	public double getA1() {
		return a1;
	}
	public void setA1(double a1) {
		this.a1 = a1;
	}
	
	public double getAreaTri() {
		return areaTri;
	}
	public void setAreaTri(double areaTri) {
		this.areaTri = areaTri;
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
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	
	public double mostraA1() {
		setA1(Math.pow(getAb(), 2) + Math.pow(getH(), 2));
		setA1(Math.sqrt(a1));
		return a1;
	}
	
	public double mostraAreaTri() {
		setAreaTri(((getAb()*2)*getA1()) / 2);
		return areaTri;
	}
	
	public double mostraAreaBase() {
		setAreaBase(Math.pow((getAb() * 2), 2));
		return areaBase;
	}
	
	public double mostraAreaTot() {
		setAreaTot((getAreaTri()* 4) + getAreaBase());
		return areaTot;
	}
	
	public double mostraLitros() {
		setLitro(getAreaTot() / 4.76);
		return litro;
	}
	
	public double mostraLata() {
		setLata(Math.round(getLitro() / 18));
		return lata;
	}
	
	public double mostraPreco() {
		if(getTipo() == 1)
		setPreco(getLata() * 127.90);
		else if(getTipo() == 2)
			setPreco(getLata() * 258.98);
		else if(getTipo() == 3)
			setPreco(getLata() * 344.34);
		return preco;
	}
	
	public double mostraVolume() {
		setVolume((getAreaBase() * getH()) / 3);
		return volume;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Piramide \nab= ");
		builder.append(ab);
		builder.append("\nh= ");
		builder.append(h);
		builder.append("\ntipo= ");
		builder.append(tipo);
		builder.append("\na1= ");
		builder.append(mostraA1());
		builder.append("\nareaTri= ");
		builder.append(mostraAreaTri());
		builder.append("\nareaBase= ");
		builder.append(mostraAreaBase());
		builder.append("\nareaTot= ");
		builder.append(mostraAreaTot());
		builder.append("\nlitro= ");
		builder.append(mostraLitros());
		builder.append("\nlata= ");
		builder.append(mostraLata());
		builder.append("\npreco= ");
		builder.append(mostraPreco());
		builder.append("\nvolume= ");
		builder.append(mostraVolume());
		return builder.toString();
	}
	
}

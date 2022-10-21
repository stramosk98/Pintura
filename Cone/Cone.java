package Cone;

public class Cone {
	
	private double geratriz;
	private double areaDoFundo;
	private double areaLateralDoCone;
	private double areaTotal;
	private double litros;
	private double latas;
	private double preco;
	private double raio;
	private double altura;
	private double tinta;

	public Cone(double raio, double altura, double tinta) {
		super();
		setRaio(raio);
		setAltura(altura);
		setTinta(tinta);	
	}

	public double getGeratriz() {
		return geratriz;
	}


	public void setGeratriz(double geratriz) {
		this.geratriz = geratriz;
	}


	public double getAreaDoFundo() {
		return areaDoFundo;
	}


	public void setAreaDoFundo(double areaDoFundo) {
		this.areaDoFundo = areaDoFundo;
	}


	public double getAreaLateralDoCone() {
		return areaLateralDoCone;
	}


	public void setAreaLateralDoCone(double areaLateralDoCone) {
		this.areaLateralDoCone = areaLateralDoCone;
	}


	public double getAreaTotal() {
		return areaTotal;
	}


	public void setAreaTotal(double areaTotal) {
		this.areaTotal = areaTotal;
	}


	public double getLitros() {
		return litros;
	}


	public void setLitros(double litros) {
		this.litros = litros;
	}


	public double getLatas() {
		return latas;
	}


	public void setLatas(double latas) {
		this.latas = latas;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public double getRaio() {
		return raio;
	}


	public void setRaio(double raio) {
		this.raio = raio;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getTinta() {
		return tinta;
	}


	public void setTinta(double tinta) {
		this.tinta = tinta;
	}


	public double mostraGeratriz() {
		setGeratriz((Math.pow(getAltura(), 2) + (Math.pow(getRaio(), 2))));
		setGeratriz(Math.sqrt(getGeratriz()));
		return geratriz;
	}
	
	public double mostraAreaFundo() {
		setAreaDoFundo(Math.PI*((Math.pow(getRaio(), 2))));
		return areaDoFundo;
	}
	
	public double mostraLateral() {
		setAreaLateralDoCone(Math.PI*(getRaio() * getGeratriz()));
		return areaLateralDoCone;
	}
	
	public double mostraAreaTot() {
		setAreaTotal(Math.PI*(getRaio() * (getRaio() + getGeratriz())));
		return areaTotal;
	}
	
	public double mostraLitros() {
		setLitros(3.45 * getAreaTotal());
		return litros;
	}
	
	public double mostraLatas() {
		setLatas(Math.round(getLitros() / 18));
		return latas;
	}
	
	public double mostraPreco() {
		if(getTinta() == 1)
			setPreco(getLatas() * 238.90f);
		else if(getTinta() == 2)
			setPreco(getLatas() * 467.98f);
		else if(getTinta() == 3)
			setPreco(getLatas() * 758.34f);
		return preco;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cone \nraio= ");
		builder.append(raio);
		builder.append("\naltura= ");
		builder.append(altura);
		builder.append("\ntinta= ");
		builder.append(tinta);
		builder.append("\nGeratriz= ");
		builder.append(mostraGeratriz());
		builder.append("\nAreaDoFundo= ");
		builder.append(mostraAreaFundo());
		builder.append("\nAreaLateralDoCone= ");
		builder.append(mostraLateral());
		builder.append("\nAreaTotal= ");
		builder.append(mostraAreaTot());
		builder.append("\nLitros= ");
		builder.append(mostraLitros());
		builder.append("\nLatas= ");
		builder.append(mostraLatas());
		builder.append("\npreco= ");
		builder.append(mostraPreco());
		return builder.toString();
	}

	

	
}

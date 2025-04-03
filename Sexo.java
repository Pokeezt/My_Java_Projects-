package pooexecicios1;

public enum Sexo {
	MASCULINO(0), FEMININO(1);
	
	public int valor;
	
	Sexo(int valor){
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

}

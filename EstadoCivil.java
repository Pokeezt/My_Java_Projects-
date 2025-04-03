package pooexecicios1;

public enum EstadoCivil {
	Solteiro(0), Casado(1), Separado(2), Divorciado(3), Viúvo(4), Viúva(5);
	
	public int valor;
	
	EstadoCivil(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}


	
	
}

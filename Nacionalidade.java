package pooexecicios1;

public enum Nacionalidade {
	BR(0),PT(1),EN(2),US(3),JP(4),OUTRAS(5);  
	
	public int valor;
	
	Nacionalidade(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}


	
}

package pooexecicios1;

public class Pessoa {
	EstadoCivil civil;
	private String nomecivil;
	
	private int dia, mes, ano_de_nacimento;
	
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno_de_nacimento() {
		return ano_de_nacimento;
	}

	public void setAno_de_nacimento(int ano_de_nacimento) {
		this.ano_de_nacimento = ano_de_nacimento;
	}


	private int altura, peso;
	
	private String nome_pessoa, nome_pai, nome_mae;
	
	public String getNome_pessoa() {
		return nome_pessoa;
	}
	
	public void setNome_pessoa(String nome_pessoa) {
		this.nome_pessoa = nome_pessoa;
	}
	
	public String getNome_pai() {
		return nome_pai;
	}
	
	public void setNome_pai(String nome_pai) {
		this.nome_pai = nome_pai;
	}
	
	public String getNome_mae() {
		return nome_mae;
	}
	
	public void setNome_mae(String nome_mae) {
		this.nome_mae = nome_mae;
	}
	
	Nacionalidade nacionalidade;
	
	Sexo sexo;

}

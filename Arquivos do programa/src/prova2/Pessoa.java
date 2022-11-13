package prova2;

import java.util.Calendar;
import java.util.Objects;

public class Pessoa {
	private String cpf;
	private String senha;
	private String nome;
	private TitulacaoAcademicaEnum titulacao;
	private String instituicao;
	private Calendar nascimento = Calendar.getInstance();
	
	public Pessoa() {
		this.cpf = null;
		this.senha = null;
		this.nome = null;
		this.titulacao = null;
		this.instituicao = null;
		this.nascimento.set(0, 0, 0);
	}
	
	public Pessoa(String cpf, String senha) {
		this.cpf = cpf;
		this.senha = senha;
		this.nome = null;
		this.titulacao = null;
		this.instituicao = null;
		this.nascimento.set(0, 0, 0);
	}
	
	public Pessoa(String cpf, String nome, TitulacaoAcademicaEnum titulacao, String instituicao, String senha, int dia, int mes, int ano) {
		this.cpf = cpf;
		this.senha = senha;
		this.nome = nome;
		this.titulacao = titulacao;
		this.instituicao = instituicao;
		this.nascimento.set(ano, mes, dia);
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getSenha() {
		return this.senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public TitulacaoAcademicaEnum getTitulacao() {
		return this.titulacao;
	}
	
	public void setTitulacao(TitulacaoAcademicaEnum titulacao) {
		this.titulacao = titulacao;
	}

	public String getInstituicao() {
		return this.instituicao;
	}
	
	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}
	
	public Calendar getNascimento() {
		return this.nascimento;
	}
	
	public void setNascimento(int dia, int mes, int ano) {
		this.nascimento.set(ano, mes, dia);
	}
	
	//Sobrescrevendo o método equals com o parâmetro do cpf de uma pessoa
	@Override
	public boolean equals(Object obj) {
        if(this.cpf.equals(((Pessoa) obj).getCpf())) {
        	return true;
        }else {
        	return false;
        }
    }
	
	//Sobrescrevendo o método HashCode com o parâmetro do cpf de uma pessoa
	@Override
	public int hashCode() {
		int hash = 7;
		hash = 31 * hash + Objects.hashCode(this.cpf);
		return hash;
	}
}

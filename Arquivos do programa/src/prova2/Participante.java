package prova2;

import java.util.Objects;

public class Participante extends Pessoa{
	private CargoParticipanteEnum cargo;
	private ValidacaoEnum validacao;
	
	public Participante() {
		super();
		this.validacao = null;
		this.cargo = null;
	}
	
	public Participante(String cpf, String senha, CargoParticipanteEnum cargo) {
		super(cpf, senha);
		this.validacao = null;
		this.cargo = cargo;
	}
	
	public Participante(String cpf, String nome, TitulacaoAcademicaEnum titulacao, String instituicao, String senha, int dia, int mes, int ano, CargoParticipanteEnum cargo) {
		super(cpf, nome, titulacao, instituicao, senha, dia, mes, ano);
		this.validacao = ValidacaoEnum.PENDENTE;
		this.cargo = cargo;
	}
	
	public CargoParticipanteEnum getCargo() {
		return this.cargo;
	}
	
	public void setCargo(CargoParticipanteEnum cargo) {
		this.cargo = cargo;
	}
	
	public ValidacaoEnum getValidacao() {
		return this.validacao;
	}
	
	public void setValidacao(ValidacaoEnum validacao) {
		this.validacao = validacao;
	}
	
	//Sobrescrevendo o método equals com o parâmetro do cpf de uma pessoa
	@Override
	public boolean equals(Object obj) {
        if(super.getCpf().equals(((Pessoa) obj).getCpf())) {
        	return true;
        }else {
        	return false;
        }
    }
	
	//Sobrescrevendo o método HashCode com o parâmetro do cpf de uma pessoa
	@Override
	public int hashCode() {
		int hash = 7;
		hash = 31 * hash + Objects.hashCode(super.getCpf());
		return hash;
	}
}

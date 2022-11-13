package prova2;

import java.util.Objects;

public class ProgramChair extends Participante{
	public ProgramChair() {
		super();
	}
	
	public ProgramChair(String cpf, String senha, CargoParticipanteEnum cargo) {
		super(cpf, senha, cargo);
	}
	
	public ProgramChair(String cpf, String nome, TitulacaoAcademicaEnum titulacao, String instituicao, String senha, int dia, int mes, int ano, CargoParticipanteEnum cargo) {
		super(cpf, nome, titulacao, instituicao, senha, dia, mes, ano, cargo);
		super.setValidacao(ValidacaoEnum.PENDENTE);
	}
	
	//Método que recebe como parâmetro um artigo e altera o seu enum de validação
	public void validar(Artigo a) {
		a.setValidacao(ValidacaoEnum.VÁLIDA);
	}
	
	//Método que recebe como parâmetro um artigo e altera o seu enum de validação
	public void invalidar(Artigo a) {
		a.setValidacao(ValidacaoEnum.INVÁLIDA);
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

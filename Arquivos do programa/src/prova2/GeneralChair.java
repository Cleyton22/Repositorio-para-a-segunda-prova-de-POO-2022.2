package prova2;

import java.util.Objects;

public class GeneralChair extends Participante{
	public GeneralChair() {
		super();
	}
	
	public GeneralChair(String cpf, String senha, CargoParticipanteEnum cargo) {
		super(cpf, senha, cargo);
	}
	
	public GeneralChair(String cpf, String nome, TitulacaoAcademicaEnum titulacao, String instituicao, String senha, int dia, int mes, int ano, CargoParticipanteEnum cargo) {
		super(cpf, nome, titulacao, instituicao, senha, dia, mes, ano, cargo);
		super.setValidacao(ValidacaoEnum.PENDENTE);
	}
	
	//Método que recebe como parâmetro um participante e altera o seu enum de validação
	public void validar(Participante p) {
		p.setValidacao(ValidacaoEnum.VÁLIDA);
	}
	
	//Método que recebe como parâmetro um participante e altera o seu enum de validação
	public void invalidar(Participante p) {
		p.setValidacao(ValidacaoEnum.INVÁLIDA);
	}
	
	//Método que recebe como parâmetro um participante e imprimi um certificado apresentando o seu cargo
	public void emitirCertificao(Participante p) {
		String cargo = null;
		CargoParticipanteEnum ca = p.getCargo();
		
		switch(ca) {
		case PARTICIPANTE:
			cargo = "participante";
			break;
		case PROGRAM_CHAIR:
			cargo = "program chair";
			break;
		case GENERAL_CHAIR:
			cargo = "general chair";
			break;
		case AUTOR:
			cargo = "autor de artigo";
			break;
		case REVISOR:
			cargo = "revisor de artigo";
			break;
		}
		System.out.println("CERTIFICADO:\n");
		System.out.println("Certificamos que " + p.getNome() + " tem inscrição válida como " + cargo + " no sistema de gerenciamento de atividades do CBPOO.\n");
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

package prova2;

import java.util.ArrayList;
import java.util.Objects;

public class AutorArtigo extends Participante{	
	ArrayList<Artigo> artigos = new ArrayList<Artigo>();
	
	public AutorArtigo() {
		super();
	}
	
	public AutorArtigo(String cpf, String senha, CargoParticipanteEnum cargo) {
		super(cpf, senha, cargo);
	}
	
	public AutorArtigo(String cpf, String nome, TitulacaoAcademicaEnum titulacao, String instituicao, String senha, int dia, int mes, int ano, CargoParticipanteEnum cargo) {
		super(cpf, nome, titulacao, instituicao, senha, dia, mes, ano, cargo);
		super.setValidacao(ValidacaoEnum.PENDENTE);
	}
	
	public ArrayList<Artigo> getArtigos(){
		return this.artigos;
	}
	
	public void setArtigos(Artigo artigo) {
		this.artigos.add(artigo);
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
	
	//Sobrescrevendo o método hashCode com o parâmetro do cpf de uma pessoa
	@Override
	public int hashCode() {
		int hash = 7;
		hash = 31 * hash + Objects.hashCode(super.getCpf());
		return hash;
	}
}

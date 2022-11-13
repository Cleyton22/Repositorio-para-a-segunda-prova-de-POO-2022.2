package prova2;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Objects;

public class Artigo {
	private int identificador;
	private String titulo;
	private String abstrato;
	private HashSet<String> palaChaves = new HashSet<String>();
	private int paginas;
	private Calendar submissao = Calendar.getInstance();
	private HashSet<Participante> autores = new HashSet<Participante>();
	private HashSet<RevisorArtigo> revisores = new HashSet<RevisorArtigo>();
	private ValidacaoEnum validacao;
	
	public Artigo() {
		this.identificador = -1;
		this.titulo = null;
		this.abstrato = null;
		this.palaChaves = null;
		this.paginas = 0;
		this.submissao = null;
	}
	
	public Artigo(int identificador, String titulo, String abstrato, HashSet<String> palaChaves, int paginas, int dia, int mes, int ano) {
		this.identificador = identificador;
		this.titulo = titulo;
		this.abstrato = abstrato;
		this.palaChaves = palaChaves;
		this.paginas = paginas;
		this.submissao.set(ano, mes, dia);
		this.validacao = ValidacaoEnum.PENDENTE;
	}
	
	public int getIdentificador() {
		return this.identificador;
	}
	
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAbstrato() {
		return this.abstrato;
	}
	
	public void setAbstrato(String abstrato) {
		this.abstrato = abstrato;
	}
	
	public HashSet<String> getPalaChaves(){
		return this.palaChaves;
	}
	
	public void setPalaChaves(HashSet<String> palaChaves) {
		this.palaChaves = palaChaves;
	}
	
	public int getPaginas() {
		return this.paginas;
	}
	
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	
	public Calendar getSubmissao() {
		return this.submissao;
	}
	
	public void setSubmissao(int dia, int mes, int ano) {
		this.submissao.set(ano, mes, dia);
	}
	
	public HashSet<Participante> getAutores() {
		return this.autores;
	}
	
	public void setAutores(HashSet<Participante> autores) {
		this.autores = autores;
	}
	
	public HashSet<RevisorArtigo> getRevisores() {
		return this.revisores;
	}
	
	public void setRevisores(RevisorArtigo revisores) {
		this.revisores.add(revisores);
	}
	
	public ValidacaoEnum getValidacao() {
		return this.validacao;
	}
	
	public void setValidacao(ValidacaoEnum validacao) {
		this.validacao = validacao;
	}
	
	//Sobrescrevendo o método equals com o parâmetro do identificador de um artigo
	@Override
	public boolean equals(Object obj) {
        if(this.identificador == ((Artigo) obj).getIdentificador()) {
        	return true;
        }else {
        	return false;
        }
    }
	
	//Sobrescrevendo o método hashCode com o parâmetro do identificador de um artigo
	@Override
	public int hashCode() {
		int hash = 7;
		hash = 31 * hash + Objects.hashCode(this.identificador);
		return hash;
	}
}

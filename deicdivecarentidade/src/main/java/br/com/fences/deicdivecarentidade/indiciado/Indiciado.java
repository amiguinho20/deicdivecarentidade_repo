package br.com.fences.deicdivecarentidade.indiciado;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

import com.google.gson.annotations.SerializedName;

import br.com.fences.fencesutils.verificador.Verificador;

public class Indiciado implements Serializable, Comparable<Indiciado>{
	
	private static final long serialVersionUID = -823975289148693760L;

	@SerializedName("_id")
	private String id;
	private String nome;
	private String nomeDaMae;
	private String rg;
	private String rgUf;
	private String rgDataEmissao;
	private String nacionalidade;
	private String naturalidade;
	private String cpf;
	private String ultimaAtualizacao;
	private Set<OcorrenciaReferencia> ocorrencias = new LinkedHashSet<>();
	
	@Override
	public int compareTo(Indiciado o) {
		if (Verificador.isValorado(nome))
		{
			return nome.compareTo(o.nome);
		}
		return 0;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((nomeDaMae == null) ? 0 : nomeDaMae.hashCode());
		result = prime * result + ((rg == null) ? 0 : rg.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Indiciado other = (Indiciado) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (nomeDaMae == null) {
			if (other.nomeDaMae != null)
				return false;
		} else if (!nomeDaMae.equals(other.nomeDaMae))
			return false;
		if (rg == null) {
			if (other.rg != null)
				return false;
		} else if (!rg.equals(other.rg))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Indiciado [id=" + id + ", nome=" + nome + ", nomeDaMae=" + nomeDaMae + ", rg=" + rg + ", rgUf=" + rgUf
				+ ", rgDataEmissao=" + rgDataEmissao + ", nacionalidade=" + nacionalidade + ", naturalidade="
				+ naturalidade + ", cpf=" + cpf + ", ultimaAtualizacao=" + ultimaAtualizacao + ", ocorrencias="
				+ ocorrencias + "]";
	}

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeDaMae() {
		return nomeDaMae;
	}

	public void setNomeDaMae(String nomeDaMae) {
		this.nomeDaMae = nomeDaMae;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getRgUf() {
		return rgUf;
	}

	public void setRgUf(String rgUf) {
		this.rgUf = rgUf;
	}

	public String getRgDataEmissao() {
		return rgDataEmissao;
	}

	public void setRgDataEmissao(String rgDataEmissao) {
		this.rgDataEmissao = rgDataEmissao;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Set<OcorrenciaReferencia> getOcorrencias() {
		return ocorrencias;
	}

	public void setOcorrencias(Set<OcorrenciaReferencia> ocorrencias) {
		this.ocorrencias = ocorrencias;
	}

	public String getUltimaAtualizacao() {
		return ultimaAtualizacao;
	}

	public void setUltimaAtualizacao(String ultimaAtualizacao) {
		this.ultimaAtualizacao = ultimaAtualizacao;
	}







}

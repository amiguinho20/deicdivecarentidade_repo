package br.com.fences.deicdivecarentidade.enderecoavulso;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import br.com.fences.deicdivecarentidade.enderecoavulso.geojson.Point;

public class EnderecoAvulso implements Serializable{

	private static final long serialVersionUID = 6708411077276497587L;
	
	@SerializedName("_id")
	private String id;
	
	private String razaoSocial;
	private String logradouro;
	private String numero;
	private String bairro;
	private String cep;
	private String cidade;
	private String uf;

	private String tipo; //1)mercado 2)galpao 3)deposito 4)desmanche	
	private Point  geometry; 
	private String indicadorAtivo;
	private String ultimaAtualizacao;
	
	

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getIndicadorAtivo() {
		return indicadorAtivo;
	}
	public void setIndicadorAtivo(String indicadorAtivo) {
		this.indicadorAtivo = indicadorAtivo;
	}
	public String getUltimaAtualizacao() {
		return ultimaAtualizacao;
	}
	public void setUltimaAtualizacao(String ultimaAtualizacao) {
		this.ultimaAtualizacao = ultimaAtualizacao;
	}
	public Point getGeometry() {
		return geometry;
	}
	public void setGeometry(Point geometry) {
		this.geometry = geometry;
	}

}

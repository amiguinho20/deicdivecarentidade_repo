package br.com.fences.deicdivecarentidade.indiciado;

import java.io.Serializable;


public class OcorrenciaReferencia implements Serializable, Comparable<OcorrenciaReferencia>{

	private static final long serialVersionUID = -4743903257333815417L;

	private String id;  //-- id do banco
	private String numBo;       //
	private String anoBo;       // - chave 1
	private String idDelegacia; //
	private String datahoraRegistroBo;  // chave 2
	private String nomeDelegacia;
	
	public OcorrenciaReferencia(){}
	
	public OcorrenciaReferencia(String id, String numBo, String anoBo, String idDelegacia, String datahoraRegistroBo,
			String nomeDelegacia) {
		super();
		this.id = id;
		this.numBo = numBo;
		this.anoBo = anoBo;
		this.idDelegacia = idDelegacia;
		this.datahoraRegistroBo = datahoraRegistroBo;
		this.nomeDelegacia = nomeDelegacia;
	}
	
	@Override
	public int compareTo(OcorrenciaReferencia o) {
		int ret = 0;
		if (getDatahoraRegistroBo() != null)
		{
			ret = getDatahoraRegistroBo().compareTo(o.getDatahoraRegistroBo());
		}
		else
		{
			ret = 0;
		}
		return ret;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anoBo == null) ? 0 : anoBo.hashCode());
		result = prime * result + ((datahoraRegistroBo == null) ? 0 : datahoraRegistroBo.hashCode());
		result = prime * result + ((idDelegacia == null) ? 0 : idDelegacia.hashCode());
		result = prime * result + ((numBo == null) ? 0 : numBo.hashCode());
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
		OcorrenciaReferencia other = (OcorrenciaReferencia) obj;
		if (anoBo == null) {
			if (other.anoBo != null)
				return false;
		} else if (!anoBo.equals(other.anoBo))
			return false;
		if (datahoraRegistroBo == null) {
			if (other.datahoraRegistroBo != null)
				return false;
		} else if (!datahoraRegistroBo.equals(other.datahoraRegistroBo))
			return false;
		if (idDelegacia == null) {
			if (other.idDelegacia != null)
				return false;
		} else if (!idDelegacia.equals(other.idDelegacia))
			return false;
		if (numBo == null) {
			if (other.numBo != null)
				return false;
		} else if (!numBo.equals(other.numBo))
			return false;
		return true;
	}

	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNumBo() {
		return numBo;
	}
	public void setNumBo(String numBo) {
		this.numBo = numBo;
	}
	public String getAnoBo() {
		return anoBo;
	}
	public void setAnoBo(String anoBo) {
		this.anoBo = anoBo;
	}
	public String getIdDelegacia() {
		return idDelegacia;
	}
	public void setIdDelegacia(String idDelegacia) {
		this.idDelegacia = idDelegacia;
	}
	public String getDatahoraRegistroBo() {
		return datahoraRegistroBo;
	}
	public void setDatahoraRegistroBo(String datahoraRegistroBo) {
		this.datahoraRegistroBo = datahoraRegistroBo;
	}
	public String getNomeDelegacia() {
		return nomeDelegacia;
	}
	public void setNomeDelegacia(String nomeDelegacia) {
		this.nomeDelegacia = nomeDelegacia;
	}
	
}

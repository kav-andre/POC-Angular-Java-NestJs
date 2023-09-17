package com.kav.poc.dto;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

public class ResultadoDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(example = "0")
	private Integer codigo;
	
	@ApiModelProperty(example = "Sucesso!")
	private String mensagem;

	public ResultadoDTO() {
		super();
	}

	public ResultadoDTO(Integer codigo, String mensagem) {
		super();
		this.codigo = codigo;
		this.mensagem = mensagem;
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getMensagem() {
		return this.mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	@Override
	public String toString() {
		return "ResultadoDTO [codigo=" + codigo + ", mensagem=" + mensagem + "]";
	}
}

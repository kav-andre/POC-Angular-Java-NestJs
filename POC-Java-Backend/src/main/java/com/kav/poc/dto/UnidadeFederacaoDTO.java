package com.kav.poc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UnidadeFederacaoDTO {
	
	public UnidadeFederacaoDTO(Integer codigo, String nome, String sigla) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.sigla = sigla;
	}

	@ApiModelProperty(position = 1)
	private Integer codigo;
	
	@ApiModelProperty(position = 2)
	private String nome;

	@ApiModelProperty(position = 3)
	private String sigla;
}

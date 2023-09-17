package com.kav.poc.response;

import com.kav.poc.dto.ResultadoDTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseDTO<T> {

	@ApiModelProperty(position = 1)
	private ResultadoDTO resultado;

	@ApiModelProperty(position = 3)
	private T dados;

	public ResponseDTO() {
	}

	public ResultadoDTO getResultado() {
		if (this.resultado == null) this.resultado = new ResultadoDTO();
		return this.resultado;
	}
}

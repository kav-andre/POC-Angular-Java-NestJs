package com.kav.poc.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kav.poc.dto.ResultadoDTO;
import com.kav.poc.dto.UnidadeFederacaoDTO;
import com.kav.poc.response.ResponseListUnidadeFederacaoDTO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(tags = "UnidadeFederacao", value = "Controlador Rest - Unidade Federação")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UnidadeFederacaoController extends Controller {
	
	@ApiOperation(value = "", response = ResponseListUnidadeFederacaoDTO.class, notes = "Leitura dos dados do Cadastro de Unidade Federação.")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success", response = ResponseListUnidadeFederacaoDTO.class),
			@ApiResponse(code = 400, message = "Bad Request"),
	        @ApiResponse(code = 404, message = "Not Found"),
	        @ApiResponse(code = 500, message = "Internal Sever Error")
	})
	@RequestMapping("/unidadeFederacao/listar")
	public ResponseEntity<ResponseListUnidadeFederacaoDTO> listar() throws Exception {
		
		ArrayList<UnidadeFederacaoDTO> arrayList = new ArrayList<UnidadeFederacaoDTO>();
		arrayList.add(new UnidadeFederacaoDTO(1, "Santa Catarina", "SC"));
		arrayList.add(new UnidadeFederacaoDTO(2, "São Paulo", "SP"));
		arrayList.add(new UnidadeFederacaoDTO(3, "Paraná", "PR"));
		arrayList.add(new UnidadeFederacaoDTO(4, "Rio Grande do Sul", "RS"));
		
		ResponseListUnidadeFederacaoDTO response = new ResponseListUnidadeFederacaoDTO();
		response.setDados(arrayList);
		response.setResultado(new ResultadoDTO(0, "Consulta de Unidade Federação efetuada com sucesso!"));
		
		return ResponseEntity.ok(response);
	}
}

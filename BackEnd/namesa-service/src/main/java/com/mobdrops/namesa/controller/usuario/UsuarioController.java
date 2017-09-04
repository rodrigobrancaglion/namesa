package com.mobdrops.namesa.controller.usuario;

import java.sql.SQLException;
import java.text.ParseException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mobdrops.namesa.controller.AbstractRestHandler;
import com.mobdrops.namesa.dto.Usuario;
import com.mobdrops.namesa.exception.ProcedureException;
import com.mobdrops.namesa.exception.ResourceNotFoundException;
import com.mobdrops.namesa.service.impl.UsuarioService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/usuario")
@Api(value = "Api de Usuario", description = "Operações pertinentes do Usuario para a API")
public class UsuarioController extends AbstractRestHandler {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UsuarioService usuarioService;

	@ApiOperation(value = "Consultar um Usuário", response = Usuario.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 400, message = "Bad Request"), @ApiResponse(code = 401, message = "Unauthorized"),
			@ApiResponse(code = 403, message = "Forbidden"), @ApiResponse(code = 404, message = "Not Found"),
			@ApiResponse(code = 500, message = "Failure") })
	@RequestMapping(value = "/consultar/{id}", method = RequestMethod.GET, produces = "application/json")
	@ResponseStatus(value = HttpStatus.OK)
	@ResponseBody
	public Usuario consultar(@ApiParam(value = "Id do Usuario") @PathVariable Integer id) throws Exception {
		Usuario usuarioRetorno = new Usuario();
		try {
			usuarioRetorno = usuarioService.consultar(id);

		} catch (IllegalAccessException e) {
			log.error("Erro:", e);
		} catch (ParseException e) {
			log.error("Erro:", e);
		} catch (JsonProcessingException e) {
			log.error("Erro:", e);
		}

		return usuarioRetorno;
	}

	@ApiOperation(value = "Adicionar um Usuário")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 400, message = "Bad Request"), @ApiResponse(code = 401, message = "Unauthorized"),
			@ApiResponse(code = 403, message = "Forbidden"), @ApiResponse(code = 404, message = "Not Found"),
			@ApiResponse(code = 500, message = "Failure") })
	@RequestMapping(value = "/incluir", method = RequestMethod.POST, produces = "application/json")
	@ResponseStatus(value = HttpStatus.OK)
	@ResponseBody
	public void incluir(@ApiParam(value = "Usuario do sistema") @RequestBody Usuario usuario) throws Exception {
		try {
			usuarioService.incluir(usuario);

		} catch (IllegalAccessException e) {
			log.error("Erro:", e);
		} catch (ParseException e) {
			log.error("Erro:", e);
		} catch (JsonProcessingException e) {
			log.error("Erro:", e);
		}
	}

	@ApiOperation(value = "Atualizar um Usuário")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 400, message = "Bad Request"), @ApiResponse(code = 401, message = "Unauthorized"),
			@ApiResponse(code = 403, message = "Forbidden"), @ApiResponse(code = 404, message = "Not Found"),
			@ApiResponse(code = 500, message = "Failure") })
	@RequestMapping(value = "/alterar/{id}", method = RequestMethod.PUT, produces = "application/json")
	@ResponseStatus(value = HttpStatus.OK)
	@ResponseBody
	public void alterar(@ApiParam(value = "Id do usuario") @PathVariable Integer id,
			@ApiParam(value = "Usuario do sistema") @RequestBody Usuario usuario) throws Exception {
		try {
			usuarioService.alterar(usuario);
		} catch (IllegalAccessException e) {
			log.error("Erro:", e);
		} catch (ParseException e) {
			log.error("Erro:", e);
		} catch (JsonProcessingException e) {
			log.error("Erro:", e);
		}
	}

	@ApiOperation(value = "Excluir um Usuário")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 400, message = "Bad Request"), @ApiResponse(code = 401, message = "Unauthorized"),
			@ApiResponse(code = 403, message = "Forbidden"), @ApiResponse(code = 404, message = "Not Found"),
			@ApiResponse(code = 500, message = "Failure") })
	@RequestMapping(value = "/excluir/{id}", method = RequestMethod.DELETE, produces = "application/json")
	@ResponseStatus(value = HttpStatus.OK)
	@ResponseBody
	public void excluir(@ApiParam(value = "Id do Usuario") @PathVariable Integer id) throws Exception {
		try {
			usuarioService.excluir(id);
		} catch (IllegalAccessException e) {
			log.error("Erro:", e);
		} catch (ParseException e) {
			log.error("Erro:", e);
		} catch (JsonProcessingException e) {
			log.error("Erro:", e);
		}
	}

	@ApiOperation(value = "Consulta Tudo")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 400, message = "Bad Request"), @ApiResponse(code = 401, message = "Unauthorized"),
			@ApiResponse(code = 403, message = "Forbidden"), @ApiResponse(code = 404, message = "Not Found"),
			@ApiResponse(code = 500, message = "Failure") })
	@RequestMapping(value = "/consultarTodos", method = RequestMethod.GET, produces = "application/json")
	@ResponseStatus(value = HttpStatus.OK)
	@ResponseBody
	public void consultaTodos() throws ProcedureException, ResourceNotFoundException {
		try {
			usuarioService.consultarTodos();
		} catch (SQLException e) {
		}
	}

}

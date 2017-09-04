package com.mobdrops.namesa.service;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mobdrops.namesa.dto.Usuario;
import com.mobdrops.namesa.exception.ProcedureException;

public interface IUsuarioService {

	void incluir(Usuario usuarioRequest) throws SQLException, ProcedureException, IllegalArgumentException,
			IllegalAccessException, ParseException, JsonProcessingException;

	void alterar(Usuario usuarioRequest) throws SQLException, ProcedureException, IllegalArgumentException,
			IllegalAccessException, ParseException, JsonProcessingException;

	void excluir(Integer id) throws SQLException, ProcedureException, IllegalArgumentException, IllegalAccessException,
			ParseException, JsonProcessingException;

	Usuario consultar(Integer id) throws SQLException, ProcedureException, IllegalArgumentException,
			IllegalAccessException, ParseException, JsonProcessingException;

	/**
	 * consultar Usuario
	 * 
	 * @param usuario
	 * @throws SQLException
	 * @throws ProcedureException
	 */
	List<Usuario> consultarTodos() throws SQLException, ProcedureException;
}

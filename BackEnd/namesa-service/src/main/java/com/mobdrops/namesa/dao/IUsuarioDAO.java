package com.mobdrops.namesa.dao;

import java.sql.SQLException;
import java.util.List;

import com.mobdrops.namesa.dto.Usuario;
import com.mobdrops.namesa.exception.ProcedureException;

public interface IUsuarioDAO {

	/**
	 * insere Usuario
	 * @param usuario
	 * @throws SQLException
	 * @throws ProcedureException
	 */
	void incluir(Usuario usuario) throws SQLException, ProcedureException;
	
	/**
	 * alterar Usuario
	 * @param usuario
	 * @throws SQLException
	 * @throws ProcedureException
	 */
	void alterar(Usuario usuario) throws SQLException, ProcedureException;
	
	/**
	 * excluir Usuario
	 * @param usuario
	 * @throws SQLException
	 * @throws ProcedureException
	 */
	void excluir(Usuario usuario) throws SQLException, ProcedureException;
	
	/**
	 * consultar Usuario
	 * @param usuario
	 * @throws SQLException
	 * @throws ProcedureException
	 */
	Usuario consultar(Usuario usuario) throws SQLException, ProcedureException;
	
	
	/**
	 * consultar Usuario
	 * @param usuario
	 * @throws SQLException
	 * @throws ProcedureException
	 */
	List<Usuario> consultarTodos() throws SQLException, ProcedureException;
}

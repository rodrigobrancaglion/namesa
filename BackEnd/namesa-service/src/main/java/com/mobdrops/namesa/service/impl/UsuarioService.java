package com.mobdrops.namesa.service.impl;

import java.io.Serializable;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mobdrops.namesa.dao.impl.UsuarioDAO;
import com.mobdrops.namesa.dto.Usuario;
import com.mobdrops.namesa.exception.ProcedureException;
import com.mobdrops.namesa.service.IUsuarioService;

@Service
public class UsuarioService  implements IUsuarioService, Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@Override
	public void incluir(Usuario usuario) throws SQLException, ProcedureException, IllegalArgumentException,
			IllegalAccessException, ParseException, JsonProcessingException {
		
//		GrupoCargo grupoCargo = new GrupoCargo(1);
//		Setor setor = new Setor(1);
//		Cargo cargo = new Cargo(1, grupoCargo, setor, 10.0);
//		Legibilidade legibilidade = new Legibilidade(1);
//		Usuario usuarioFake = new Usuario("Nome Teste", "Sobrenome Teste", Instant.now(), Instant.now(), cargo, legibilidade);
		
//		usuarioDAO.incluir(usuarioFake);
	}
	
	@Override
	public void alterar(Usuario usuario) throws SQLException, ProcedureException, IllegalArgumentException,
			IllegalAccessException, ParseException, JsonProcessingException {
		
	}
	
	@Override
	public void excluir(Integer id) throws SQLException, ProcedureException, IllegalArgumentException,
			IllegalAccessException, ParseException, JsonProcessingException {
		
	}
	
	@Override
	public Usuario consultar(Integer id) throws SQLException, ProcedureException, IllegalArgumentException,
			IllegalAccessException, ParseException, JsonProcessingException {
	
		return new Usuario();
	}

	@Override
	public List<Usuario> consultarTodos() throws SQLException, ProcedureException {
		List<Usuario> usuarios = usuarioDAO.consultarTodos();
		return usuarios;
	}

}

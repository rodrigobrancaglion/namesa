package com.mobdrops.namesa.service.impl;

import java.io.Serializable;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.Instant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mobdrops.namesa.dao.impl.UsuarioDAO;
import com.mobdrops.namesa.dto.Cargo;
import com.mobdrops.namesa.dto.GrupoCargo;
import com.mobdrops.namesa.dto.Legibilidade;
import com.mobdrops.namesa.dto.Setor;
import com.mobdrops.namesa.dto.Usuario;
import com.mobdrops.namesa.exception.ProcedureException;
import com.mobdrops.namesa.service.IUsuarioService;

@Service
public class UsuarioService  implements IUsuarioService, Serializable {

	private static final long serialVersionUID = 1L;

	private final Logger log = LoggerFactory.getLogger(this.getClass());


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
		
		//Usuario usuario = usuarioDAO.consultar(usuario);
		
		/**
		 * Fake
		 */
//		GrupoCargo grupoCargo = new GrupoCargo(1, "Grupo 1");
//		Setor setor = new Setor(1);
//		setor.setNome("ADMINISTRAÇÃO");
//		Cargo cargo = new Cargo(1, grupoCargo, setor, 10.0);
//		cargo.setNome("ALMOXARIFE");
//		Legibilidade legibilidade = new Legibilidade(1);
//		legibilidade.setNome("Sim");
//		Usuario usuarioFake = new Usuario("Nome Teste", "Sobrenome Teste", Instant.now(), Instant.now(), cargo, legibilidade);
		
//		return usuarioFake;
		return new Usuario();
	}

}

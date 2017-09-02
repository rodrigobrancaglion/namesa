package com.mobdrops.namesa.dao.impl;

import java.io.Serializable;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.mobdrops.namesa.dao.DAO;
import com.mobdrops.namesa.dao.IUsuarioDAO;
import com.mobdrops.namesa.dto.Usuario;
import com.mobdrops.namesa.exception.ProcedureException;

@Repository
public class UsuarioDAO extends DAO implements IUsuarioDAO, Serializable {

	private static final long serialVersionUID = 1L;
	
	//@PersistenceContext
	//private EntityManager em;
	
	//@Autowired
    //private UsuarioRepository userRepository;
	
	@Override
	public void incluir(Usuario usuario) throws SQLException, ProcedureException {
		
		//this.userRepository.save(usuario);
	}
	
	@Override
	public void alterar(Usuario usuario) throws SQLException, ProcedureException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Usuario usuario) throws SQLException, ProcedureException {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public Usuario consultar(Usuario usuario) throws SQLException, ProcedureException {
		return null;
	}

}

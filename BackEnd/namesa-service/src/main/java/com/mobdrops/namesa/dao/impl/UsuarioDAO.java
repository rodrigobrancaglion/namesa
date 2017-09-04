package com.mobdrops.namesa.dao.impl;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

import com.mobdrops.namesa.dao.IUsuarioDAO;
import com.mobdrops.namesa.dto.Usuario;
import com.mobdrops.namesa.exception.ProcedureException;
import com.mobdrops.namesa.utils.Utils;

@Repository
public class UsuarioDAO implements IUsuarioDAO, Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext
	private EntityManager em;
	
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

	@Override
	public List<Usuario> consultarTodos() throws SQLException, ProcedureException {
		
		StoredProcedureQuery storedProcedure = this.em.createStoredProcedureQuery("dbo.sp_sel_usuario_id");
		storedProcedure.execute();
		
		List<Object[]> usuariosResults = Utils.castList(Object[].class, storedProcedure.getResultList());

		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		for (Object[] obj : usuariosResults) {
			
			Usuario u = new Usuario();
			u.setNome(obj[1].toString());
			usuarios.add(u);
		}

		return usuarios;
	}

}

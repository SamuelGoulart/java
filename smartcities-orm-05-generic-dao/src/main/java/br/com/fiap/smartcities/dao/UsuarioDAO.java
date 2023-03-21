package br.com.fiap.smartcities.dao;

import javax.persistence.EntityManager;

public class UsuarioDAO extends GenericDAO<UsuarioDAO, Integer> {

	public UsuarioDAO(EntityManager em) {
		super(em);
	}

}

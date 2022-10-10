package com.cursojava.curso.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cursojava.curso.entities.WebPage;
@Repository
public class SearchRepositoryImp implements SearchRepository{
	@PersistenceContext 
	EntityManager entity;
	
	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public List<WebPage> search(String textSearch) {
		String query = "FROM WebPage WHERE "
				+ "title like '%"+textSearch+"%'"
						+ " or content like '%"+textSearch+"%'"
								+ " or keyword like '%"+textSearch+"%'";
		return entity.createQuery(query).getResultList();
	}

}

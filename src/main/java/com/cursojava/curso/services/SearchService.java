package com.cursojava.curso.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursojava.curso.entities.WebPage;
import com.cursojava.curso.repositories.SearchRepository;

@Service
public class SearchService {
	@Autowired
	SearchRepository repository;
	
	
	public List<WebPage> search(String query){
				
		return repository.search(query);
	}
}

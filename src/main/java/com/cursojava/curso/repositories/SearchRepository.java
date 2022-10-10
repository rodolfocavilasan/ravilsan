package com.cursojava.curso.repositories;

import java.util.List;

import com.cursojava.curso.entities.WebPage;

public interface SearchRepository {
	List<WebPage> search(String textSearch);
}

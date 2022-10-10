package com.cursojava.curso.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cursojava.curso.entities.WebPage;
import com.cursojava.curso.services.SearchService;

@RestController
public class SearchController {
	@Autowired
	private SearchService service;
	
	@GetMapping(value = "api/search/")
	public List<WebPage> search(@RequestParam Map<String,String> param ) {
		return service.search(param.get("query"));
	}
}

package com.cursojava.curso.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "webpage")
@ToString
@EqualsAndHashCode
@Setter @Getter
public class WebPage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	Long id;
	@Column(name = "url", length = 3000)
	String url;
	@Column(name = "title",length = 3000)
	String title;
	@Column(name = "content", length =5000)
	String content;
	@Column(name = "keyword", length =5000)
	String keyword; 
		
}

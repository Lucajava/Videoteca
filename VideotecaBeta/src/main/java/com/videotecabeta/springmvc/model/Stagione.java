package com.videotecabeta.springmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STAGIONE")
public class Stagione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "NUMERO_PUNTATE", nullable = false)
	private int numero_puntate;
	
	@Column(name = "ANNO_PRODUZIONE", nullable = false)
	private int anno_prod;

}

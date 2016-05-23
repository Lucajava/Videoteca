package com.videotecabeta.springmvc.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "FILM")
public class Film extends ProdCin{

	private int durata;

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

}

package com.videotecabeta.springmvc.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "SERIE_TV")
public class SerieTV extends ProdCin{
	
	private ArrayList<Stagione> lista_stagioni;

	public ArrayList<Stagione> getLista_stagioni() {
		return lista_stagioni;
	}

	public void setLista_stagioni(ArrayList<Stagione> lista_stagioni) {
		this.lista_stagioni = lista_stagioni;
	}
}

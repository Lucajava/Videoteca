package com.videotecabeta.springmvc.model;

import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;


public abstract class ProdCin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Size(min = 3, max = 50)
	@Column(name = "TITOLO", nullable = false)
	private String nome;

	private ArrayList<Attore> list_attori;
	
	private ArrayList<Categoria> list_categorie;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Attore> getList_attori() {
		return list_attori;
	}

	public void setList_attori(ArrayList<Attore> list_attori) {
		this.list_attori = list_attori;
	}

	public ArrayList<Categoria> getList_categorie() {
		return list_categorie;
	}

	public void setList_categorie(ArrayList<Categoria> list_categorie) {
		this.list_categorie = list_categorie;
	}

}

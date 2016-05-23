package com.videotecabeta.springmvc.model;

import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "ATTORE")
public class Attore {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Size(min = 3, max = 50)
	@Column(name = "NOME", nullable = false)
	private String nome;

	@Size(min = 3, max = 50)
	@Column(name = "COGNOME", nullable = false)
	private String cognome;

	@NotNull
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "DATA_DI_NASCITA", nullable = false)
	@Type(type = "org.jadira.usertype.dateandtime.joda.PresistentLocalDate")
	private LocalDate dataDiNascita;

	@Size(min = 3, max = 50)
	@Column(name = "COD_FISC", nullable = false)
	private String cod_fisc;

	private ArrayList<Film> lista_film;

	private ArrayList<SerieTV> lista_serie;

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

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getDataDiNascita() {
		return dataDiNascita;
	}

	public void setDataDiNascita(LocalDate dataDiNascita) {
		this.dataDiNascita = dataDiNascita;
	}

	public String getCod_fisc() {
		return cod_fisc;
	}

	public void setCod_fisc(String cod_fisc) {
		this.cod_fisc = cod_fisc;
	}

	public ArrayList<Film> getLista_film() {
		return lista_film;
	}

	public void setLista_film(ArrayList<Film> lista_film) {
		this.lista_film = lista_film;
	}

	public ArrayList<SerieTV> getLista_serie() {
		return lista_serie;
	}

	public void setLista_serie(ArrayList<SerieTV> lista_serie) {
		this.lista_serie = lista_serie;
	}

}

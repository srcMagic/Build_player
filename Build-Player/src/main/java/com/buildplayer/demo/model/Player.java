package com.buildplayer.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "players")
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "cognome")
	private String cognome;

	@Column(name = "ruolo")
	private String ruolo;

	@Column(name = "squadra")
	private String squadra;

	public Player(int id, String nome, String cognome, String ruolo, String squadra) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.ruolo = ruolo;
		this.squadra = squadra;
	}

	public Player() {
	}

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

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public String getSquadra() {
		return squadra;
	}

	public void setSquadra(String squadra) {
		this.squadra = squadra;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", ruolo=" + ruolo + ", squadra="
				+ squadra + "]";
	}

}

package com.mobdrops.namesa.dto;

public class Cargo {

	private Integer id;
	private String nome;
	private GrupoCargo grupoCargo;
	private Setor setor;
	private Double alvo_plr;
	
	public Cargo(Integer id) {
		super();
		this.id = id;
	}

	public Cargo(Integer id, GrupoCargo grupoCargo, Setor setor, Double alvo_plr) {
		super();
		this.id = id;
		this.grupoCargo = (grupoCargo==null) ? new GrupoCargo(0) : grupoCargo;
		this.setor = (setor==null) ? new Setor(0) : setor;
		this.alvo_plr = alvo_plr;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public GrupoCargo getGrupoCargo() {
		if(grupoCargo==null) grupoCargo=new GrupoCargo(0);
		return grupoCargo;
	}
	public void setGrupoCargo(GrupoCargo grupoCargo) {
		this.grupoCargo = grupoCargo;
	}
	public Setor getSetor() {
		if(setor==null) setor=new Setor(0);
		return setor;
	}
	public void setSetor(Setor setor) {
		this.setor = setor;
	}
	public Double getAlvo_plr() {
		return alvo_plr;
	}
	public void setAlvo_plr(Double alvo_plr) {
		this.alvo_plr = alvo_plr;
	}
	
}

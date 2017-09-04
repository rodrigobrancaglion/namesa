package com.mobdrops.namesa.dto;

public class AvaliacaoUsuario {

	private Integer id;
	private Usuario usuario;
	private Desempenho desempenho;
	private String ano_mes_versao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Desempenho getDesempenho() {
		return desempenho;
	}

	public void setDesempenho(Desempenho desempenho) {
		this.desempenho = desempenho;
	}

	public String getAno_mes_versao() {
		return ano_mes_versao;
	}

	public void setAno_mes_versao(String ano_mes_versao) {
		this.ano_mes_versao = ano_mes_versao;
	}

}

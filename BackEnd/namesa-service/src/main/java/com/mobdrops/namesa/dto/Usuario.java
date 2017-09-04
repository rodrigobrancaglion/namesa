package com.mobdrops.namesa.dto;

import java.time.Instant;

import io.swagger.annotations.ApiModel;

@ApiModel("Entry Usuario")
public class Usuario {

	// @ApiModelProperty(value = "the id of the item", required = true)
	private Integer id;

	// @ApiModelProperty(value = "content", required = true)
	private String nome;
	private String sobrenome;
	private Instant data_admissao;
	private Instant data_demissao;
	// private Cargo cargo;
	// private Legibilidade legibilidade;

	// public Usuario(String nome, String sobrenome, Instant data_admissao,
	// Instant data_demissao,
	// Cargo cargo, Legibilidade legibilidade) {
	// super();
	// this.nome = nome;
	// this.sobrenome = sobrenome;
	// this.data_admissao = data_admissao;
	// this.data_demissao = data_demissao;
	// this.cargo = (cargo==null) ? new Cargo(0) : cargo;
	// this.legibilidade = (legibilidade==null) ? new Legibilidade(0) :
	// legibilidade;
	// }
	public Usuario() {
		super();
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

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Instant getData_admissao() {
		return data_admissao;
	}

	public void setData_admissao(Instant data_admissao) {
		this.data_admissao = data_admissao;
	}

	public Instant getData_demissao() {
		return data_demissao;
	}

	public void setData_demissao(Instant data_demissao) {
		this.data_demissao = data_demissao;
	}
	// public Cargo getCargo() {
	// if(cargo==null) cargo=new Cargo(0);
	// return cargo;
	// }
	// public void setCargo(Cargo cargo) {
	// this.cargo = cargo;
	// }
	// public Legibilidade getLegibilidade() {
	// return legibilidade;
	// }
	// public void setId_legibilidade(Legibilidade legibilidade) {
	// if(legibilidade==null) legibilidade=new Legibilidade(0);
	// this.legibilidade = legibilidade;
	// }

}

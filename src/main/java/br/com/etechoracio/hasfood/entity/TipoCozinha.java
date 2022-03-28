package br.com.etechoracio.hasfood.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TipoCozinha {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_TIPO_COZINHA")
	private Long id;
	
	@Column(name = "TX_NOME")
	private String nome;
	
	@Column(name = "DT_EXCLUSAO")
	private LocalDate exclusao;
	
}

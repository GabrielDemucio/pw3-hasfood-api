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
public class Restaurante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_RESTAURENTE")
	private Long id;
	
	@Column(name = "TX_CNPJ")
	private String cnpj;

	@Column(name = "TX_NOME")
	private String nome;
	
	@Column(name = "TX_DESCRICAO")
	private String descricao;
	
	@Column(name = "DT_APROVACAO")
	private LocalDate aprovacao;
	
	@Column(name = "VLR_ENTREGA")
	private Float entrega;
	
	@Column(name = "NR_TEMPO_MIN_ENTREGA")
	private Integer min_entrega;
	
	@Column(name = "NR_TEMPO_MAX_ENTREGA")
	private Integer max_entrega;
	
	@Column(name = "ID_TIPO_COZINHA")
	private Long tipo_cozinha;
	
}

package br.com.etechoracio.hasfood.entity;

import java.sql.Time;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.etechoracio.hasfood.enums.DiaSemanaEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="TBL_HORARIO_FUNCIONAMENTO")
public class HorarioFuncionamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_HORARIO_FUNCIONAMENTO")
	private Long id_funcionamento;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "TX_DIA_SEMANA")
	private DiaSemanaEnum dia_semana;
	
	@Column(name = "HR_ABERTURA")
	private Time abertura;
	
	@Column(name = "HR_FECHAMENTO")
	private Time fechamento;
	
	@Column(name = "ID_RESTAURANTE")
	private Long id_restaurante;
	
}

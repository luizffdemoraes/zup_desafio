package com.zupchallenge.crm.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 150)
	private String nome;
	
	@Column(nullable = false, unique = true)
	private String email;


	@Column(nullable = false, length=11, unique = true)
	private String cpf;
	
	
	@Column
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate birthDate;
	
	/**
	 
	@PrePersist
	public void prePersist() {
		setBirthDate(LocalDate.now());
	}
	 
	
	 */

	

	
	

}

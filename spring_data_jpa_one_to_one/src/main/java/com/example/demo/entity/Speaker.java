package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name="loki_speaker_one_to_one")

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Speaker {

	@Id
	@Column(name = "speaker_id")
	int id;
	
	@Column(name = "first_name")
	String firstName;
	
	@Column(name = "qualification")
	String qualification;
}

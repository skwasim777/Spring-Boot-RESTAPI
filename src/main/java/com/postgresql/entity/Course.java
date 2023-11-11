package com.postgresql.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="COURSE_DTLS")
public class Course {
	private Integer id;
	private String name;
	private Double price;
}

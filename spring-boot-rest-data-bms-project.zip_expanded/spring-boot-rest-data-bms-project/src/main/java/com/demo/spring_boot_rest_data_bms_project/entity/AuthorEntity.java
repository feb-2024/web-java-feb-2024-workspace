package com.demo.spring_boot_rest_data_bms_project.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name="author_details")
public class AuthorEntity {
	
	@Id
	@Column(name="auth_id")
	private int authId;
	
	@Column(name="auth_firstname")
	private String authFirstName;
	
	@Column(name="auth_lastname")
	private String authLastName;
	
	@OneToMany(mappedBy = "author")
	private List<BookEntity> allBooks;
}

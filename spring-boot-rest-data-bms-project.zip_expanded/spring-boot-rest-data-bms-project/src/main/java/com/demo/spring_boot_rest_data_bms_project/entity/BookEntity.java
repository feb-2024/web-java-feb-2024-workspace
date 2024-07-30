package com.demo.spring_boot_rest_data_bms_project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name="book_details")
public class BookEntity {
	
	@Id
	@Column(name="book_id")
	private int bookId;
	
	@Column(name="book_title")
	private String bookTitle;
	
	@ManyToOne
	@JoinColumn(name="book_author_id")
	private AuthorEntity author;
	
	@Column(name="book_genre")
	private String bookGenre;
	
	@Column(name="book_price")
	private int bookPrice;
	
	@Column(name="book_image_url")
	private String bookImageUrl;

}

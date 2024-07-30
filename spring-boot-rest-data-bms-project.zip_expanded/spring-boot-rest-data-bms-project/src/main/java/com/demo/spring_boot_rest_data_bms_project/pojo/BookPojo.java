package com.demo.spring_boot_rest_data_bms_project.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BookPojo {
	private int bookId;
	private String bookTitle;
	private AuthorPojo author;
	private String bookGenre;
	private int bookPrice;
	private String bookImageUrl;
}

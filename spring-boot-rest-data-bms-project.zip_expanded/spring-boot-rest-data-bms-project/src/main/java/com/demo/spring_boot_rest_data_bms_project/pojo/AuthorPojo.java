package com.demo.spring_boot_rest_data_bms_project.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AuthorPojo {

	private int authId;
	private String authFirstName;
	private String authLastName;
	private List<BookPojo> allBooks;
}

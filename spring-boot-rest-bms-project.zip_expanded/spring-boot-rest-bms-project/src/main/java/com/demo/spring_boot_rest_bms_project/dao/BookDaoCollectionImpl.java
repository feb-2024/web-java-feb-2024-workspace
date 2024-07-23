package com.demo.spring_boot_rest_bms_project.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.spring_boot_rest_bms_project.pojo.BookPojo;

//@Component
@Repository
public class BookDaoCollectionImpl implements BookDao{

	List<BookPojo> bookDataStore;
	
	public BookDaoCollectionImpl() {
		bookDataStore = new ArrayList<>();
		bookDataStore.add(new BookPojo(101, "Harry Potter and the Order of Phoenix", "J.K.Rowling", "Fiction", 350, ""));
		bookDataStore.add(new BookPojo(102, "Harry Potter and the Chamber of Secrets", "J.K.Rowling", "Fiction", 450, ""));
		bookDataStore.add(new BookPojo(103, "Fire Dragon", "Geronimo Stilton", "Comedy", 250, ""));
	}

	@Override
	public List<BookPojo> fetchAllBooks() {
		return bookDataStore;
	}

	@Override
	public List<BookPojo> fetchBookByGenre(String genre) {
		List<BookPojo> allGenreBooks = new ArrayList<>();
		for(BookPojo eachBook: bookDataStore) {
			if(eachBook.getBookGenre().equals(genre)) {
				allGenreBooks.add(eachBook);
			}
		}
		return allGenreBooks;
	}

	@Override
	public BookPojo fetchABook(int bookId) {
		BookPojo fetchedBook = null;
		for(BookPojo eachBook: bookDataStore) {
			if(eachBook.getBookId() == bookId) {
				fetchedBook = eachBook;
				break;
			}
		}
		return fetchedBook;
	}

	@Override
	public void deleteBook(int bookId) {
		for(int i=0;i<bookDataStore.size();i++) {
			if(bookDataStore.get(i).getBookId() == bookId) {
				bookDataStore.remove(i);
				break;
			}
		}
	}

	@Override
	public BookPojo addBook(BookPojo newBook) {
		int newBookId = bookDataStore.get(bookDataStore.size()-1).getBookId() + 1;
		newBook.setBookId(newBookId);
		bookDataStore.add(newBook);
		return newBook;
	}

	@Override
	public BookPojo updateBook(BookPojo updateBook) {
		for(int i=0;i<bookDataStore.size();i++) {
			if(bookDataStore.get(i).getBookId() == updateBook.getBookId()) {
				bookDataStore.set(i, updateBook);
				break;
			}
		}
		return updateBook;
	}
}

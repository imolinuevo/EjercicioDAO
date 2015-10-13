package models.entities;

import java.util.ArrayList;

public class Book {

	private int id;

	private String isbn;

	private ArrayList<Author> authors;

	private ArrayList<Theme> themes;

	public Book(int id, String isbn, ArrayList<Author> authors,
			ArrayList<Theme> themes) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.authors = authors;
		this.themes = themes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public ArrayList<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(ArrayList<Author> authors) {
		this.authors = authors;
	}

	public ArrayList<Theme> getThemes() {
		return themes;
	}

	public void setThemes(ArrayList<Theme> themes) {
		this.themes = themes;
	}

}

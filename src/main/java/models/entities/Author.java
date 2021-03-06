package models.entities;

public class Author {

	private int id;

	private String name;

	private String surname;

	private Contact contact;

	private Style style;

	public Author(int id, String name, String surname, Contact contact,
			Style style) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.contact = contact;
		this.style = style;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Style getStyle() {
		return style;
	}

	public void setStyle(Style style) {
		this.style = style;
	}

}

package edu.pitt.cs;

public class CatImpl implements Cat {

	private int id;
	private String name;
	private boolean isRented;

	public CatImpl(int id, String name) {
		this.id = id;
		this.name = name;
		this.isRented = false;
	}

	public void rentCat() {
		this.isRented = true;
	}

	public void returnCat() {
		this.isRented = false;
	}

	public void renameCat(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public int getId() {
		return this.id;
	}

	public boolean getRented() {
		return this.isRented;
	}

	public String toString() {
		return "ID " + this.id + ". " + this.name;
	}

}
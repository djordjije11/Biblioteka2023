package biblioteka;

import java.util.List;

public class Knjiga {

	private String naslov;
	private long isbn;
	private List<Autor> autori;
	private String izdavac;
	private int izdanje;
	
	public String getNaslov() {
		return naslov;
	}
	public void setNaslov(String naslov) {
		if(naslov == null) {
			throw new NullPointerException("Naslov ne sme biti null");
		}
		if(naslov.isEmpty()) {
			throw new IllegalArgumentException("Naslov ne sme biti prazno");
		}
		this.naslov = naslov;
	}
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		if(isbn <= 0) {
			throw new IllegalArgumentException("ISBN ne sme biti nula ili manji od nule");
		}
		this.isbn = isbn;
	}
	public List<Autor> getAutori() {
		return autori;
	}
	public void setAutori(List<Autor> autori) {
		this.autori = autori;
	}
	public String getIzdavac() {
		return izdavac;
	}
	public void setIzdavac(String izdavac) {
		if(izdavac == null) {
			throw new NullPointerException("Izdavac ne sme biti null");
		}
		if(izdavac.isEmpty()) {
			throw new IllegalArgumentException("Izdavac ne sme biti prazno");
		}
		this.izdavac = izdavac;
	}
	public int getIzdanje() {
		return izdanje;
	}
	public void setIzdanje(int izdanje) {
		if(izdanje < 1) {
			throw new IllegalArgumentException("Izdanje ne sme biti broj manji od 1.");
		}
		this.izdanje = izdanje;
	}
}

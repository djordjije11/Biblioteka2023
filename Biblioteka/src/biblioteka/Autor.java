package biblioteka;

import java.util.Objects;

/**
 * Predstavlja autora knjige.
 * 
 * Autor ima samo ime i prezime, nema identifikator. 
 *  
 * @author djordjije11
 * @since 0.1.0
 *
 */
public class Autor {

	/**
	 * Author's firstname.
	 */
	private String ime;
	/**
	 * Author's lastname.
	 */
	private String prezime;
	
	public Autor() {};
	public Autor(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
	}
	
	/**
	 * Returns author's firstname.
	 * 
	 * @return author's firstname as String.
	 */
	public String getIme() {
		return ime;
	}
	/**
	 * Postavlja vrednost atributa ime.
	 * 
	 * Ime ne sme biti null niti prazan String.
	 * 
	 * @param ime
	 * 
	 * @throws NullPointerException ako se unese null vrednost za ime
	 * @throws IllegalArgumentException ako se unese prazan String za ime
	 */
	public void setIme(String ime) {
		if(ime == null) {
			throw new NullPointerException("Ime ne sme biti null");
		}
		if(ime.isEmpty()) {
			throw new IllegalArgumentException("Ime ne sme biti prazno");
		}
		this.ime = ime;
	}
	/**
	 * Returns author's lastname.
	 * 
	 * @return author's lastname as String.
	 */
	public String getPrezime() {
		return prezime;
	}
	/**
	 * Postavlja vrednost atributa prezime.
	 * 
	 * Prezime ne sme biti null niti prazan String.
	 * 
	 * @param prezime
	 * 
	 * @throws NullPointerException ako se unese null vrednost za prezime
	 * @throws IllegalArgumentException ako se unese prazan String za prezime
	 */
	public void setPrezime(String prezime) {
		if(prezime == null) {
			throw new NullPointerException("Prezime ne sme biti null");
		}
		if(prezime.isEmpty()) {
			throw new IllegalArgumentException("Prezime ne sme biti prazno");
		}
		this.prezime = prezime;
	}
	@Override
	public String toString() {
		return "Autor [ime=" + ime + ", prezime=" + prezime + "]";
	}
	/**
	 * Racuna hash code na osnovu imena i prezimena autora
	 * 
	 * @return hash code izracunat na osnovu imena i prezimena
	 */
	@Override
	public int hashCode() {
		return Objects.hash(ime, prezime);
	}
	/**
	 * Poredi dva autora prema imenu i prezimenu
	 * 
	 * @return 
	 * <ul>
	 * 		<li> true - ako su ime i prezime autora isti </li>
	 * 		<li> false - u suprotnom </li>
	 * </ul?
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Autor other = (Autor) obj;
		return Objects.equals(ime, other.ime) && Objects.equals(prezime, other.prezime);
	}
	
}

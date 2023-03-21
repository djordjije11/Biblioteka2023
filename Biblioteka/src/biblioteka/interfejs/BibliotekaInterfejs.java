package biblioteka.interfejs;

import java.util.List;

import biblioteka.Autor;
import biblioteka.Knjiga;
/**
 * Predstavlja biblioteku u koju se mogu dodati knjige, brisati i pretrazivati
 * 
 * Nacin implementacije linijske strukture sa knjigama zavisi od implementacione klase.
 * 
 * @author djordjije11
 * @since 0.9.0
 *
 */
public interface BibliotekaInterfejs {
	/**
	 * Dodaje knjigu u biblioteku.
	 * Knjiga ne sme biti null niti duplikat - ne sme postojati ista knjiga.
	 * @param knjiga
	 * @throws NullPointerException ako je uneta knjiga null
	 * @throws IllegalArgumentException ako ista knjiga vec postoji u biblioteci
	 */
	public void dodajKnjigu(Knjiga knjiga);
	/**
	 * Brise knjigu iz biblioteke.
	 * 
	 * Ako je uneta knjiga null ili ne postoji u biblioteci, ne desava se nista.
	 * 
	 * @param knjiga
	 */
	public void obrisiKnjigu(Knjiga knjiga);
	public List<Knjiga> vratiSveKnjige();
	public List<Knjiga> pronadjiKnjigu(Autor autor, long isbn, String naslov, String izdavac);
}
package biblioteka;

import java.util.ArrayList;
import java.util.List;

import biblioteka.interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs {
	private List<Knjiga> knjige = new ArrayList();
	
	
	
	//Pravi komentar, pravi kod
	@Override
	public void dodajKnjigu(Knjiga knjiga) {
		if(knjiga == null)
			throw new NullPointerException("Knjiga ne sme biti null");
		if(knjige.contains(knjiga))
			throw new IllegalArgumentException("Knjiga je duplikat");
		knjige.add(knjiga);
	}

	@Override
	public void obrisiKnjigu(Knjiga knjiga) {
		knjige.remove(knjiga);
	}

	@Override
	public List<Knjiga> vratiSveKnjige() {
		return knjige;
	}

	@Override
	public List<Knjiga> pronadjiKnjigu(Autor autor, long isbn, String naslov, String izdavac) {
		if(autor == null && isbn <= 0 && (naslov == null || naslov.equals("")) && (izdavac == null || izdavac == "")) {
			return null;
		}
		List<Knjiga> vraceneKnjige = new ArrayList<>();
		for (Knjiga knjiga : knjige) {
			if(knjiga.getIsbn() == isbn) {
				vraceneKnjige.add(knjiga);
			}
			else if(knjiga.getNaslov().toLowerCase().contains(naslov.toLowerCase())) {
				vraceneKnjige.add(knjiga);
			} else if(knjiga.getIzdavac().equals(izdavac)) {
				vraceneKnjige.add(knjiga);
			} else {
				List<Autor> autori = knjiga.getAutori();
				if (autori.contains(autor)) {
					vraceneKnjige.add(knjiga);
				}
			}
		}
		return vraceneKnjige;
	}

}

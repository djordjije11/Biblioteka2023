package biblioteka;

import java.util.ArrayList;
import java.util.List;

import biblioteka.interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs {
	private List<Knjiga> knjige = new ArrayList();
	
	@Override
	public void dodajKnjigu(Knjiga knjiga) {
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
		if(autor == null) {
			throw new IllegalArgumentException();
		}
		if(isbn <= 0)
			throw new IllegalArgumentException();
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

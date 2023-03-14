package biblioteka.interfejs;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import biblioteka.Knjiga;

public abstract class BibliotekaInterfejsTest {

	protected BibliotekaInterfejs biblioteka;
	
	

	@Test
	void testDodajKnjiguNull() {
		assertThrows(NullPointerException.class, () -> biblioteka.dodajKnjigu(null));
	}
	
	@Test
	void testDodajKnjiguDuplikat() {
		Knjiga k = new Knjiga();
		k.setIsbn(12345);
		biblioteka.dodajKnjigu(k);
		Knjiga knj = new Knjiga();
		knj.setIsbn(12345);
		assertThrows(IllegalArgumentException.class, () -> biblioteka.dodajKnjigu(knj));
	}
	
	@Test
	void testDodajKnjiguSveOk() {
		Knjiga k = new Knjiga();
		k.setIsbn(12345);
		biblioteka.dodajKnjigu(k);
		
		List<Knjiga> knjige = biblioteka.vratiSveKnjige();
		assertEquals(1, knjige.size());
		assertTrue(knjige.contains(k));
	}

	//@Test
	void testObrisiKnjigu() {
		fail("Not yet implemented");
	}

	@Test
	@Timeout(3)
	void testVratiSveKnjige() {
		//ovde npr neka beskonacna while petlja, i nakon 3 sekunde ce stati, puknuti
		//fail("Not yet implemented");
	}

	//@Test
	void testPronadjiKnjigu() {
		fail("Not yet implemented");
	}

}

package biblioteka;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AutorTest {

	Autor a;
	
	@BeforeEach
	void setUp() throws Exception {
		a = new Autor();
	}

	@AfterEach
	void tearDown() throws Exception {
		//a = null;
	}
	
	@Test
	void testSetImeSveOk() {
		a.setIme("Pera");
		assertEquals("Pera", a.getIme());
	}
	
	@Test
	void testSetImeNull() {
		Exception e = assertThrows(NullPointerException.class, () -> a.setIme(null));
		assertEquals("Ime ne sme biti null", e.getMessage());
	}
	
	@Test
	void testSetImePrazanString() {
		assertThrows(IllegalArgumentException.class, () -> a.setIme(""));
	}
	
	@Test
	void testSetPrezimeSveOk() {
		a.setPrezime("Peric");
		assertEquals("Peric", a.getPrezime());
	}
	
	@Test
	void testSetPrezimeNull() {
		Exception e = assertThrows(NullPointerException.class, () -> a.setPrezime(null));
		assertEquals("Prezime ne sme biti null", e.getMessage());
	}
	
	@Test
	void testSetPrezimePrazanString() {
		assertThrows(IllegalArgumentException.class, () -> a.setPrezime(""));
	}
	
	@Test
	@DisplayName("Test za proveru toString metode")
	void testToString() {
		a.setIme("Zika");
		a.setPrezime("Zikic");
		String s = a.toString();
		assertTrue(s.contains("Zika"));
		assertTrue(s.contains("Zikic"));
	}

	
	/*
	@ParameterizedTest
	@CsvSource({
		"Marko, Markovic, Marko, Markovic, true",
		"Marko, Markovic, Petar, Markovic, false",
		"Marko, Markovic, Marko, Petrovic, false",
		"Marko, Markovic, Petar, Petrovic, false"
	})
	*/
	@ParameterizedTest
	@CsvSource(delimiter = '|', textBlock = """
		Marko | Markovic | Marko | Markovic | true
		Marko | Markovic | Petar | Markovic | false
		Marko | Markovic | Marko | Petrovic | false
		Marko | Markovic | Petar | Petrovic | false
	""")
	void testEquals(String ime1, String prezime1, String ime2, String prezime2, boolean isti) {
		a.setIme(ime1);
		a.setPrezime(prezime1);
		Autor b = new Autor(ime2, prezime2);
		assertEquals(isti, a.equals(b));
	}
	
	//@Test
	void test() {
		fail("Not yet implemented");
	}

}

package biblioteka;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
	
	//@Test
	void test() {
		fail("Not yet implemented");
	}

}

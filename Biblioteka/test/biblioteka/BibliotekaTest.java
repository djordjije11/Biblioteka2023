package biblioteka;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import biblioteka.interfejs.BibliotekaInterfejsTest;

public class BibliotekaTest extends BibliotekaInterfejsTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception{
		//otvarao bih bazu ovde
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception{
		//zatvarao bih bazu ovde
	}
	
	@BeforeEach
	void setUp() throws Exception {
		biblioteka = new Biblioteka();
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
}

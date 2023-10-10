import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	private GradeBook g1, g2;

	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		g1.addScore(50);
		g1.addScore(75);
		g2.addScore(40);
		g2.addScore(65);
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}
	
	@Test
	void testGetScoreSize() {
		assertEquals(2, g1.getScoreSize());
		assertEquals(2, g2.getScoreSize());
	}

	@Test
	void testAddScore() {
		assertTrue(g1.toString().equals("50.0 75.0 0.0 0.0 0.0 "));
		assertTrue(g2.toString().equals("40.0 65.0 0.0 0.0 0.0 "));
		assertEquals(2, g1.getScoreSize());
		assertEquals(2, g2.getScoreSize());
	}

	@Test
	void testSum() {
		assertEquals(125, g1.sum(), .0001);
		assertEquals(105, g2.sum(), .0001);
	}

	@Test
	void testMinimum() {
		assertEquals(50, g1.minimum(), .001);
		assertEquals(40, g2.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		assertEquals(75, g1.finalScore(), .0001);
		assertEquals(65, g2.finalScore(), .0001);
	}
	
	@Test
	void testToString() {
		assertTrue(g1.toString().equals("50.0 75.0 0.0 0.0 0.0 "));
		assertTrue(g2.toString().equals("40.0 65.0 0.0 0.0 0.0 "));
	}
	
}
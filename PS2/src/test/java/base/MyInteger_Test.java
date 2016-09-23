package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		MyInteger oddInteger = new MyInteger(9);
		MyInteger evenInteger = new MyInteger(10);
		MyInteger primeInteger = new MyInteger(11);
		MyInteger primeInteger_2 = new MyInteger(2);
		
		assertFalse(oddInteger.isEven());
		assertTrue(oddInteger.isOdd());
		assertFalse(evenInteger.isOdd());
		assertTrue(evenInteger.isEven());
		assertTrue(primeInteger.isPrime());
		assertTrue(primeInteger_2.isPrime());
		assertFalse(evenInteger.isPrime());
		
		assertFalse(oddInteger.isOdd(evenInteger));
		assertTrue(oddInteger.isOdd(oddInteger));
		assertFalse(evenInteger.isEven(oddInteger));
		assertTrue(evenInteger.isEven(evenInteger));
		assertTrue(primeInteger.isPrime(primeInteger));
		assertTrue(primeInteger_2.isPrime(primeInteger_2));
		assertFalse(primeInteger.isPrime(evenInteger));
		
		assertTrue(primeInteger.equals(11));
		assertFalse(primeInteger.equals(13));
		assertTrue(oddInteger.equals(oddInteger));
		assertFalse(oddInteger.equals(evenInteger));
	}

}

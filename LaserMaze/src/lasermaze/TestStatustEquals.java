package lasermaze;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * To test if two Status are equal.
 * @author Jingran
 *
 */
public class TestStatustEquals {

	@Test
	public void testCaseEqual() {
		Status s1 = new Status(1,2,"W");
		Status s2 = new Status(1,2,"W");
		
		boolean result = s1.equals(s2);
		assertEquals(result, true);
	}
	
	@Test
	public void testCaseFalse1(){
		Status s1 = new Status(1,2,"N");
		Status s2 = new Status(1,2,"S");
		boolean result = s1.equals(s2);
		assertEquals(result, false);
	}
	
	@Test
	public void testCaseFasle2(){
		Status s1 = new Status(1, 2, "N");
		Status s2 = new Status(1, 3, "N");
		boolean result = s1.equals(s2);
		assertEquals(result, false);
	}
	
	@Test
	public void testCaseFalse3(){
		Status s1 = new Status(1, 2, "W");
		Status s2 = new Status(2, 3, "w");
		boolean result = s1.equals(s2);
		assertEquals(result, false);
	}
	
	@Test
	public void testCaseFalse4(){
		Status s1 = new Status(1, 2, "W");
		Status s2 = new Status(2, 2, "w");
		boolean result = s1.equals(s2);
		assertEquals(result, false);
	}
	
	
	@Test
	public void testCaseFalse5(){
		Status s1 = new Status(1, 2, "W");
		Status s2 = new Status(2, 2, "w");
		boolean result = s2.equals(s1);
		assertEquals(result, false);
	}

}

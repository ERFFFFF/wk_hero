package jpu2016.hit;

import static org.junit.Assert.*;

import org.junit.Test;

public class HitTest {
	
	private Hit hit;
	public 

	@Test
	public void testGetStrength() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetRange() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTypeHit() {
		fail("Not yet implemented");
	}

	@Test
	public void GivenStrenghOf10WhenCreatingAHitShouldThrowRangeException () {
		 try {
			 new Hit(101, 1, TypeHit.NORMAL);
			 fail("Should throw exception when Strength > 101");
			 } catch (final Exception e) {
			 final String expected = "Strength out of range";
			 assertEquals(expected, e.getMessage());
			 } 
	}



@Test
public void Given20RangeWhendoubLingShoulReturn40() {
	hit = new Hit(1, 20, TypeHit.MAGIC);
	assertEquals(40, hit.doubleRange());
}}

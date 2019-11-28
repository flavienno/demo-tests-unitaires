package dev.utils;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @author fla
 * Réalisation d'une classe de tests unitaires
 * Couvrez un maximum d’exemples (i.e. cas de tests)
 */
public class StringUtilsTest {

	@Test
	public void testLevenshteinDistance1() {
		int resultat = StringUtils.levenshteinDistance("lhs", "rhs");
		assertEquals(1, resultat);
	}

	@Test
	public void testLevenshteinDistance2() {
		int resultat = StringUtils.levenshteinDistance("los", "rhs");
		assertEquals(2, resultat);
	}

	@Test
	public void testLevenshteinDistance3() {
		int resultat = StringUtils.levenshteinDistance("lod", "rhs");
		assertEquals(3, resultat);
	}

	@Test
	public void testLevenshteinDistanceNull() {
		int resultat =StringUtils.levenshteinDistance(null, "rhs");
		assertEquals(0,resultat);
	}
	@Test
	public void testLevenshteinDistanceNull1() {
		int resultat =StringUtils.levenshteinDistance("lhs", null);
		assertEquals(0,resultat);
	}
}

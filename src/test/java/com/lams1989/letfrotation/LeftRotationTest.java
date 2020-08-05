package com.lams1989.letfrotation;

import static org.junit.Assert.assertArrayEquals;

import junit.framework.TestCase;

public class LeftRotationTest extends TestCase {

	public void testLeftRotation() {
		int r = 4;
		int[] v = { 1, 2, 3, 4, 5 };
		int[] actual = LeftRotation.leftRotation(v, r);
		int[] expected = { 5, 1, 2, 3, 4 };
		assertArrayEquals(expected, actual);
	}

	public void testLeftRotation2() {
		int r = 1;
		int[] v = { 56, 45, 78, 76, 89, 98 };
		int[] actual = LeftRotation.leftRotation(v, r);
		int[] expected = { 45, 78, 76, 89, 98, 56};
		assertArrayEquals(expected, actual);
	}

	public void testLeftRotation3() {
		int r = 2;
		int[] v = { 1, 2, 3, 4, 5 };
		int[] actual = LeftRotation.leftRotation(v, r);
		int[] expected = { 3, 4, 5, 1, 2 };
		assertArrayEquals(expected, actual);
	}
}

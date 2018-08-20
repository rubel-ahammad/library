package com.waxtool.lib;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.waxtool.lib.Library;

/*
 * Comment
 */
public class LibraryTest {
	@Test
	public void testSomeLibraryMethod() {
		Library classUnderTest = new Library();
		assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
	}
}

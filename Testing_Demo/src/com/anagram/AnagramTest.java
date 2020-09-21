package com.anagram;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnagramTest {
	static Anagram ana;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	ana=new Anagram();
	}
@Test
	void testIsAnagramNull()
	{
		Assertions.assertFalse(ana.isAnagram(null,"Hey"));
	}
@Test
void testIsAnagram()
{
	Assertions.assertTrue(ana.isAnagram("true", "etru"));
}
@Test
void testIsAnagramLength()
{
	Assertions.assertFalse(ana.isAnagram("Hii you are  the best ", "hiii"));
}
	void testIsNotAnagram()
	{
		Assertions.assertFalse(ana.isAnagram("heyyy", "hellooo"));
	}

}

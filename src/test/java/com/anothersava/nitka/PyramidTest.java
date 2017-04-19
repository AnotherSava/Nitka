package com.anothersava.nitka;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PyramidTest
{
	@Test
	public void checkTestValues()
	{
		Pyramid pyramid = new Pyramid();

		assertEquals(0., pyramid.W(0, 0));

		assertEquals(0.5, pyramid.W(1, 0));
		assertEquals(0.5, pyramid.W(1, 1));

		assertEquals(0.75, pyramid.W(2, 0));
		assertEquals(1.5, pyramid.W(2, 1));
		assertEquals(0.75, pyramid.W(2, 2));

		assertEquals(0.875, pyramid.W(3, 0));
		assertEquals(2.125, pyramid.W(3, 1));
		assertEquals(2.125, pyramid.W(3, 2));
		assertEquals(0.875, pyramid.W(3, 3));

		assertEquals(306.48749781747574, pyramid.W(322, 156));
	}
}

package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import AsocArray.AsocArray;

public class AsocArrayTest {

	private AsocArray array;

	@Test
	public void creacionDelArray()  {
		array = new AsocArray();
		assertEquals(0, array.size());
	}
}

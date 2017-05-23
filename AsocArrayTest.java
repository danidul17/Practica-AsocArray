package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import AsocArray.AsocArray;

public class AsocArrayTest {

	private AsocArray array;

	@Before
	public void before(){
		array = new AsocArray();	
	}
	@Test
	public void creacionDelArray()  {
		array = new AsocArray();
		assertEquals(0, array.size());
	}

}

package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import AsocArray.AsocArray;
import AsocArray.UndefinedKeyException;

public class AsocArrayTest {

	private static final String CLAVE1 = "nombre";
	private static final String VALOR1 = "pepe";
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
	@Test
	public void creacionDelArrayConUnDato() throws UndefinedKeyException  {
		array.put(CLAVE1, VALOR1);
		assertEquals(VALOR1, array.get(CLAVE1));
	}
	

}

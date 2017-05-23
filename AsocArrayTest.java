package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import AsocArray.AsocArray;
import AsocArray.UndefinedKeyException;

public class AsocArrayTest {

	private static final String CLAVE1 = "nombre";
	private static final String VALOR1 = "pepe";
	private static final String CLAVE2 = "apellido";
	private static final String VALOR2 = "gonzales";
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
	@Test
	public void creacionDelArrayConVariosDatos() throws UndefinedKeyException{
	array.put(CLAVE1, VALOR1);
	array.put(CLAVE2, VALOR2);
	assertEquals(VALOR1, array.get(CLAVE1));
	assertEquals(VALOR2, array.get(CLAVE2));
	}
	@Test
	public void anadoValoresYClaves() throws UndefinedKeyException {
			array.put(CLAVE1,VALOR1);
			array.put(CLAVE2,VALOR2);
			assertEquals(VALOR1, array.get(CLAVE1));
			assertEquals(2,array.size());
	}
	@Test(expected = UndefinedKeyException.class)
	public void elevoExcepcionClaveNoEncontrada() throws UndefinedKeyException{
		array.get(CLAVE1);
	}
	@Test
	public void claveNoExiste(){
		assertEquals(false, array.containsKey(CLAVE1));
	}
	@Test
	public void claveexiste() {
		array.put(CLAVE1, VALOR1);	
		assertEquals(true, array.containsKey(CLAVE1));
	}
	


	
	


}

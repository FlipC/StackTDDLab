package ubb.cl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestStackTDD {

	private StackTDD stackTDD;
	
	@Before
	public void setup(){
		stackTDD = new StackTDD();
	}
	
	@Test
	public void StackVacio(){
		
		boolean vacia = stackTDD.estaVacio();
		assertEquals(vacia,(true));

	}
	
	@Test
	public void agregarNumeroTresAStack()throws ExcepcionStack{
		
		stackTDD.AgregarNumero(3);
		boolean vacia= stackTDD.estaVacio();
		assertEquals(vacia,(false));
		
	}
	
	@Test
	public void agregarNumeroUnoYDosAStack()throws ExcepcionStack{
		
		stackTDD.AgregarNumero(1);
		stackTDD.AgregarNumero(2);
		
		boolean vacia = stackTDD.estaVacio();
		
		assertEquals(vacia,(false));
	}




}

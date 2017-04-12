package ubb.cl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestStackTDD {

	private StackTDD stackTDD;
	boolean vacia;
	
	@Before
	public void setup(){
		stackTDD = new StackTDD();
	}
	
	@Test
	public void StackVacio(){
		
		vacia = stackTDD.estaVacio();
		assertEquals(vacia,(true));

	}
	
	@Test
	public void agregarNumeroTresAStack()throws ExcepcionStack{
		
		stackTDD.AgregarNumero(3);
		vacia= stackTDD.estaVacio();
		assertEquals(vacia,(false));
		
	}
	
	@Test
	public void agregarNumeroUnoYDosAStack()throws ExcepcionStack{
		
		stackTDD.AgregarNumero(1);
		stackTDD.AgregarNumero(2);
		
		vacia = stackTDD.estaVacio();
		
		assertEquals(vacia,(false));
	}
	
	@Test
	public void agregaCuatroYCincoYDevuelveStackEnDos()throws ExcepcionStack{
		
		stackTDD.AgregarNumero(4);
		stackTDD.AgregarNumero(5);
		
		int tamanio = stackTDD.devuelveTamanio();
		
		assertEquals(vacia,(false));
	}
	
	@Test
	public void agregarNumerosSeisYSieteHacePopDevuelveSiete()throws ExcepcionStack{
		
		stackTDD.AgregarNumero(6);
		stackTDD.AgregarNumero(7);
		int pop = stackTDD.hacerPop();
		assertEquals(pop,(7));
	}
	
	@Test
	public void agregarNumerosOchoYNueveHacerPopDosVecesDevuelveOchoYNueve() throws ExcepcionStack{
		
		stackTDD.AgregarNumero(8);
		stackTDD.AgregarNumero(9);
		
		int popUno = stackTDD.hacerPop();
		int popDos = stackTDD.hacerPop();
		
		assertEquals(popUno,(9));
		assertEquals(popDos,(8));
		
		
	}






}

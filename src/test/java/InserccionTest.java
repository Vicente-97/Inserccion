package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import main.java.model.Inserccion;

class InserccionTest {

	@Test
	void testOrdenado() {
		Inserccion i1 = new Inserccion();
		List<Integer> ordenados = new ArrayList<Integer>();
		ordenados.add(1);
		ordenados.add(2);
		ordenados.add(6);
		ordenados.add(8);
		ordenados.add(3);
		
		List<Integer> ordenadosBien = new ArrayList<Integer>();
		ordenadosBien.add(1);
		ordenadosBien.add(2);
		ordenadosBien.add(3);
		ordenadosBien.add(6);
		ordenadosBien.add(8);
		
		assertEquals(i1.ordenarNumeros(ordenados),ordenadosBien);
	}

}

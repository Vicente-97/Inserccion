package main.java.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inserccion {
	List<Integer> ordenados = new ArrayList<Integer>();
	
	
	public Inserccion() {
		ordenados.add(1);
		ordenados.add(2);
		ordenados.add(6);
		ordenados.add(8);
		ordenados.add(3);

	}
	
	public List<Integer> ordenarNumeros(List<Integer> ordenados) {
		int num;
		for (int i=0;i<ordenados.size();i++) {
			if(i!=0) {
				if (ordenados.get(i)<ordenados.get(i-1)) {
					num=ordenados.get(i-1);
					ordenados.add(i-1,ordenados.get(i));
					ordenados.remove(i+1);
					ordenados.add(i, num);
					ordenados.remove(i+1);
					i-=2;
				}
			}
			
			
		}
		
		
		return ordenados;
	}

	public List<Integer> getOrdenados() {
		return ordenados;
	}

	public void setOrdenados(List<Integer> ordenados) {
		this.ordenados = ordenados;
	}

}

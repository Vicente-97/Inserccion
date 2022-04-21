package main.java.main;

import java.util.ArrayList;
import java.util.List;

import main.java.model.Inserccion;

public class MainApp {

	public MainApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Inserccion i1 = new Inserccion();
		List<Integer> ordenados = new ArrayList<Integer>();
		ordenados.add(1);
		ordenados.add(2);
		ordenados.add(6);
		ordenados.add(8);
		ordenados.add(3);
		
		System.out.println(i1.ordenarNumeros(ordenados));
		
	}

}

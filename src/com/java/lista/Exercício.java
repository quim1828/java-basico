package com.java.lista;

import java.util.ArrayList;
import java.util.List;
import outra.Sub;

public class Exercício {
	
	public static void main(String[] args) {
		
		int i = 0;
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		for ( Integer x : list ) {
			System.out.print(x + " ");
		}
		
	}
}
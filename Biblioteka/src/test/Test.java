package test;

import biblioteka.Autor;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Autor a = new Autor();
		a.setIme("Pera");
		a.setIme("Peric");
		Autor b = new Autor();
		b.setIme("Pera");
		b.setIme("Peric");
		System.out.println(a == b);
		System.out.println(a.hashCode() == b.hashCode());
	}

}

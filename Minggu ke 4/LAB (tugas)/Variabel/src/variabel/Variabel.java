/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variabel;

/**
 *
 * @author PC
 */
public class Variabel {

	private int a;
	private boolean menikah;
	private char _nama;
	public static final String JUDUL = "Belajar Java Yuks";
	public static String judul2 = "Belajar Java Yuks";
	
	public static void main(String[] args){
		Variabel var = new Variabel();
		final int a = 12;
		
		var.a = 1;
		//a = 11; -> tidak bisa dilakukan
		double aa, b, c;
		String nama = "nama saya";
		byte bb = 1, B = 2;
		System.out.println(JUDUL);
		System.out.println(judul2);
	}

	public void tesVariabel(){
		System.out.println(a);
		System.out.println(menikah);
		System.out.println(JUDUL);
		System.out.println(judul2);
	}
}

class AksesVariabelStatic {	
	public void AksesVariabelStatic(){
		System.out.println(Variabel.JUDUL);
		// Variabel.JUDUL = "Belajar hal lain" -> tidak bisa dilakukan
	}
}	
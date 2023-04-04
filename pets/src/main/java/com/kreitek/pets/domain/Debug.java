
package com.kreitek.pets.domain;



public class Debug {
	
	private static String debug;
	
	
	
	public void debug(String string) {
	
		System.out.print("[debug]");
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Debug debug1=new Debug();
		int contador = 0;
		contador++;
		
		debug1.debug(debug);
		System.out.print("[contador]" + contador);
	}
	

}

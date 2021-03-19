package Praktikum1;

import Latihan4.Bus3;

public class UjiBus {
public static void main(String[] abc) {
		
		Bus Bus = new Bus(1000);
		Bus.addpenumpang(40);
		Bus.cetakpenumpang();
		
		//GAP
		System.out.println("");
		Bus.getpenumpang(30);
		Bus.cetakpenumpang();
		
		//GAP
		System.out.println("");
		
		//tambah berat penumpang
		Bus.addpenumpang(50);
		Bus.cetakpenumpang();
		
		//GAP
		System.out.println("");
				
		//tambah berat penumpang
		Bus.addpenumpang(40);
		Bus.cetakpenumpang();
		
		//GAP
		System.out.println("");
						
		//tambah berat penumpang
		Bus.addpenumpang(74);
		Bus.cetakpenumpang();
				
		//GAP
		System.out.println("");
						
		//tambah berat penumpang
		Bus.addpenumpang(67);
		Bus.cetakpenumpang();
				
		//GAP
		System.out.println("");
						
		//tambah berat penumpang
		Bus.addpenumpang(78);
		Bus.cetakpenumpang();
				
				
		
	
		System.out.println("Berat rata rata penumpang adalah = " + Bus.getAverage());
				
		
		
		
	}
}

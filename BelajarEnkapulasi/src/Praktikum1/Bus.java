package Praktikum1;

public class Bus {
	public double penumpang, maxpenumpang;
	private int counter;
	public double tambahanPenumpang;
	
	
	//konstruktor
	public Bus(int maxpenumpang) {
		this.maxpenumpang = maxpenumpang;
	}

	//mutator
	public void addpenumpang(int penumpang) {
		double temp;
		temp = this.penumpang+penumpang;
		if(temp>maxpenumpang) {
			System.out.println("jumlah penumpang melebihi kuota");
		}else {this.penumpang=temp;
		counter++;}
	
	}
	public void getpenumpang(int password) {
		if(password==24) {
			System.out.println("Password benar!");
		}else {
			System.out.println("Maaf,password salah!");}
			
		}
		public double getAverage() {
		double average = penumpang/counter;
		return average;
	}
		public void cetakpenumpang()
		{	
			System.out.println("berat penumpang bus sekarang = " + penumpang);
			System.out.println("berat penumpang bus max seharusnya adalah = " + maxpenumpang);
		}
		
		}
	
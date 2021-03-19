package Latihan4;

public class Bus3 {
	public int penumpang, maxpenumpang;
	
	public Bus3(int maxpenumpang) {
		this.maxpenumpang = maxpenumpang;
	}

	//mutator
	public void addpenumpang(int penumpang) {
		int temp;
		temp = this.penumpang+penumpang;
		if(temp>maxpenumpang) {
			System.out.println("jumlah penumpang melebihi kuota");
		}else {this.penumpang=temp;}
	
	}
	public void getpenumpang(int password) {
		if(password==24) {
			System.out.println("Password benar!");
		}else {
			System.out.println("Maaf,password salah!");}
			
		}
		public void cetakpenumpang()
		{	
			System.out.println("penumpang bus sekarang = " + penumpang);
			System.out.println("penumpang bus yang seharusnya adalah = " + maxpenumpang);
		}
		
		}
	

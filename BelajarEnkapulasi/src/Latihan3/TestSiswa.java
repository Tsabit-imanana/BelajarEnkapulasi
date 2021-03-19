package Latihan3;

public class TestSiswa {
	public static void main(String args[]){
		EncapSiswa siswa = new EncapSiswa();
		siswa.setName("Tsabit");
		siswa.setAge(16);
		siswa.getAdress("Jombang");
		
		System.out.print("Name : " + siswa.getname()
		+ "\n Absen : " + siswa.getAbsen()+
		"\n adresss : " + siswa.GetAddress()+("\n"));
	}

}

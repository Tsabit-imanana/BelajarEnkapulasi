package Latihan3;

public class EncapSiswa {
	private String name;
	private String address;
	private int absen;
	
	public int getAbsen() {
		return absen;
	}	
	public String getname(){
		return name;
	}
	public String GetAddress() {
		return address;
	}
	public void setAge(int newAbsen) {
		absen = newAbsen;
	}
	public void getAdress(String newAddress) {
		address = newAddress;
	}	
	public void setName(String newName) {
		name = newName;
	}
}
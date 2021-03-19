package Praktikum2;

public class Bola {
		double r;
		
		
	public void setJarijari(double Jarijari) {
	this.r =Jarijari;
	}
	public void showDiameter() {
	double res= this.r*2;
	}
	public void showLuaspermukaan() {
	double res = 4* Math.PI*r;
	System.out.println("Luas Permukaan = " + res +" Persegi");
	}
	public void showVolume() {
	double res = (4/3)*Math.PI*(r*r*r);
	System.out.println("volume = " + res +" kubik");
	}
	
	
	
}

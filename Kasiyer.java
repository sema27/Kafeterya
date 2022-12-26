import java.util.Scanner;

public class Kasiyer {
	int secim;
	double fiyat;
	Kasa kasa = new Kasa();
	public Kasiyer() {
		
	}
	
	public Kasiyer(String isim) {
		Kasa kasa = new Kasa(isim);
	}
	
	public void isVakti() {
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Seciminizi Giriniz");
		secim = scan.nextInt();
		if(secim != 5) {
        	System.out.println("Fiyat Giriniz");
		fiyat = scan.nextDouble();
		kasa.hesapla(secim, fiyat);
		isVakti();
		
        }
		else {
			kasa.fisYazdir();
			System.exit(0);
		}
        
	}
}

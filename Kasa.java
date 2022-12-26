
public class Kasa {
	int toplamSatis;
	double gunlukKar;
	double salataKar;
	int tatliSayisi;
	int salataSayisi=0;
	double kar =0;
	int pizzaSayisi;
	int hamburgerSayisi;
	
	public Kasa() {
		System.out.println("Hoşgeldin");
	}
	public Kasa(String isim) {
		System.out.println("Hogeldin "+isim);
	}
	
	 private void gunlukKrHesapla(int secim, double fiyat) {
		 switch(secim) {
		 case 1:
			 salataSayisi++;
			 kar=fiyat*0.3;
			 salataKari(kar);
			 break;
		 case 2:
			 kar=fiyat*0.25;
			 break;
		 case 3:
			 kar=fiyat*0.35;
			 break;
		 case 4:
			 kar=fiyat*0.2;
			 tatliSayisiArttir();
			 break;
			 
		 }
		 gunlukKar+=kar;
	 }
	
	public void hesapla (int secim, double fiyat) {
		gunlukKrHesapla(secim,fiyat);
		topSatHesapla(fiyat);

	}

	 private void topSatHesapla(double fiyat) {
		 toplamSatis+=fiyat;
	}

	

	 private void salataKari(double kar) {
		 salataKar+=kar;
	 }

	 private void tatliSayisiArttir() {
		 tatliSayisi+=1;
	 }

	 public void fisYazdir() {
		 System.out.println("Toplam Satış Miktarı :"+toplamSatis);
		 System.out.println("Günlük Kar Miktarı :"+gunlukKar);
		 System.out.println("Ortalama Salata Karı :"+salataKar);
		 System.out.println("Tatlı Sayısı :"+tatliSayisi);
		 
	 }

}

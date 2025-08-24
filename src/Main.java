
public class Main {
	public static void main(String[] args) {
		IMuhendis bilgisayarMühendisi = 
				new BilgisayarMühendisi("Faik","Aktaş",2,3500,new String[] {"C#", "C++", "Java"});
		
		IMuhendis makineMühendisi = new MakineMühendisi("Bilal","Çamur",4,5000,new String[] {"C","C++"});
	
		System.out.println("BİLGİSAYAR MÜHENDİSİ");
		muhendisBilgileriYazdir(bilgisayarMühendisi);
		System.out.println("**************************");
		System.out.println("MAKİNE MÜHENDİSİ");
		System.out.println(makineMühendisi);
	}
	
	public static void muhendisBilgileriYazdir(IMuhendis mühendis) {
		mühendis.askerlikYapildimi(true);
		mühendis.bilgileriYazdir();
	}
}

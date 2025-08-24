
public class MakineMühendisi extends BaseMuhendis implements IMuhendis{
	public MakineMühendisi() {
		
	}
	
	public MakineMühendisi(String isim, String soyİsim, int tecrube, double maas, String[] diller) {
		setIsim(isim);
		setSoyİsim(soyİsim);
		setTecrube(tecrube);
		setMaas(maas);
		setDiller(diller)  ;
	}
	
	@Override
	public void bilgileriYazdir() {
		System.out.println("İsim: "+ getIsim());
		System.out.println("Soyisim: "+getSoyİsim());
		System.out.println("Tecrübe: "+getTecrube());
		System.out.println("Maaş: "+getMaas());
		System.out.print("Diller: ");
		for(String dil:getDiller()) {
			System.out.println(dil + " ,");
		}
	}

	@Override
	public void askerlikYapildimi(boolean deger) {
		if(deger) {
			setAskerlikDurum("Askerlik yapildi");
		}else {
			setAskerlikDurum("Askerlik  yapilmadi");
		}
	}
	
}


public class BasitDusman extends Dusman{

	private BasitDusman2D karakter2d;
	
	public BasitDusman(int x, int y, int can) {
		super(x,y,can);
		karakter2d = new DusmanFabrikasi().getBasitDusman();
	}
	
	@Override
	public void hareketEttir(int deger) {
		// TODO Auto-generated method stub
		// deðere göre ve hareket mekanizmasýna göre x ve y 
		// deðiþiyor
		karakter2d.animasyon();
	}

	@Override
	public void ciz() {
		// TODO Auto-generated method stub
		karakter2d.ciz();
		karakter2d.animasyon();
	}

}

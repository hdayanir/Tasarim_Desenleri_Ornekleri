
public class BasitDusman2D {

	// Düþmanýn görseline ait bellekte yer kaplayýcý alt alanlar
	
	private static BasitDusman2D instance = new BasitDusman2D();
	
	private BasitDusman2D() {
		// ilklemeler
	}
	
	public static BasitDusman2D getInstance() {
		return instance;
	}
	
	public void ciz() {
		// çizim iþlemleri
	}
	
	public void animasyon() {
		// animasyon iþlemleri
	}
	
}


public class DusmanOrdusu {

	private Dusman[] dusmanlar;
	
	public DusmanOrdusu() {
		dusmanlar = new Dusman[5];
		dusmanlar[0] = new BasitDusman(10, 5, 100);
		dusmanlar[0] = new BasitDusman(20, 5, 100);
		dusmanlar[0] = new BasitDusman(30, 5, 100);
		dusmanlar[0] = new ZekiDusman(100, 15, 100);
		dusmanlar[0] = new ZekiDusman(200, 50, 100);
	}
}

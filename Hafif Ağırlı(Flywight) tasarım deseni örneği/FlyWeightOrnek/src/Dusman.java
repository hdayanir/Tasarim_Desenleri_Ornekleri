
public abstract class Dusman {
	protected int x;
	protected int y;
	protected int can;
	
	public Dusman(int x, int y, int can) {
		this.x = x;
		this.y = y;
		this.can = can;
	}
	
	public abstract void hareketEttir(int deger);
	
	public abstract void ciz();

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getCan() {
		return can;
	}

	public void setCan(int can) {
		this.can = can;
	}
	
	
}

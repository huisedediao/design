package 策略模式;

public class Shoes extends Goods {
	
	public Shoes() {
		sale = new OffSale();
	}
	
}

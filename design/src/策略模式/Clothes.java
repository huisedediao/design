package 策略模式;

public class Clothes extends Goods {
	
	public Clothes() {
		sale = new PresentSale();
	}
	
}

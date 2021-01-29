package 策略模式;

public class NewShoes extends Goods {
	
	public NewShoes() {
		sale = new DefaultSale();
	}
	
}

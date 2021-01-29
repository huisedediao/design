package 策略模式;

public class PresentSale implements Sale {

	@Override
	public void sales() {
		System.out.println("买就送一部iPhone 12!!!");
	}
	
}

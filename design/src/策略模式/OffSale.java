package 策略模式;

public class OffSale implements Sale {

	@Override
	public void sales() {
		System.out.println("打骨折促销！！");
	}
	
}

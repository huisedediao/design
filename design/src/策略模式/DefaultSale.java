package 策略模式;

public class DefaultSale implements Sale {

	@Override
	public void sales() {
		System.out.println("不促销哦~~");
	}

}

package 策略模式;

public class Goods {
	
	Sale sale;
	
	protected void updateSale(Sale newSale) {
		sale = newSale;
	}
	
	protected void salesPromotion() {
		sale.sales();
	}
	
}

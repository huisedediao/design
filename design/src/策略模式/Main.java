package 策略模式;

public class Main {

	public static void main(String[] args) {

		System.out.println("———————————————————去年的库存赶紧卖———————————————————\n");
		Clothes clothes = new Clothes();
		clothes.salesPromotion();

		Shoes shoes = new Shoes();
		shoes.salesPromotion();

		System.out.println("\n\n———————————————————上新———————————————————\n");
		NewColthes newColthes = new NewColthes();
		newColthes.salesPromotion();
		
		NewShoes newShoes = new NewShoes();
		newShoes.salesPromotion();
		

		System.out.println("\n\n———————————————————新品打折———————————————————\n");
		newColthes.updateSale(new OffSale());
		newColthes.salesPromotion();
		newShoes.updateSale(new PresentSale());
		newShoes.salesPromotion();
		
		System.out.println("\n\n———————————————————店铺要倒闭了———————————————————\n");
		
		TwentyOff twentyOff = new TwentyOff();
		clothes.updateSale(twentyOff);
		shoes.updateSale(twentyOff);
		newColthes.updateSale(twentyOff);
		newShoes.updateSale(twentyOff);
		clothes.salesPromotion();
		shoes.salesPromotion();
		newColthes.salesPromotion();
		newShoes.salesPromotion();
	}

}

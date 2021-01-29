package 策略模式;

public class TwentyOff implements Sale {

	@Override
	public void sales() {
		System.out.println("老板和小姨子跑路了，全场2块，全场2块！");
	}
	
}

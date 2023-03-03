package theSecondwork;

public class ShowLogicErrors {
	public static void main(String[] args) {
		System.out.print("Celsuis 35 is Fahrenheit degree ");
		//逻辑错误：System.out.println((9 / 5) * 35 + 32);
		System.out.println((9.0 / 5) * 35 + 32);
	}
}

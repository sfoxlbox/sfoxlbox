package abstration;

public class Motor implements Car {

	public void carShape() {
		System.out.println("this is a Motor");
	}
	public void start() {
		System.out.println("Lets start");
	}
	public void stop() {
		System.out.println("Need Brakes");
	}
}

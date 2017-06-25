package number2;

public class Car extends Vehicle {
	private int loader;

	public int getLoader() {
		return loader;
	}

	public void setLoader(int loader) {
		this.loader = loader;
	}

	public Car(String brand, String color, int loader) {
		super(brand, color);
		this.loader = loader;
	}

	@Override
	public void run() {
		System.out.println("这辆车的速度一般");
	}

}

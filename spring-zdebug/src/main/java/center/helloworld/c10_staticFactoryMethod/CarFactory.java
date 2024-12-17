package center.helloworld.c10_staticFactoryMethod;

/**
 * @author zhishun.cai
 * @date 2024/12/4
 */
public class CarFactory {
	public static Car createCar(String model) {
		Car car = new Car();
		car.setModel(model);
		return car;
	}
}

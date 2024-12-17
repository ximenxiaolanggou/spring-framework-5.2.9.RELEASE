package center.helloworld.c11_instanceFactoryMethod;

/**
 * @author zhishun.cai
 * @date 2024/12/4
 */
public class MobileFactory {

	public Mobile createMobile(String brand) {
		Mobile mobile = new Mobile();
		mobile.setBrand(brand);
		return mobile;
	}
}

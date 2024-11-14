package center.helloworld.c3_propertyEditor;

/**
 * @author zhishun.cai
 * @date 2024/11/14
 */
public class Customer {


	private String name;

	private Address address;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer{" +
				"name='" + name + '\'' +
				", address=" + address +
				'}';
	}
}

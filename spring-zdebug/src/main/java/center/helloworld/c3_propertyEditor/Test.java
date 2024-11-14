package center.helloworld.c3_propertyEditor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhishun.cai
 * @date 2024/11/14
 */
public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("c3_property-editor.xml");
		Customer customer = context.getBean(Customer.class);
		System.out.println(customer);
	}
}

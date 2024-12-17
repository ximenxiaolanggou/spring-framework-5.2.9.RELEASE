package center.helloworld.c11_instanceFactoryMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhishun.cai
 * @date 2024/12/4
 */
public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("c11_instanceFactoryMethod.xml");
		Object bean = ac.getBean("mobile");
		System.out.println(bean);
	}
}

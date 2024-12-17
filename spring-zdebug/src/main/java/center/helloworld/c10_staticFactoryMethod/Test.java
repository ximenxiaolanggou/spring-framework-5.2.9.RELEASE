package center.helloworld.c10_staticFactoryMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhishun.cai
 * @date 2024/12/4
 */
public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("c10_staticFactoryMethod.xml");
		Object bean = ac.getBean("car");
		System.out.println(bean);
	}
}

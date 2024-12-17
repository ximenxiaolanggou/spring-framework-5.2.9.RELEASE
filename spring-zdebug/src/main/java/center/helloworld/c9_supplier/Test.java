package center.helloworld.c9_supplier;

import center.helloworld.c8_resolveBeforeInstantiation.BeforeInstantiation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhishun.cai
 * @create 2023/5/18
 * @note
 */
public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("c9_supplier.xml");
		Object bean = ac.getBean("dog");
		System.out.println(bean);
	}
}

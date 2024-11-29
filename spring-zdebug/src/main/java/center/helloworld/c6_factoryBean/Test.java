package center.helloworld.c6_factoryBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhishun.cai
 * @date 2024/11/22
 */
public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("c6_factoryBean.xml");
		Object bean = context.getBean("myFactoryBean");
		System.out.println(bean);

		bean = context.getBean("&myFactoryBean");
		System.out.println(bean);
	}
}

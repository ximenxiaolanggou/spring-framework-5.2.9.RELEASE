package center.helloworld.c7_lookupMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhishun.cai
 * @date 2024/11/22
 */
public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("c7_lookupMethod.xml");
		SingletonBean bean = (SingletonBean) context.getBean("singletonBean");
		System.out.println(bean);

		PrototypeBean prototypeBean = bean.getPrototypeBean();
		System.out.println(prototypeBean);

		prototypeBean = bean.getPrototypeBean();
		System.out.println(prototypeBean);

	}
}

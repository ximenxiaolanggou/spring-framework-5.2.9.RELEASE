package center.helloworld.c12_autowireConstruct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhishun.cai
 * @date 2024/12/4
 */
public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("c12_autowireConstruct.xml");
		Object bean = ac.getBean("bird");
		System.out.println(bean);
	}
}

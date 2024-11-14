package center.helloworld.c5_beanFactoryPostProcessor;

import center.helloworld.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhishun.cai
 * @date 2024/11/11
 */
public class Test {

	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext("c5_beanFactoryPostProcessor.xml");

	}
}

package center.helloworld.c5_beanFactoryPostProcessor;

import org.springframework.context.ApplicationContext;

/**
 * @author zhishun.cai
 * @date 2024/11/11
 */
public class Test {

	public static void main(String[] args) {
		ApplicationContext context =
				new MyClassPathXmlApplicationContext("c5_beanFactoryPostProcessor.xml");

	}
}

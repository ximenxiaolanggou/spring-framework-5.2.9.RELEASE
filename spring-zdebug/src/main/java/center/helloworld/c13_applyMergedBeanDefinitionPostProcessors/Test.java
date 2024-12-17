package center.helloworld.c13_applyMergedBeanDefinitionPostProcessors;

import center.helloworld.entity.b1.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhishun.cai
 * @create 2023/5/18
 * @note
 */
public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("c13_applyMergedBeanDefinitionPostProcessors.xml");
	}
}

package center.helloworld.c14_circularReferences;

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
		ApplicationContext ac = new ClassPathXmlApplicationContext("c14_circularReferences.xml");
		A a = (A) ac.getBean("a");
		System.out.println(a);
	}
}

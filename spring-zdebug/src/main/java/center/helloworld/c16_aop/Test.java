package center.helloworld.c16_aop;

import center.helloworld.entity.b1.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhishun.cai
 * @create 2023/5/18
 * @note
 */
public class Test {

	public static void main(String[] args) throws NoSuchMethodException {
		ApplicationContext ac = new ClassPathXmlApplicationContext("c16_aop.xml");
		MyCalculator bean = ac.getBean(MyCalculator.class);
		Integer res = bean.add(1, 2);
		System.out.println(res);
	}
}

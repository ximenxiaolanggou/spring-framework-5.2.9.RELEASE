package center.helloworld;

import center.helloworld.entity.b1.Student;
import center.helloworld.entity.b2.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhishun.cai
 * @create 2023/5/18
 * @note
 */
public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("test.xml");
		Student student = (Student) ac.getBean("student");
		System.out.println(student);
	}
}

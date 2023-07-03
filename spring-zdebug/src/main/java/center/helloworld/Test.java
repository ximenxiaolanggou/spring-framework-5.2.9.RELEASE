package center.helloworld;

import center.helloworld.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * @author zhishun.cai
 * @create 2023/5/18
 * @note
 */
public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("test.xml");
		User user = ac.getBean(User.class);
		System.out.println(user);
	}
}

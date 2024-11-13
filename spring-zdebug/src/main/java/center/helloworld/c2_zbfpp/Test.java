package center.helloworld.c2_zbfpp;

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
				new ClassPathXmlApplicationContext("c1_spring-${username}.xml");

		User user = context.getBean(User.class);
		System.out.println(user);

	}
}

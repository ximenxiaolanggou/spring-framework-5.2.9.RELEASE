package center.helloworld.c1_ReadXml;

import center.helloworld.entity.b2.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author zhishun.cai
 * @date 2024/11/11
 */
public class C2_ConfigLocation {


	public static void main(String[] args) throws IOException {
		// 这里的属性是我电脑名称 - Damon
		Object username = System.getenv().get("USERNAME");
		System.out.println(username);

		/**
		 * c1_spring-${username}.xml -> c1_spring-damon.xml
		 */
		ApplicationContext context =
				new ClassPathXmlApplicationContext("c1_spring-${username}.xml");

		User user = context.getBean(User.class);
		System.out.println(user);
	}
}

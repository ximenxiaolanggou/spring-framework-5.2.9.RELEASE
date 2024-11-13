package center.helloworld.c2_initPropertySources;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhishun.cai
 * @date 2024/11/12
 */
public class C1_InitPropertySources {

	public static void main(String[] args) {
		MyClassPathXmlApplicationContext context =
				new MyClassPathXmlApplicationContext("spring.xml");
	}
}

package center.helloworld.initpropertysources;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhishun.cai
 * @create 2023/5/23
 * @note
 */
public class Test {

	public static void main(String[] args) {
		MyClassPathXmlApplicationContext ac = new MyClassPathXmlApplicationContext("test.xml");
		System.out.println();
	}
}

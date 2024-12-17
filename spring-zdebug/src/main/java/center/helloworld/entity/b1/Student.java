package center.helloworld.entity.b1;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zhishun.cai
 * @date 2024/11/19
 */
public class Student {

	private String name;

	public static Object getO() {
		return new Object();
	}


	public Student() {

	}

	public Student(String name) {
		this.name = name;
	}
}

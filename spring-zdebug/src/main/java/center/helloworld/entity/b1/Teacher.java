package center.helloworld.entity.b1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 * @author zhishun.cai
 * @date 2024/11/15
 */
@Component
@ComponentScan(basePackages = {"center.helloworld.entity.b2"})
@Import(Student.class)
public class Teacher {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

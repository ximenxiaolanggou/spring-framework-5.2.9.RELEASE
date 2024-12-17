package center.helloworld.c12_autowireConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author zhishun.cai
 * @date 2024/12/4
 */
@Component
public class Bird {

	private String name = "小黄";

	private Ant ant;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Autowired
	public Bird(Ant ant) {
		this.ant = ant;
	}
}

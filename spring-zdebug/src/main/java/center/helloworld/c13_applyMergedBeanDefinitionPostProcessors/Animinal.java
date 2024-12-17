package center.helloworld.c13_applyMergedBeanDefinitionPostProcessors;

import javax.annotation.PostConstruct;

/**
 * @author zhishun.cai
 * @date 2024/12/5
 */
public class Animinal {

	@PostConstruct
	public void init1() {
		System.out.println("Animinal post construct");
	}
}

package center.helloworld.c13_applyMergedBeanDefinitionPostProcessors;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author zhishun.cai
 * @date 2024/12/4
 */
@Component
public class Fish extends Animinal {

	@PostConstruct
	public void init() {
		System.out.println("Fish init");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Fish destroy");
	}
}

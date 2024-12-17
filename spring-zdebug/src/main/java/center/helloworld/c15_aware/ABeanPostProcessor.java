package center.helloworld.c15_aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author zhishun.cai
 * @date 2024/12/5
 */
public class ABeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("A ~~~~");
		return null;
	}
}

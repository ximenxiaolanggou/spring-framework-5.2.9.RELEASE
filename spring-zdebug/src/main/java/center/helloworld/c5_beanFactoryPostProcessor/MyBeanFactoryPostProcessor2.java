package center.helloworld.c5_beanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author zhishun.cai
 * @create 2023/7/10
 * @note
 */
public class MyBeanFactoryPostProcessor2 implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("----------MyBeanFactoryPostProcessor2----------");
	}
}

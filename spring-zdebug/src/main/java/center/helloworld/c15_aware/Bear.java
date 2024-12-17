package center.helloworld.c15_aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * @author zhishun.cai
 * @date 2024/12/5
 */
public class Bear implements BeanFactoryAware {

	private BeanFactory beanFactory;

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
		System.out.println(beanFactory.getClass().getName());
	}

	public void init() {
		System.out.println("init ~~~");
	}
}

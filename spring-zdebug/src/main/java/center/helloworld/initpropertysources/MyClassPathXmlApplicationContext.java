package center.helloworld.initpropertysources;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhishun.cai
 * @create 2023/5/23
 * @note
 */
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

	public MyClassPathXmlApplicationContext(String ...configLocations) {
		super(configLocations);
	}

	@Override
	protected void initPropertySources() {
		System.out.println("MyClassPathXmlApplicationContext ~~~");
		getEnvironment().setRequiredProperties("dmaoncai");
	}

	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		super.customizeBeanFactory(beanFactory);
		beanFactory.setParentBeanFactory(null);
	}
}

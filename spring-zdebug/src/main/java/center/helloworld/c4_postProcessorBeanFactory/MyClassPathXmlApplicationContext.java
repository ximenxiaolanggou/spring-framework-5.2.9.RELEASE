package center.helloworld.c4_postProcessorBeanFactory;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 重写refresh方法中的postProcessBeanFactory方法
 * @author zhishun.cai
 * @date 2024/11/12
 */
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {


	public MyClassPathXmlApplicationContext(String... configLocation) {
		super(configLocation);
	}

	@Override
	protected void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
		super.postProcessBeanFactory(beanFactory);
		System.out.println("自定义postProcessBeanFactory执行了~~");
	}
}

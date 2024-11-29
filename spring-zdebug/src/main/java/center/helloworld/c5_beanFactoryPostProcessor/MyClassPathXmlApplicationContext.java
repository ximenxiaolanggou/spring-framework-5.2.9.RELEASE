package center.helloworld.c5_beanFactoryPostProcessor;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
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
		// 这里也可以添加BeanFactoryPostProcessor实现类
		System.out.println("自定义postProcessBeanFactory执行了~~");
	}

	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		super.customizeBeanFactory(beanFactory);

		// 方式1. 只有这种方式才能在PostProcessorRegistrationDelegate.invokeBeanFactoryPostProcessors(beanFactory, getBeanFactoryPostProcessors());
		// getBeanFactoryPostProcessors() 方法返回集合中包含MyBeanFactoryPostProcessor2该对象
		// 可以这么理解，getBeanFactoryPostProcessors()获取的集合都是非spring管理的，自己设置进去的
		// 比如说下面方式2和配置文件的方式定义那么该方法返回值中就不会包含这些对象
		super.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor2());

		// 方式2.
//		beanFactory.registerBeanDefinition("bfpp2", new RootBeanDefinition(MyBeanFactoryPostProcessor2.class));
	}
}

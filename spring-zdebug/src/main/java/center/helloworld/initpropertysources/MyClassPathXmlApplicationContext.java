package center.helloworld.initpropertysources;

import center.helloworld.c5_beanFactoryPostProcessor.MyBeanFactoryPostProcessor;
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
//		getEnvironment().setRequiredProperties("dmaoncai");
	}

	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		System.out.println("customizeBeanFactory ~~");
		super.customizeBeanFactory(beanFactory);
		 // 添加自定义的BeanFactoryPostProcessor有两种方式，第一种就是下面试下方法，拿到Bean工厂对象直接操作，第二种就是通过配置文件添加自定义BeanFactoryPostProcessor，由Spring容器管理
		super.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());

		beanFactory.setParentBeanFactory(null);
	}
}

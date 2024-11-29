package center.helloworld.c6_factoryBean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author zhishun.cai
 * @date 2024/11/22
 */
public class MyFactoryBean implements FactoryBean<Cat> {


	@Override
	public Cat getObject() throws Exception {
		Cat cat = new Cat();
		cat.name = "小白";
		return cat;
	}

	@Override
	public Class<?> getObjectType() {
		return Cat.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}

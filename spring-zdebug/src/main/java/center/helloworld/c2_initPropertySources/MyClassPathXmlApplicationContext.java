package center.helloworld.c2_initPropertySources;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhishun.cai
 * @date 2024/11/12
 */
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {


	public MyClassPathXmlApplicationContext(String... configLocation) {
		super(configLocation);
	}


	@Override
	protected void initPropertySources() {
		/**
		 * 环境中需要这个变量，不然在后面环境校验时会报错（如果你后面一定用到环境里的变量可以再这里指定）
		 */
		getEnvironment().setRequiredProperties("abc");
	}
}

package center.helloworld.c7_lookupMethod;

/**
 * @author zhishun.cai
 * @date 2024/11/27
 */
public class SingletonBean {

	public PrototypeBean getPrototypeBean() {
		// 这个方法会在运行时被Spring动态重写
		return null; // 实际不会被执行
	}

	public void performTask() {
		PrototypeBean prototypeBean = getPrototypeBean();
		System.out.println("PrototypeBean instance: " + prototypeBean);
	}
}

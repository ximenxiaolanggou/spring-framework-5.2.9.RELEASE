package center.helloworld.entity.b2;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author zhishun.cai
 * @create 2023/5/17
 * @note
 */
public class User implements ApplicationContextAware {

    public ApplicationContext applicationContext = null;

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void init() {
        System.out.println("name:" + getName() + ", age:" + age);
    }

	@Override
	public String toString() {
		return "User{" +
				"applicationContext=" + applicationContext +
				", name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	@Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}

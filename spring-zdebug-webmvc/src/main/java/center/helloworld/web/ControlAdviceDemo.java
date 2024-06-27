package center.helloworld.web;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhishun.cai
 * @create 2024/6/25
 * @note
 */
@ControllerAdvice
public class ControlAdviceDemo {

	@ModelAttribute(name = "md")
	public Map<String, Object> md() {
		HashMap<String, Object> resMap = new HashMap<>();
		resMap.put("username", "张三");
		resMap.put("age", 12);
		return resMap;
	}

	@ExceptionHandler
	public void CAe1(NullPointerException e) {
		System.out.println("e1~~~~~~~");
	}
}

package center.helloworld.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhishun.cai
 * @create 2024/6/21
 * @note
 */

@Controller
@RequestMapping("/testBinder")
public class TestInitBinderController {

	@GetMapping
	public String t1() {
		return "success";
	}

	@InitBinder
	public void initBinderTest() {

	}

}

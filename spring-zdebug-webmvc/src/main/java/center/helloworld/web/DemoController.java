package center.helloworld.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.Date;

/**
 * @author zhishun.cai
 * @create 2024/6/11
 * @note
 */

@Controller
@RequestMapping("/demo")
public class DemoController {

	@PostConstruct
	public void init() {
		System.out.println("init");
	}

	@GetMapping("/handle01")
	public String handle01(Model model){
		Date date = new Date();
		model.addAttribute("date", date);
		return "success";
	}

}

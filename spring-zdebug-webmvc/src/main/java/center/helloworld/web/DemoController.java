package center.helloworld.web;

import center.helloworld.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.PostConstruct;
import java.awt.*;
import java.beans.PropertyChangeListener;
import java.beans.PropertyEditor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

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

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		dataBinder.registerCustomEditor(Date.class, new PropertyEditor() {
			private String oldStr;
			@Override
			public void setValue(Object value) {
				System.out.println(value);
			}

			@Override
			public Object getValue() {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				try {
					return sdf.parse(oldStr);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				return null;
			}

			@Override
			public boolean isPaintable() {
				return false;
			}

			@Override
			public void paintValue(Graphics gfx, Rectangle box) {

			}

			@Override
			public String getJavaInitializationString() {
				return null;
			}

			@Override
			public String getAsText() {
				return null;
			}

			@Override
			public void setAsText(String text) throws IllegalArgumentException {
				oldStr = text;
			}

			@Override
			public String[] getTags() {
				return new String[0];
			}

			@Override
			public Component getCustomEditor() {
				return null;
			}

			@Override
			public boolean supportsCustomEditor() {
				return false;
			}

			@Override
			public void addPropertyChangeListener(PropertyChangeListener listener) {

			}

			@Override
			public void removePropertyChangeListener(PropertyChangeListener listener) {

			}
		});
	}

	@GetMapping("/handle01")
	public String handle01(Date data, Map<String, Object> map){
//		model.addAttribute("date", data);
		Object o = null;
		o.toString();
		return "success";
	}

	@GetMapping("/handle02")
	@ResponseBody
	public User handle02(Date data, Map<String, Object> map){
//		model.addAttribute("date", data);
		return new User();
	}

	@ExceptionHandler
	public void e1(NullPointerException e) {
		System.out.println("e1~~~~~~~");
	}

	@GetMapping("uploadPage")
	public String uploadPage(Model model) {
		Date date = new Date();
		model.addAttribute("date", date);
		return "upload";
	}

	@PostMapping("upload")
	public String upload(MultipartFile file) {
		return "uploadsuccess";
	}


	@GetMapping("/test1")
	public String test1(Model model){
		Date date = new Date();
		model.addAttribute("date", date);
		return "success";
	}


	@GetMapping("/test2")
	public String test2(Model model){
		Date date = new Date();
		model.addAttribute("date", date);
		return "success";
	}

}

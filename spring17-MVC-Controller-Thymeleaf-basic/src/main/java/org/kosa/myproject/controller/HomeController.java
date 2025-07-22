package org.kosa.myproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String home(Model model) {
		// View로 데이터를 공유 : request.setAttribute("result",""); // 와 동일한 역할
		model.addAttribute("result","Hello SpringBoot Web Thymeleaf");
		// 보이진 않지만 viewResolver에 의해 src/main/resources/templates/index.html 실행
		return "index";
	}
}

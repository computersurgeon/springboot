package servicemgmt.core.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class Home {

	@RequestMapping("home")
	public String home() {
		return "fromHomeController of service management application";
	}
}

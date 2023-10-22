package com.Facebook.Facebook.clone;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class Facebookcontroller {
	@GetMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("/new_user")
	public String create_account() {
		return "create_account";
	}
	@GetMapping("/profile")
	public String Friend_Home() {
		return "Friend_Home";
	}

}

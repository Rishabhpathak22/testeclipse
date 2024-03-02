package com.example.requirement22jan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class studentcontroller {
	@GetMapping("/create")
	public String displayof() {
		return "createstudent";
	}
	@GetMapping("/read")
	public String displayof1() {
		return "readstudent";
	}
	@GetMapping("/update")
	public String displayof2() {
		return "updatestudent";
	}
	@GetMapping("/delete")
	public String displayof3() {
		return "deletestudent";
	}
}

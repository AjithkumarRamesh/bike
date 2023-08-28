package com.bike;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
@GetMapping("/getbike")
public String getbike() {
	return "ROYAL ENFIELD";
}
}

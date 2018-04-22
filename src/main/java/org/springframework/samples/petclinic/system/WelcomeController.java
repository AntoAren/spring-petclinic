package org.springframework.samples.petclinic.system;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class WelcomeController {

    @GetMapping("/")
    public String welcome() {
	int new_value=1;
		if (false)
			throw new NullPointerException();
		String _bad_basd_var="123";
        return "welcome";
    }
}

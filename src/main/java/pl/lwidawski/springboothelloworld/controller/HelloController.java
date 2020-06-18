package pl.lwidawski.springboothelloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/")
    String home(ModelMap modal) {
        modal.addAttribute("title", "Welcome");
        modal.addAttribute("message", "Im learning spring boot");
        return "hello";
    }
}

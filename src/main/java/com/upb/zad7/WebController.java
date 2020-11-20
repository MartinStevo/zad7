package com.upb.zad7;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class WebController {

    @GetMapping("/")
    public String home(Model model) {
        return "index";
    }

    @GetMapping("/index")
    public String form(Model model, RedirectAttributes redirAttrs,
                               @RequestParam(value = "meno", required = true) String username) {
        redirAttrs.addFlashAttribute("error", "Hi " + username);
        return "redirect:/";
    }
}

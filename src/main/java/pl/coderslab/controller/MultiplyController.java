package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class MultiplyController {
    @GetMapping("multiply/{number}")
    private String multiply(Model model, @PathVariable(name = "number") int number) {
        model.addAttribute("number", number);
        return "multiply";
    }
}

package pl.coderslab.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalTime;

@Slf4j
@Controller
public class HelloController {
    @GetMapping("/hello") //"ukośniuek można pominąć
    @ResponseBody
    public String helloWorld() {
        return "Hello World & Coderslab";
    }

    @GetMapping("helloView")
    public String helloView(Model model) {
        log.info("Starting helloView");

        LocalTime now = LocalTime.now();
        now = LocalTime.of(1,0);
        log.debug("Current time: {}", now);

        if (now.isAfter(LocalTime.of(8,0)) && now.isBefore(LocalTime.of(20,0))) {
            log.debug("Day mode");
            model.addAttribute("fontColor", "black");
            model.addAttribute("backgroundColor", "white");
        } else {
            log.debug("Night mode");
            model.addAttribute("fontColor", "white");
            model.addAttribute("backgroundColor", "black");
        }
        log.info("Moving to home.jsp");

        return "home";
    }

}

package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Controller
public class FreeTimeController {
    @GetMapping("freeTimeController")
    @ResponseBody
    public String freeTimeController() {
//        String time = "";
//        String date = "";
//        LocalDate nowDate = LocalDate.now();
        LocalDateTime nowDateTime = LocalDateTime.now();

        return nowDateTime.toString();
    }
}

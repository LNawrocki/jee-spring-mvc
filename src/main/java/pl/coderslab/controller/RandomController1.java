package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
@RequestMapping("random")
public class RandomController1 {

    @GetMapping("{max}")
    @ResponseBody
    public String getMaxRandpom(@PathVariable("max") int max) {
        int result = new    Random().nextInt(max) +1;
        return "Wylosowana liczba : " + result;
    }

    @GetMapping("{min}/{max}")
    @ResponseBody
    public String getMinMaxRandpom(@PathVariable("min") int min,
                                   @PathVariable("max") int max) {
        int result = new    Random().nextInt(max-min) + min;
        return "Wylosowana liczba : " + result;
    }

}


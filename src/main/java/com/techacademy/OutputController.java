package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OutputController {

    @PostMapping("/output")
    public String postForm(@RequestParam("previous") String valOut, Model model) {

        model.addAttribute("valOut", valOut);

        return "output";
    }

}

package kr.ac.kumoh.s20230176.w26w11thymeleafjava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SongController {
    @GetMapping("/songs/random")
    String getRandomSong(Model model) {
        model.addAttribute("songTitle", "Cosmic Echo");
        return "random";
    }
}

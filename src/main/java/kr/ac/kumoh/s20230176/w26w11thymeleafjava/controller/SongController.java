package kr.ac.kumoh.s20230176.w26w11thymeleafjava.controller;

import kr.ac.kumoh.s20230176.w26w11thymeleafjava.model.Song;
import kr.ac.kumoh.s20230176.w26w11thymeleafjava.service.SongService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class SongController {
    private final SongService service;
    @GetMapping("/songs/random")
    public String getRandomSong(Model model){
        model.addAttribute(
                "songTitle",
                service.getRandomSong()
                        .map(Song::title)
                        .orElse("노래 없음")
        );
        return "random";
    }
}

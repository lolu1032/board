package com.test.board.controller;

import com.test.board.dto.BoardDTO;
import com.test.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final BoardService service;
    @GetMapping("/")
    public String home(Model model) {
        List<BoardDTO> list = service.list();
        model.addAttribute("list",list);
        return "index";
    }
}

package com.test.board.controller;

import com.test.board.dto.BoardDTO;
import com.test.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class BoardController {

    private final BoardService service;
    @GetMapping("/save")
    public String save() {
        return "save";
    }
    @PostMapping("/save")
    public String saveForm(BoardDTO boardDTO) {
        service.save(boardDTO);
        System.out.println("boardDTO = " + boardDTO);
        return "index";
    }
}

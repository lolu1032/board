package com.test.board.controller;

import com.test.board.dto.BoardDTO;
import com.test.board.service.BoardService;
import com.test.board.vo.CriteriaVO;
import com.test.board.vo.PageMakerVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final BoardService service;
    @GetMapping("/")
    public String home(
            Model model,
            @RequestParam(value = "page",defaultValue = "1") int page,
            @RequestParam(value = "perPageNum", defaultValue = "10") int perPageNum
    ) {
        CriteriaVO cri = new CriteriaVO();
        cri.setPage(page);
        cri.setPerPageNum(perPageNum);
        List<BoardDTO> list = service.paging(cri);

        int totalCount = service.pageCount();
        PageMakerVO pageMaker = new PageMakerVO();
        pageMaker.setCri(cri);
        pageMaker.setTotalCount(totalCount);
        model.addAttribute("list",list);
        model.addAttribute("pageMaker", pageMaker);
        return "index";
    }
}

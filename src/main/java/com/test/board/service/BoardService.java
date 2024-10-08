package com.test.board.service;

import com.test.board.dao.BoardDAO;
import com.test.board.dto.BoardDTO;
import com.test.board.vo.CriteriaVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardDAO dao;

    public int save(BoardDTO boardDTO) {
        return dao.save(boardDTO);
    }

    public List<BoardDTO> list() {
        return dao.list();
    }

    public int pageCount() {
        return dao.pageCount();
    }
    public List<BoardDTO> paging(CriteriaVO cv) {
        return dao.paging(cv);
    }
}

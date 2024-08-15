package com.test.board.service;

import com.test.board.dao.BoardDAO;
import com.test.board.dto.BoardDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardDAO dao;

    public int save(BoardDTO boardDTO) {
        return dao.save(boardDTO);
    }
}

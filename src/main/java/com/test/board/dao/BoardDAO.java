package com.test.board.dao;

import com.test.board.dto.BoardDTO;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class BoardDAO {
    private final SqlSession sqlSession;

    public int save(BoardDTO boardDTO) {
        return sqlSession.insert("com.test.board.boardMapper.save",boardDTO);
    }
}

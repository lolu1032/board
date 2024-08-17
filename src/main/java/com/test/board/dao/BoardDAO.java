package com.test.board.dao;

import com.test.board.dto.BoardDTO;
import com.test.board.vo.CriteriaVO;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BoardDAO {
    private final SqlSession sqlSession;

    public int save(BoardDTO boardDTO) {
        return sqlSession.insert("com.test.board.boardMapper.save",boardDTO);
    }

    public List<BoardDTO> list() {
        return sqlSession.selectList("com.test.board.boardMapper.list");
    }

    public int pageCount() {
        return sqlSession.selectOne("com.test.board.boardMapper.pageCount");
    }
    public List<BoardDTO> paging(CriteriaVO cv) {
        return sqlSession.selectList("com.test.board.boardMapper.paging",cv);
    }
}

package com.test.board.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDTO {
    private int id;
    private String boardWriter;
    private String boardPass;
    private String boardTitle;
    private String boardContents;
}

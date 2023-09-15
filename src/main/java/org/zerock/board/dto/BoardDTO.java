package org.zerock.board.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardDTO {
    private Long bno;
    private String title;
    private String content;
    private String writerEmail;
    private String writername;
    private LocalDateTime regDate;
    private LocalDateTime modDate;
    private int replyCount;
}
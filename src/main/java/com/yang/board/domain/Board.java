package com.yang.board.domain;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "board_id")
    private Long id;

    @Column(length = 50, nullable = false)
    private String title;

    @Lob
    private String content;

    private LocalDateTime createdDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

}
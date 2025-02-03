package com.example.chat_example;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class ChatMessage {
    private long id;
    private LocalDateTime createDate;
    private String authorName;
    private String content;

    public ChatMessage(String authorName, String content) {
        this(1, LocalDateTime.now(),authorName, content);

    }
//    public ChatMessage(long id, LocalDateTime createDate, String authorName, String content) {
//        this.id = id;
//        this.createDate = createDate;
//        this.authorName = authorName;
//        this.content = content;
//        //@AllArgsConstructor 가 없으면 이런식으로 호출 해야한다
    }

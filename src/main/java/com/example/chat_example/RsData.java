package com.example.chat_example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RsData<T> {
    private String resultCode;
    private String msg;
    private T data;

    // 1. 제너릭을 사용하는이유 나중에 <T>(type) 타입을 정하려고 사용함
}

package com.haram.toy.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

<<<<<<< HEAD
@Getter
@RequiredArgsConstructor
public class HelloResponseDto {

    private final String name;
    private final int amount;

=======
@Getter //get 메소드를 실행해줌
@RequiredArgsConstructor //final 필드가 포함된 생성자를 생성해줌, final이 없는 필드는 생성되지 않는다.
public class HelloResponseDto {
    private final String name;
    private final int amount;
>>>>>>> 롬복 및 junit
}

package com.haram.toy.dto;

import com.haram.toy.web.dto.HelloResponseDto;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트() {
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then
        assertThat(dto.getName()).isEqualTo(name); //assertThat :검증 라이브러리의 검증 메소드, 검증하고싶은 대상을 인자로 받음
        assertThat(dto.getAmount()).isEqualTo(amount); // isEqualTo : 같을 때만 성공
    }
}

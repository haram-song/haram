package com.haram.toy.web.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {
   @Test
   public void 롬복_가능_테스트() {
       String name="테스트";
       int amount = 1000;

       HelloResponseDto dto = new HelloResponseDto(name, amount);

       assertThat(dto.getName()).isEqualTo(name);
       assertThat(dto.getAmount()).isEqualTo(amount);

   }

}

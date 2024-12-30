package lk.javaspringbootacademy.demo.dto;

import lombok.Builder;
import org.aspectj.internal.lang.annotation.ajcDeclareEoW;
import org.springframework.http.HttpStatus;

@Builder
public class ResponseDTO {

    public final Object data;

    public final String message;
    public final HttpStatus responseCode;


}
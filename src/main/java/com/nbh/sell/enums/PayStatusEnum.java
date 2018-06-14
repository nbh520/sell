package com.nbh.sell.enums;

import lombok.Getter;

/**
 * @author Nibohan
 * @date 2018-06-13  22:37
 */
@Getter
public enum PayStatusEnum {
    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功")
    ;
    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}

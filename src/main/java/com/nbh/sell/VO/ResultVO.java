package com.nbh.sell.VO;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * @author Nibohan
 * @date 2018-06-11  16:04
 */
@Data
public class ResultVO<T> {
    /* 错误码 */
    private Integer code;

    /* 提示信息 */
    private String message;

    /* 发挥的具体对象 */
    private T data;
}

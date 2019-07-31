package com.qf.springboot_mybatis.error;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Oulingcheng
 * @Date 2019/7/30
 */
@Data
@AllArgsConstructor
public class ResultBean<T> {

    private String respCode;
    private T data;
}

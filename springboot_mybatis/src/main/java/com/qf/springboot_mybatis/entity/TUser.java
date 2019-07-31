package com.qf.springboot_mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TUser {

    @NotNull
    private Long id;

    private String username;

    private String password;

    @Email(message = "邮箱格式不正确")
    private String email;

    @Pattern(regexp = "^1(3|4|5|6|7|8|9)\\d{9}$",message = "手机号码格式错误")
    private String phone;

    @Min(18)
    private Integer age;

}
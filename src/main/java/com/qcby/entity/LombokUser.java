package com.qcby.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wangkx
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LombokUser {
    private  int age;
    private  String name;
    private String sex;
}

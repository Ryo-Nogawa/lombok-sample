package com.example.lombok_sample.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    /** 名前 */
    private String name;
    /** 年齢 */
    private int age;
}

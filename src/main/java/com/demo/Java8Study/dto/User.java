package com.demo.Java8Study.dto;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Comparator;

@Data
@ToString
@Accessors(chain = true)
public class User {
    private String name;
    private Integer age;
}

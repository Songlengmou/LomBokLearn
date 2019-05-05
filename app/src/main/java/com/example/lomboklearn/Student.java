package com.example.lomboklearn;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data   // 包含了  @ToString, @EqualsAndHashCode, @Getter, @Setter, @RequiredArgsConstructor

@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Student {
    private String name;
    private int age;
}

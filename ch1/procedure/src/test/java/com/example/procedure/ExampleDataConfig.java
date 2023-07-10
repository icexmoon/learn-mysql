package com.example.procedure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : predicate
 * @Package : com.example.predicate
 * @ClassName : .java
 * @createTime : 2023/7/10 13:21
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@TestConfiguration
public class ExampleDataConfig {
    @Autowired
    private StudentGenerator studentGenerator;

    @Bean
    List<Student> students() {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            students.add(studentGenerator.nextVal());
        }
        return students;
    }
}

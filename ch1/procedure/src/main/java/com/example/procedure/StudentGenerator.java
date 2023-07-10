package com.example.procedure;

import com.example.procedure.generator.Generator;
import com.example.procedure.generator.LevelGenerator;
import com.example.procedure.generator.NameGenerator;
import com.example.procedure.generator.ScoreGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : predicate
 * @Package : com.example.predicate
 * @ClassName : .java
 * @createTime : 2023/7/10 13:22
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@Component
public class StudentGenerator implements Generator<Student> {
    @Autowired
    private LevelGenerator levelGenerator;
    @Autowired
    private NameGenerator nameGenerator;
    @Autowired
    private ScoreGenerator scoreGenerator;

    @Override
    public Student nextVal() {
        return Student.builder()
                .name(nameGenerator.nextVal())
                .level(levelGenerator.nextVal())
                .averageScore(scoreGenerator.nextVal())
                .build();
    }
}

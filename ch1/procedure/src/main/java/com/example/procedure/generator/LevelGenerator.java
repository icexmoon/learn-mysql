package com.example.procedure.generator;

import com.example.procedure.Student;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : predicate
 * @Package : com.example.predicate
 * @ClassName : .java
 * @createTime : 2023/7/10 13:14
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@Component
public class LevelGenerator implements Generator<Student.Level> {
    private static Random random = new Random();
    private static Student.Level[] levels = Student.Level.values();

    @Override
    public Student.Level nextVal() {
        int pos = random.nextInt(levels.length);
        return levels[pos];
    }
}

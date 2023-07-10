package com.example.procedure.generator;

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
 * @createTime : 2023/7/10 13:18
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@Component
public class ScoreGenerator implements Generator<Integer> {
    private static final int MAX_SCORE = 100;
    private static final int MIN_SCORE = 0;
    private static Random random = new Random();

    @Override
    public Integer nextVal() {
        int score = random.nextInt(MAX_SCORE - MIN_SCORE + 1) + MIN_SCORE;
        return score;
    }
}

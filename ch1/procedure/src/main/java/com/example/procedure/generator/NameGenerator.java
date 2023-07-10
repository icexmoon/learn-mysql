package com.example.procedure.generator;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : predicate
 * @Package : com.example.predicate
 * @ClassName : .java
 * @createTime : 2023/7/10 13:08
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@Component
public class NameGenerator implements Generator<String> {
    private static List<String> names = List.of("Tom", "icexmoon", "BrusLee", "Harry", "JackChen",
            "Jimmy", "LiLei", "XiaoMing", "Adam", "Alex", "Alan",
            "Ben", "Bill", "Blake", "Bobby", "Brandon", "Tomas",
            "Brown", "Bruce", "Carl", "Clark", "Daniel",
            "Dick", "Douglas", "Eddie", "Edison", "Edward",
            "Edwin", "Evan", "Ford", "Francis", "Frank");
    private int index = 0;

    @Override
    public String nextVal() {
        index = index % names.size();
        String name = names.get(index);
        index++;
        return name;
    }
}

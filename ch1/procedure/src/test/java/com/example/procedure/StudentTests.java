package com.example.procedure;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.procedure.ProcedureCall;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : 魔芋红茶
 * @version : 1.0
 * @Project : predicate
 * @Package : com.example.predicate
 * @ClassName : .java
 * @createTime : 2023/7/10 13:27
 * @Email : icexmoon@qq.com
 * @Website : https://icexmoon.cn
 * @Description :
 */
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@SpringBootTest
@Import(ExampleDataConfig.class)
public class StudentTests {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private SessionFactory sessionFactory;
    private Session session;

    @BeforeEach
    void beforeEach(@Autowired List<Student> students) {
        studentRepository.deleteAll();
        studentRepository.saveAll(students);
        session = sessionFactory.openSession();
    }

    @AfterEach
    void afterEach() {
        session.close();
    }

    @Test
    void test() {
        ProcedureCall showScoreAvg = session.createNamedStoredProcedureQuery("showScoreAvg");
        showScoreAvg.setParameter("cheat", true);
        showScoreAvg.setParameter("var_min_id", 1);
        showScoreAvg.setParameter("var_max_id", 300);
        showScoreAvg.execute();
        int averageScore = (int) showScoreAvg.getOutputParameterValue("var_avg_score");
        int sumScore = (int) showScoreAvg.getOutputParameterValue("var_sum_score");
        System.out.println("averageScore:%d, sumScore:%d".formatted(averageScore, sumScore));
    }
}

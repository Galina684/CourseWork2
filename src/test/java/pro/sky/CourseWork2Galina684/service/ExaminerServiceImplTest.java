package pro.sky.CourseWork2Galina684.service;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import pro.sky.CourseWork2Galina684.Question;
import pro.sky.CourseWork2Galina684.exceptions.AmountExceedsListSize;
import pro.sky.CourseWork2Galina684.interfaces.ExaminerService;
import pro.sky.CourseWork2Galina684.interfaces.QuestionService;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
class ExaminerServiceImplTest {
    @Mock
    private QuestionService questionService;
    @InjectMocks
    private ExaminerService out = new ExaminerServiceImpl();

    private final Question q1 = new Question("qu1", "answ1");
    private final Question q2 = new Question("qu2", "answ2");
    private final Question q3 = new Question("qu3", "answ3");
    private final Question q4 = new Question("qu4", "answ4");
    private final Question q5 = new Question("qu5", "answ5");


    @Test
    void getQuestions() {
        Set<Question> questions = new HashSet<>(List.of(q1, q2, q3, q4, q5));
        Mockito.when(questionService.getAll())
                .thenReturn(questions);

        assertThrows(AmountExceedsListSize.class, () -> out.getQuestions(6));
    }
}
package pro.sky.CourseWork2Galina684.service;

import org.junit.jupiter.api.Test;
import pro.sky.CourseWork2Galina684.Question;
import pro.sky.CourseWork2Galina684.interfaces.QuestionService;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class JavaQuestionServiceTest {
private QuestionService out = new JavaQuestionService();
private Set<Question> questions = new HashSet<>();
private final Question q1 = new Question("qu1", "answ1");
private final Question q2 = new Question("qu2", "answ2");
private final Question q3 = new Question("qu3","answ3");
private final Question q4 = new Question("qu4","answ4");
private final Question q5 = new Question("qu5", "answ5");
private final Question q6 = new Question("qu6", "answ6");
private final Question q7 = new Question("qu7", "answ7");
private final Question q8 = new Question("qu8", "answ8");
private final Question q9 = new Question("qu9", "answ9");
private final Question q10 = new Question("qu10", "answ10");


    @Test
    void addQuestionAndAnswer() {
        String question = "вопрос";
        String answer = "отвтет";
       Question qTest = out.add(question, answer);
assertEquals(question,qTest.getQuestion());
assertEquals(answer,qTest.getAnswer());
    }

    @Test
    void addObjectQuestion() {
        questions.add(q1);
        questions.add(q2);
        questions.add(q3);
        assertFalse(questions.isEmpty());
        assertEquals(questions.size(), 3);


    }

    @Test
    void remove() {
        questions.add(q1);
        questions.add(q2);
        questions.add(q3);
        assertEquals(questions.size(),3);
        questions.remove(q1);
assertEquals(questions.size(),2);
assertFalse(questions.contains(q1));
assertThrows(IllegalArgumentException.class, () ->{out.remove(q1);});
    }

    @Test
    void getAll() {
        out.add(q1);
        out.add(q2);
        out.add(q3);
        Collection<Question> questions = out.getAll();
        assertFalse(questions.isEmpty());
        assertEquals(questions.size(), 3);

    }

}
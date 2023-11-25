package pro.sky.CourseWork2Galina684.service;

import org.springframework.stereotype.Service;
import pro.sky.CourseWork2Galina684.interfaces.ExaminerService;
import pro.sky.CourseWork2Galina684.Question;
import pro.sky.CourseWork2Galina684.interfaces.QuestionService;

import java.util.Collection;
import java.util.Random;
@Service

public class ExaminerServiceImpl implements ExaminerService {
    Random random;
    QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        return null;
    }
}

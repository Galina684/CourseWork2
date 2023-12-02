package pro.sky.CourseWork2Galina684.service;

import exceptions.AmountExceedsListSize;
import org.springframework.stereotype.Service;
import pro.sky.CourseWork2Galina684.interfaces.ExaminerService;
import pro.sky.CourseWork2Galina684.Question;
import pro.sky.CourseWork2Galina684.interfaces.QuestionService;

import java.util.*;

@Service

public class ExaminerServiceImpl implements ExaminerService {

    QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        Collection<Question> allQuestions = questionService.getAll();
        Set<Question> questionsForExaminer = new HashSet<>();
        int listAllQuestions = allQuestions.size();
        if(amount > listAllQuestions){
            throw new AmountExceedsListSize("Сумма запросов превышает размер списка");
        }
for ( int i = 0; i < amount; i ++){
    questionsForExaminer.add(questionService.getRandomQuestion());
}
return questionsForExaminer;
    }
}

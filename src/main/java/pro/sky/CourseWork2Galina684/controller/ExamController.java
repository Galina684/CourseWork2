package pro.sky.CourseWork2Galina684.controller;

import org.springframework.web.bind.annotation.RestController;
import pro.sky.CourseWork2Galina684.interfaces.ExaminerService;
import pro.sky.CourseWork2Galina684.Question;

import java.util.Collection;

@RestController
public class ExamController {
    ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }
    Collection<Question> getQuestions(int amount){
        return null;
    }
}

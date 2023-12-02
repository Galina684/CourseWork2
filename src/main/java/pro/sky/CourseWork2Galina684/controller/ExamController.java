package pro.sky.CourseWork2Galina684.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.CourseWork2Galina684.interfaces.ExaminerService;
import pro.sky.CourseWork2Galina684.Question;

import java.util.Collection;

@RestController
@RequestMapping("/exam")
public class ExamController {
    ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }
    @GetMapping(path = "/get/{amount}")
    Collection<Question> getQuestions(@PathVariable int amount){
        return examinerService.getQuestions(amount);
    }
}

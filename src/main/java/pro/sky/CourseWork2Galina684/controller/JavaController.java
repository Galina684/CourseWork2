package pro.sky.CourseWork2Galina684.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.CourseWork2Galina684.Question;
import pro.sky.CourseWork2Galina684.interfaces.QuestionService;

import java.util.Collection;

@RestController
@RequestMapping("/exam")
public class JavaController {
private final QuestionService service;

    public JavaController(QuestionService service) {
        this.service = service;
    }
    @GetMapping("/java/add")
public Question addQuestion(@RequestParam String question, @RequestParam String answer){

    return null;
}
    @GetMapping
    public Collection<Question> getQuestions() {
        return service.getAll();
    }
    @GetMapping("/java/remove")
public Question removeQuestion(@RequestParam String question, @RequestParam String answer){
        return null;
    }
}

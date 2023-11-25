package pro.sky.CourseWork2Galina684.service;

import org.springframework.stereotype.Service;
import pro.sky.CourseWork2Galina684.Question;
import pro.sky.CourseWork2Galina684.interfaces.QuestionService;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
public class JavaQuestionService implements QuestionService {
    Set<Question> questions;

    public JavaQuestionService(Set<Question> questions) {
        this.questions = new HashSet<>();
    }

    @Override
    public Question add(String question, String answer) {
        return null;
    }

    @Override
    public Question add(Question question) {
        return null;
    }

    @Override
    public Question remove(Question question) {
        return null;
    }

    @Override
    public Collection<Question> getAll() {
        return null;
    }

    @Override
    public Question getRandomQuestion() {
        return null;
    }
}

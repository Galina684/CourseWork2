package pro.sky.CourseWork2Galina684.interfaces;

import pro.sky.CourseWork2Galina684.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}

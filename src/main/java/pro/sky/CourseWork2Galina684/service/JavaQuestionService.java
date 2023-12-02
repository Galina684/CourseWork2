package pro.sky.CourseWork2Galina684.service;

import org.springframework.stereotype.Service;
import pro.sky.CourseWork2Galina684.Question;
import pro.sky.CourseWork2Galina684.interfaces.QuestionService;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionService {
   private Set<Question> questions;
   private Random random;

    public JavaQuestionService(Set<Question> questions) {

        this.questions = new HashSet<>();
        this.random = new Random();
    }

    @Override
    public Question add(String question, String answer) {

        questions.add(new Question(question, answer));
        return null;
    }

    @Override
    public Question add(Question question) {

        questions.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        if (questions.contains(question)){
            questions.remove(question);
        } else throw new IllegalArgumentException("Вопрос не найден");
        return question;
    }

    @Override
    public Collection<Question> getAll() {
        return questions;
    }

    @Override
    public Question getRandomQuestion() {
        if(!questions.isEmpty()){
            int randomQuestion = random.nextInt(questions.size());
            List<Question> questionList = new ArrayList<>(questions);
            return questionList.get(randomQuestion);
        } else  throw new IllegalArgumentException();
    }
}

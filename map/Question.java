package com.map;


import javax.persistence.*;
import java.util.List;

@Entity
public class Question {
    @Id
    @Column(name = "question_id")
    private int questionId;

    private String question;

     // One-to-One Mapping
//    @OneToOne
//    @JoinColumn(name = "a_id")
//    private Answer answer;
    @OneToMany(mappedBy = "question",fetch = FetchType.LAZY,cascade = CascadeType.ALL )
    private List<Answer>answers;

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public Question() {
        super();
    }

    public Question(int questionId, String question, List<Answer> answers) {
        this.questionId = questionId;
        this.question = question;
        this.answers = answers;
    }
}

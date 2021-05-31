package com.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
	@Column(name="QUESTION_ID") 
	private int questionId;
	private String question;
	@OneToOne(mappedBy = "ques")
	private QuestionAnswer QA;

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

	public QuestionAnswer getQA() {
		return QA;
	}

	public void setQA(QuestionAnswer qA) {
		QA = qA;
	}

	public Question(int questionId, String question, QuestionAnswer qA) {
		super();
		this.questionId = questionId;
		this.question = question;
		QA = qA;
	}

	public Question() {
		super();
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", QA=" + QA + "]";
	}
	
}

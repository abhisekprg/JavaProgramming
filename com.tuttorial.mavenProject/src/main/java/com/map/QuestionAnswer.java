package com.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class QuestionAnswer {
	@Id
	@Column(name="ANSWER_ID")
	private int answerId;
	
	
	private String answer;
	
	@OneToOne
	private Question ques;
	
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public QuestionAnswer(int answerId, String answer) {
		super();
		this.answerId = answerId;
		this.answer = answer;
	}
	public QuestionAnswer() {
		super();
		
	}

}

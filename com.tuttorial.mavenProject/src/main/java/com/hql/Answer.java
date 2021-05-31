package com.hql;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Answer {
	@Id
	@Column(name = "Answer_ID")
	private int aId;
	private String ans;
	
	/*
	 * @JoinTable(name="Ans_learn",joinColumns = { @JoinColumn (name="aId")},
	 * inverseJoinColumns = {@JoinColumn (name ="qId")})
	 */
	@ManyToMany
	private List<Question> question;

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}
 
	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	public List<Question> getQuestion() {
		return question;
	}

	public void setQuestion(List<Question> question) {
		this.question = question;
	}

	public Answer(int aId, String ans, List<Question> question) {
		super();
		this.aId = aId;
		this.ans = ans;
		this.question = question;
	}

	public Answer() {
		super();
	}

}

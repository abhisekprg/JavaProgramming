package com.hql;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Question {
	@Id
	@Column(name = "Question_ID")
	private int qId;
	private String ques;
	@ManyToMany(fetch=FetchType.EAGER)
	private List<Answer> A;

	public int getqId() {
		return qId;
	}

	public void setqId(int qId) {
		this.qId = qId;
	}

	public String getQues() {
		return ques;
	}

	public void setQues(String ques) {
		this.ques = ques;
	}

	public List<Answer> getA() {
		return A;
	}

	public void setA(List<Answer> a) {
		A = a;
	}

	public Question(int qId, String ques, List<Answer> a) {
		super();
		this.qId = qId;
		this.ques = ques;
		A = a;
	}

	public Question() {
		super();
	}
}

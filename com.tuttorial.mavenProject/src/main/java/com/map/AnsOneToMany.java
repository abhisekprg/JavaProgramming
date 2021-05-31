package com.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AnsOneToMany {
	@Id
	@Column(name="ANSWER_ID")
	private int ansId;
	
	private String answer;
	public int getAnsId() {
		return ansId;
	}
	public void setAnsId(int ansId) {
		this.ansId = ansId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public AnsOneToMany(int ansId, String answer) {
		super();
		this.ansId = ansId;
		this.answer = answer;
	}
	public AnsOneToMany() {
		super();
	}
	
}

package com.map;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class QuesOneToMany {
	@Id
	@Column(name="QUESTION_ID")
	private int QuesId;
	private String Question;
	
	@OneToMany
	private List<AnsOneToMany> ans;
	public int getQuesId() {
		return QuesId;
	}
	public void setQuesId(int quesId) {
		QuesId = quesId;
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public List<AnsOneToMany> getAns() {
		return ans;
	}
	public void setAns(List<AnsOneToMany> ans) {
		this.ans = ans;
	}
	public QuesOneToMany(int quesId, String question, List<AnsOneToMany> ans) {
		super();
		QuesId = quesId;
		Question = question;
		this.ans = ans;
	}
	public QuesOneToMany() {
		super();
	}
	
}

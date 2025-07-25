package com.mapping.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

//Many to many -> Bidirectional always
@Entity
	public class Answer {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		
		private String answer;
		
		@ManyToMany(mappedBy = "answerList")
		private List<Question> questionList;
		
//		public Answer() {
//			
//		}
//		
//		public Answer(String answer) {
//			this.answer=answer;
//	    }

		public int getId() {
			return id;
		}

		public List<Question> getQuestionList() {
			return questionList;
		}

		public void setQuestionList(List<Question> questionList) {
			this.questionList = questionList;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getAnswer() {
			return answer;
		}

		public void setAnswer(String answer) {
			this.answer = answer;
		}

		@Override
		public String toString() {
			return "Answer [id=" + id + ", answer=" + answer + ", questionList=" + "]";
		}
}

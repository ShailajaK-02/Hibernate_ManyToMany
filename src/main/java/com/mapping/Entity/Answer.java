package com.mapping.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
	public class Answer {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		
		private String answer;
		
		@ManyToMany(mappedBy = "answerList")
		private List<Question> questionList;
		
		public Answer() {
			
		}
		
		public Answer(String answer) {
			this.answer=answer;
	    }

		@Override
		public String toString() {
			return "Answer [id=" + id + ", answer=" + answer + ", questionList=" + "]";
		}
}

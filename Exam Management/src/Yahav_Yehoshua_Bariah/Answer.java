package Yahav_Yehoshua_Bariah;

import java.io.Serializable;
import java.util.Objects;

public class Answer implements Serializable {
	private hw3_Answer oldAns;

	public Answer(String content) {
		this.oldAns = new hw3_Answer(content);
	}

	public Answer() {
		this.oldAns = new hw3_Answer();
	}
		
	public void setContent(String content) {
		this.oldAns.hw3_setContent(content);
	}
	
	public hw3_Answer getHw3_Answer() {
		return this.oldAns;
	}

	public String getContent() {
		// Output: The function returns the content of the answer.
		return this.oldAns.hw3_getContent();
	}

	public boolean equals(Object other) {
		// Input: Object
		// Output: The function returns true if the objects are identical, else it
		// returns false.
		Answer ans = (Answer) other;
		return this.oldAns.hw3_equals(ans.getHw3_Answer());
	}

	@Override
	public int hashCode() {
		return this.oldAns.hw3_hashCode();
	}

	public String toString() {
		// Output: The function returns the content of the answer.
		return this.oldAns.hw3_toString();
	}
}

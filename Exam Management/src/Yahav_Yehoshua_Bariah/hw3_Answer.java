package Yahav_Yehoshua_Bariah;

import java.io.Serializable;
import java.util.Objects;

public class hw3_Answer implements Serializable {
	private String content;

	public hw3_Answer(String content) {
		this.content = content;
	}

	public hw3_Answer() {
		this.content = null;
	}
	
	public void hw3_setContent(String content) {
		this.content = content;
	}

	public String hw3_getContent() {
		// Output: The function returns the content of the answer.
		return this.content;
	}

	public boolean hw3_equals(Object other) {
		// Input: Object
		// Output: The function returns true if the objects are identical, else it
		// returns false.
		if (!(other instanceof hw3_Answer))
			return false;
		hw3_Answer ans = (hw3_Answer) other;
		return this.content.equals(ans.content);
	}

	public int hw3_hashCode() {
		return Objects.hash(this.content);
	}

	public String hw3_toString() {
		// Output: The function returns the content of the answer.
		StringBuffer res = new StringBuffer(this.content);
		return res.toString();
	}
}

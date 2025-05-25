package Yahav_Yehoshua_Bariah;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public abstract class FileExemable {
	public abstract void createFileE(ArrayList<Question> questionArr) throws FileNotFoundException;
	
	public abstract void createFileS(ArrayList<Question> arr) throws FileNotFoundException;
}

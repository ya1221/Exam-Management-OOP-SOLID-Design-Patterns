package Yahav_Yehoshua_Bariah;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class FacadeMainly {
	private Scanner input = new Scanner(System.in);
	private String nameSourceFile;
	private static FacadeMainly _instance = null;
	
	private FacadeMainly(String dataFile) {
		this.nameSourceFile = dataFile;
	}
	
	public static FacadeMainly getFacadeMainly(String dataFile) {
		if (_instance == null)
			_instance = new FacadeMainly(dataFile);
		return _instance;
	}

	public void getDataAndRun() throws IOException, ClassNotFoundException {
		ObjectInputStream inFile = new ObjectInputStream(new FileInputStream(nameSourceFile + ".dat"));
		SystemRepository s1 = (SystemRepository) inFile.readObject();
		//SystemRepository s1 = new SystemRepository();
		s1.counterValue();
		firstManu(s1);
		ObjectOutputStream outFile = new ObjectOutputStream(new FileOutputStream(this.nameSourceFile + ".dat"));
		outFile.writeObject(s1);
		outFile.close();
		inFile.close();
	}

	public void firstManu(SystemRepository s1) throws FileNotFoundException {
		int numFun;
		FacadeRepository facRep = new FacadeRepository();
		do {
			System.out.println(s1.toString() + "\nEnter the number of the function you want to perform."
					+ "\n1 - Create a test in a profession from the list." + "\n2 - Add a new profession to the list."
					+ "\n0 - Exit.");
			numFun = input.nextInt();
			switch (numFun) {
			case 1:
				facRep.RepositoryFunction(s1);
				break;
			case 2:
				facRep.addRepository(s1);
				break;
			case 0:
				System.out.println("Thank you, good day!");
				break;
			default:
				System.out.println("Invalid option");
				break;
			}
		} while (numFun != 0);
	}
}

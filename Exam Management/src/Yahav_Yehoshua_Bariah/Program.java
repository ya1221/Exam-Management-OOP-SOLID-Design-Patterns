package Yahav_Yehoshua_Bariah;

import java.io.IOException;

public class Program {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FacadeMainly facade = FacadeMainly.getFacadeMainly("SystemExem");
		facade.getDataAndRun();
	}
}
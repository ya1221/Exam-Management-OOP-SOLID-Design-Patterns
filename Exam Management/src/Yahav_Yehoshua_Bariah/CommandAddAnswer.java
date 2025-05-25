package Yahav_Yehoshua_Bariah;

import java.util.Scanner;

public class CommandAddAnswer implements Command{
	private GetInfoAddAnswer info;
	
	public CommandAddAnswer(GetInfoAddAnswer inf) {
		this.info = inf;
	}

	@Override
	public void execute(Scanner input, Repository repository) {
		this.info.addAnswerToRepository(input, repository);
	}
}

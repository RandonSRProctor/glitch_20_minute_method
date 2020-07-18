import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class TwentyMinuteMethod {

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("   Welcome to the");
		System.out.println("    ___   ____     __  ____             __          __  ___     __  __              __");
		System.out.println("   |__ \\ / __ \\   /  |/  (_)___  __  __/ /____     /  |/  /__  / /_/ /_  ____  ____/ /");
		System.out
				.println("   __/ // / / /  / /|_/ / / __ \\/ / / / __/ _ \\   / /|_/ / _ \\/ __/ __ \\/ __ \\/ __  /");
		System.out.println("  / __// /_/ /  / /  / / / / / / /_/ / /_/  __/  / /  / /  __/ /_/ / / / /_/ / /_/ /");
		System.out
				.println(" /____/\\____/  /_/  /_/_/_/ /_/\\__,_/\\__/\\___/  /_/  /_/\\___/\\__/_/ /_/\\____/\\__,_/");

		boolean firstTimeHere = askUserFirstTimeOrReturn();

		if (firstTimeHere) {
			giveTheSpiel();
		} else {
			System.out.println("Welcome back!  Let's get to it! \n");
		}

		System.out.print("List three 20-minute tasks that you would like to complete:\n1:");

		List<String> threeTasks = getThreeTasks();
		Collections.shuffle(threeTasks);

		System.out.println("\nWhat a wonderful list. Truly exceptional.\n\n"
				+ "Please press Enter when you are ready to begin your first task:");

		String nothing = input.nextLine(); // I'm assuming this is okay on it's own with no blank variable?

		for (int threeTasksIncrementingIndex = 0; threeTasksIncrementingIndex < threeTasks
				.size(); threeTasksIncrementingIndex++) {

			System.out.println("\nYou have 20 minutes to complete " + threeTasks.get(threeTasksIncrementingIndex)
					+ " starting now.\n " + "(I'll let you know when your time is up.)");
			System.out.print(" ");
			try {
				for (int i = 1; i <= 600; i++) {
					System.out.print("\bo");
					TimeUnit.SECONDS.sleep(1);
					System.out.print("\bO");
					TimeUnit.SECONDS.sleep(1);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();

			}

			if (threeTasksIncrementingIndex != threeTasks.size() - 1) {
				Toolkit.getDefaultToolkit().beep();
				System.out.println("\nTime's Up!  Ready for your next task?");
				input.nextLine();
			}
		}

		Toolkit.getDefaultToolkit().beep();
		System.out.println("\n\nThat's all of the tasks!  Look at all that you've accomplished!\n\n"
				+ "Go buy yourself a milkshake; you've earned it.\n\n");
		System.out.println("           ^^                   @@@@@@@@@");
		System.out.println("      ^^       ^^            @@@@@@@@@@@@@@@");
		System.out.println("                            @@@@@@@@@@@@@@@@@@              ^^");
		System.out.println("                           @@@@@@@@@@@@@@@@@@@@");
		System.out.println(" ~~~~ ~~ ~~~~~ ~~~~~~~~ ~~ &&&&&&&&&&&&&&&&&&&& ~~~~~~~ ~~~~~~~~~~~ ~~~");
		System.out.println(" ~         ~~   ~  ~       ~~~~~~~~~~~~~~~~~~~~ ~       ~~     ~~ ~");
		System.out.println("   ~      ~~      ~~ ~~ ~~  ~~~~~~~~~~~~~ ~~~~  ~     ~~~    ~ ~~~  ~ ~~ ");
		System.out.println("  ~  ~~     ~         ~      ~~~~~~  ~~ ~~~       ~~ ~ ~~  ~~ ~ ");
		System.out.println("~  ~       ~ ~      ~           ~~ ~~~~~~  ~      ~~  ~             ~~");
		System.out.println("   ~             ~        ~      ~      ~~   ~             ~");
	}

	private static List<String> getThreeTasks() {
		List<String> threeTasksHolder = new ArrayList<String>();

		threeTasksHolder.add(input.nextLine());

		System.out.print("2:");

		threeTasksHolder.add(input.nextLine());

		System.out.print("3:");

		threeTasksHolder.add(input.nextLine());

		return threeTasksHolder;
	}

	private static void giveTheSpiel() {
		System.out.println("Well, it's lovely to have you here!\n" + "Let me explain the premise to you (Press Enter)");
		input.nextLine();
		System.out.println(" Life involves a seemingly endless ammount of tasks;\n"
				+ " it can be difficult to know where to even start.");
		input.nextLine();
		System.out.println("  The 20 Minute Challenge is a simple routine to help you stay\n"
				+ "  productive when you are overwhelmed with to-dos.");
		input.nextLine();
		System.out.println("   The premise is simple: set aside one hour of your day to accomplish\n"
				+ "   three small tasks that only take 20 minutes to complete a piece.");
		input.nextLine();
		System.out.println("    By focusing on smaller tasks you will find that you are less\n"
				+ "    proned to feeling overwhelmed.");
		input.nextLine();
		System.out.println("     The tasks are presented in random order to counteract the impulse\n"
				+ "     to plan ahead.  Simply focus on one task at a time as they are presented.");
		input.nextLine();
		System.out.println("      When you are done with the hour, you will have three tasks\n"
				+ "      completed.  You will feel accomplished and proud.\n");
		input.nextLine();

		System.out.print("\033[H\033[2J");
		// ^^Many forums said this would clear my screen. It did not work for me, is
		// this an old format?
	}

	public static boolean askUserFirstTimeOrReturn() {

		System.out.println("\n\nIs this your first time here? (Y/N)");

		Boolean firstTimeHere = null;

		while (firstTimeHere == null) {

			String answer = input.nextLine();

			if (answer.toUpperCase().equals("Y") || answer.toUpperCase().equals("YES")) {
				firstTimeHere = true;

			} else if (answer.toUpperCase().equals("N") || answer.toUpperCase().equals("NO")) {
				firstTimeHere = false;

			} else {
				System.out.println("This is not a valid answer.  Please answer with a \"Y\" or an \"N\"\n");
				
			}
		}
		return firstTimeHere;
	}

}

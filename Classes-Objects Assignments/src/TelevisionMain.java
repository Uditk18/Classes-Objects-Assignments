
//Main class to test Television.java
import java.util.*;

public class TelevisionMain {

	public static void main(String[] args) {
		Television tv = new Television();

		Scanner sc = new Scanner(System.in);

		// Menu displayed on the screen || User have to choose
		System.out.println("What do you want to do? Press 0 to exit.");

		System.out.println("1. TURN ON THE TV");
		System.out.println("2. INCREASE THE VOLUME");
		System.out.println("3. DECREASE THE VOLUME");
		System.out.println("4. CHANGE THE CHANNEL");
		System.out.println("5. GET INFO ABOUT STATE OF TV");
		System.out.println("6. TURN OFF THE TV");
		int choice = sc.nextInt();

		// Menu will be displayed till 0 is pressed
		while (choice != 0) {

			switch (choice) {
			case 1:
				tv.tvState(true);
				System.out.println("TV is TURNED ON!! ");
				break;
			case 2:
				int vol1 = tv.changeVolumeIncrease(1);
				System.out.println("Volume is now : " + vol1);
				break;
			case 3:
				int vol2 = tv.changeVolumeDecrease(1);
				System.out.println("Volume is now : " + vol2);
				break;
			case 4:
				System.out.println("Press 1 or -1 to go to next/prev channel  or channel number to Jump to : ");
				int newch = sc.nextInt();
				int channel = tv.changeChannel(newch);
				System.out.println("You are now at channel : " + channel);
				break;
			case 5:
				System.out.println("Current state of TV is:\n");
				System.out.println("State: " + tv.getState());
				System.out.println("Volume: " + tv.getVolume());
				System.out.println("Channel: " + tv.getChannel());
				break;
			case 6:
				tv.tvState(false);
				System.out.println("TV is TURNED OFF!! ");
				break;

			}

			System.out.println("\nWhat do you want to do NEXT? Press 0 to exit.");
			System.out.println("1. TURN ON THE TV");
			System.out.println("2. INCREASE THE VOLUME");
			System.out.println("3. DECREASE THE VOLUME");
			System.out.println("4. CHANGE THE CHANNEL");
			System.out.println("5. GET INFO ABOUT STATE OF TV");
			System.out.println("6. TURN OFF THE TV\n");
			choice = sc.nextInt();

		}

	}

}
